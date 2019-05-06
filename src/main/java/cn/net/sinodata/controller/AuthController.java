package cn.net.sinodata.controller;


import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Date;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.ExcessiveAttemptsException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import cn.net.sinodata.model.TApplicationLog;
import cn.net.sinodata.model.TUsers;
import cn.net.sinodata.model.TUsersExample;
import cn.net.sinodata.model.tUserRoleKey;
import cn.net.sinodata.service.TApplicationLogService;
import cn.net.sinodata.service.TUserRoleService;
import cn.net.sinodata.service.TUsersService;
import cn.net.sinodata.util.ImageUtil;
import cn.net.sinodata.util.PwdUtil;
import cn.net.sinodata.util.RequestUtil;
import cn.net.sinodata.util.StringUtil;
import cn.net.sinodata.util.UuidUtil;


@Controller
public class AuthController {
	private static final Logger logger = LoggerFactory.getLogger(AuthController.class);
	
	  @Autowired
	  private TApplicationLogService tApplicationLogService;

	  @Autowired
	  private TUsersService tUsersService;

	  @Autowired
	  private TUserRoleService tUserRoleService;
	
	@RequestMapping(value="/auth/login", method = RequestMethod.GET)
	public String toLogin() {
		logger.debug("用户登录失败");
		
		if(SecurityUtils.getSubject().isAuthenticated()) {
			return "redirect:/index";
		}
		
		return "login";
	}
	
	@RequestMapping({"/auth/toUserIndex"})
	public String toUserIndex(){
	    return "user_jsp/user_index";
	}

	@RequestMapping({"/public/toUserIndex"})
	public String toUserIndex2(){
	    return "user_jsp/user_index";
	}
	
