package cn.net.sinodata.util;

import java.security.NoSuchAlgorithmException;

/**
 * 密码相关工具
 * @author Pangpj
 */
public class PwdUtil {

	/**
	 * 密码加密方法
	 * @param data  密码明文
	 * @return		密码摘要
	 */
	public static String getPwd(String data){
		String salt;
		try {
			salt = SHAUtil.encrypt(data, SHAUtil.MD5);
			// sha256hash
			return SHAUtil.encrypt(data + salt, SHAUtil.SHA_256);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	 public static String getPwdEmailCode(){
		 int pwdEmailCode = (int)(Math.random()*1000000);
		 return ""+pwdEmailCode;
	 }
	
}
