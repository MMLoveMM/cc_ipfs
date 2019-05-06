package cn.net.sinodata.controller;

import cn.net.sinodata.model.TUsers;
import cn.net.sinodata.service.TUsersService;
import org.apache.shiro.SecurityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({"/financing"})
public class FinancingController
{
  private final Logger logger = LoggerFactory.getLogger(FinancingController.class);

  @Autowired
  private TUsersService tUsersService;

  @RequestMapping({"/toIWantFinancing"})
  public String toIWantFinancing(Model model)
  {
    TUsers user = (TUsers)SecurityUtils.getSubject().getPrincipal();
    this.logger.info("用户[{}] - 跳转到我要融资页面", user.getUserid());

    TUsers tUser = this.tUsersService.selectByPrimaryKey(user.getId());

    model.addAttribute("customerInfoId", tUser.getCustomerInfoId());

    return "user_jsp/financing/i_want_financing";
  }
}