	/**
	 * 用户登录
	 * 
	 * @param request
	 * @param response
	 * @param username
	 *            用户名
	 * @param password
	 *            密码
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/public/login", method = RequestMethod.POST)
	public String login(HttpServletRequest request, HttpServletResponse response, String username, 
			String password, String verificationCode, Model model, RedirectAttributes redirectAttributes) {
		logger.info("用户[{}] - 开始登录", username);

	    if (StringUtil.isNotEmpty(verificationCode))
	    {
	      Session session = SecurityUtils.getSubject().getSession();
	      String imgcode = (String)session.getAttribute("imgCode");
	      if (!verificationCode.equalsIgnoreCase(imgcode)) {
	        redirectAttributes.addFlashAttribute("message", "验证码错误");

	        return "redirect:/public/toUserLogIn";
	      }

	    }

	    Subject currentUser = SecurityUtils.getSubject();
	    UsernamePasswordToken token = new UsernamePasswordToken(username, password);
	    try {
	      currentUser.login(token);

	      if (currentUser.isAuthenticated()) {
	        logger.info("用户[{}] - 登录认证通过", username);
	        logger.info("开始添加登录日志,添加账号为 - [{}]", username);

	        TUsers user = (TUsers)SecurityUtils.getSubject().getPrincipal();
	        TApplicationLog tApplicationLog = new TApplicationLog();
	        tApplicationLog.setId(UuidUtil.getUuid());
	        tApplicationLog.setModule("登录");
	        tApplicationLog.setOpetype("登录");
	        tApplicationLog.setOpecontent("登录");
	        tApplicationLog.setOpeperson(user.getUserid());
	        tApplicationLog.setOpename(user.getName());
	        tApplicationLog.setOpedate(new Date());
	        tApplicationLog.setOpeorg(user.getOrgansid());
	        tApplicationLog.setIp(RequestUtil.getIp(request));
	        int flag = this.tApplicationLogService.insertSelective(tApplicationLog);
	        if (flag < 1) {
	          logger.info("添加登录日志失败");
	        }

	        logger.info("添加登录日志成功,添加账号为 - [{}]", username);
	        if (StringUtil.isEmpty(verificationCode)) {
	          return "redirect:/index";
	        }
	        return "redirect:/userIndex";
	      }
	    }
	    catch (UnknownAccountException uae) {
	      logger.error("对用户[" + username + "] - 进行登录验证..验证未通过,未知账户");
	      redirectAttributes.addFlashAttribute("message", "未知账户");
	    } catch (IncorrectCredentialsException ice) {
	      logger.error("对用户[" + username + "] - 进行登录验证..验证未通过,错误的凭证");
	      redirectAttributes.addFlashAttribute("message", "密码不正确");
	    } catch (LockedAccountException lae) {
	      logger.error("对用户[" + username + "] - 进行登录验证..验证未通过,账户已锁定");
	      redirectAttributes.addFlashAttribute("message", "账户已锁定");
	    } catch (ExcessiveAttemptsException eae) {
	      logger.error("对用户[" + username + "] - 进行登录验证..验证未通过,错误次数过多");
	      redirectAttributes.addFlashAttribute("message", "用户名或密码错误次数过多");
	    }
	    catch (AuthenticationException ae) {
	      logger.error("对用户[" + username + "] - 进行登录验证..验证未通过,堆栈轨迹如下");
	      redirectAttributes.addFlashAttribute("message", "用户名或密码不正确");
	    }
	    token.clear();
	    if (StringUtil.isEmpty(verificationCode)) {
	      return "redirect:/auth/login";
	    }
	    return "redirect:/public/toUserLogIn";
	}
	
	@RequestMapping({"/public/toUserLogIn"})
	  public String toUserLogIn(){
	    logger.debug("用户登录失败");

	    if (SecurityUtils.getSubject().isAuthenticated()) {
	      return "redirect:/userIndex";
	    }

	    return "user_jsp/user_system/log_in";
	  }

	  @RequestMapping({"/public/createImg"})
	  public void createImg(HttpServletResponse response)
	  {
	    Object[] objs = ImageUtil.createImage(Integer.valueOf(74), Integer.valueOf(28), new Color(121, 136, 178));

	    Session session = SecurityUtils.getSubject().getSession();
	    session.setAttribute("imgCode", objs[0]);

	    response.setContentType("image/png");

	    OutputStream os = null;
	    try {
	      os = response.getOutputStream();
	      ImageIO.write((BufferedImage)objs[1], "png", os);
	    } catch (IOException e) {
	      logger.error("验证码图片传输错误！");
	      e.printStackTrace();
	    } finally {
	      try {
	        if (os != null)
	          os.close();
	      }
	      catch (IOException e) {
	        logger.error("验证码图片传输流关闭错误！");
	        e.printStackTrace();
	      }
	    }
	  }

	  @RequestMapping({"/public/toUserLogin"})
	  public String toUserLogin()
	  {
	    logger.info("跳转到用户注册页面");

	    return "user_jsp/user_system/login";
	  }

	  @RequestMapping({"/public/addLogin"})
	  @ResponseBody
	  public String addLogin(TUsers user)
	  {
	    logger.info("用户开始注册 - 注册账号为[{}]", user.getUserid());
	    TUsersExample example = new TUsersExample();
	    TUsersExample.Criteria criteria = example.createCriteria();
	    criteria.andUseridEqualTo(user.getUserid());
	    if (!this.tUsersService.selectByExample(example).isEmpty())
	    {
	      logger.info("账号[{}] - 已存在", user.getUserid());
	      return "账号[ " + user.getUserid() + " ]已存在";
	    }

	    String userId = UuidUtil.getUuid();

	    user.setId(userId);
	    user.setPassword(PwdUtil.getPwd(user.getPassword()));
	    user.setOrgansid("-1");
	    user.setStatus("0");
	    user.setUdate(new Date());
	    user.setEffectDate(new Date());
	    user.setNote("外网注册用户");

	    tUserRoleKey key = new tUserRoleKey();
	    key.setUserId(userId);
	    key.setRoleId("20171212115554854739404");

	    if ((this.tUsersService.insertSelective(user) < 1) || (this.tUserRoleService.insertSelective(key) < 1))
	    {
	      logger.info("添加[{}] - 用户失败", user.getUserid());
	      return "添加用户失败";
	    }

	    logger.info("添加[{}] - 用户成功", user.getUserid());
	    return "0";
	  }

	  @RequestMapping(value={"/auth/logout"}, method={org.springframework.web.bind.annotation.RequestMethod.GET})
	  public String logout(HttpSession session)
	  {
	    Subject currentUser = SecurityUtils.getSubject();
	    currentUser.logout();
	    return "redirect:/auth/login";
	  }

	  @RequestMapping(value={"/auth/logout2"}, method={org.springframework.web.bind.annotation.RequestMethod.GET})
	  public String logout2(HttpSession session)
	  {
	    Subject currentUser = SecurityUtils.getSubject();
	    currentUser.logout();
	    return "redirect:/public/toUserIndex";
	  }
}
