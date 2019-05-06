package cn.net.sinodata.config.shiro;

import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authc.credential.SimpleCredentialsMatcher;

import cn.net.sinodata.util.PwdUtil;


/**
 * 自定义shiro密码验证
 * @author pangpj
 * @date 2017-09-07
 *
 */
public class CustomCredentialsMatcher extends SimpleCredentialsMatcher {

	@Override
	public boolean doCredentialsMatch(AuthenticationToken authcToken, AuthenticationInfo info) {
		UsernamePasswordToken token = (UsernamePasswordToken) authcToken;
		Object tokenCredentials = PwdUtil.getPwd(String.valueOf(token.getPassword()));
		Object accountCredentials = getCredentials(info);
		return equals(tokenCredentials, accountCredentials);
	}
	
}







