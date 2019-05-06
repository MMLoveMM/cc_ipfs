package cn.net.sinodata.util;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.apache.commons.codec.binary.Base64OutputStream;
import org.apache.commons.codec.digest.DigestUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SHAUtil {
	
	private final static Logger logger = LoggerFactory.getLogger(SHAUtil.class);
	
	public final static String MD5 = "MD5";  
	public final static String NONE = "NONE";  
	public final static String SHA_256 = "SHA-256";  
	public final static String SHA_512 = "SHA-512";  
	public final static String SHA_384 = "SHA-384";  
	
	
	/**
	 * 加密密码算法
	 * @param content	需要加密的内容 
	 * @param enType	加密类型	
	 * @return			加密后的结果
	 * @throws NoSuchAlgorithmException 当加密算法不可用时抛出此异常 
	 */
	@SuppressWarnings("deprecation")
	public static String encrypt(String content, String enType)
			throws NoSuchAlgorithmException {
		String newPass = null;
		if (enType == null || MD5.equals(enType)) {
			newPass = DigestUtils.md5Hex(content);
		} else if (NONE.equals(enType)) {
			newPass = content;
		} else if (SHA_256.equals(enType)) {
			newPass = DigestUtils.sha256Hex(content);
		} else if (SHA_384.equals(enType)) {
			newPass = DigestUtils.sha384Hex(content);
		} else if (SHA_512.equals(enType)) {
			newPass = DigestUtils.sha512Hex(content);
		} else {
			newPass = DigestUtils.shaHex(content);
		}
		return newPass;
	}  
	
	
	/**
	 * 加密密码算法，默认的加密算法是SHA_512 
	 * @param content 	需要加密的内容
	 * @return			SHA_512加密后的结果
	 */
	public static String encrypt(String content) {
		try {
			if (content != null && !"".equals(content)) {
				return encrypt(content, SHA_256);
			} else
				return null;
		} catch (NoSuchAlgorithmException nsae) {
			throw new RuntimeException("Security error: " + nsae);
		}
	}  
	 
	
	/** 
	 * 加密文件算法 
	 * @param filename 	需要加密的文件名 
	 * @param algorithm 	加密算法名 
	 */  
	public static void digestFile(String filename, String algorithm) {
		byte[] b = new byte[1024 * 4];
		int len = 0;
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			MessageDigest md = MessageDigest.getInstance(algorithm);
			fis = new FileInputStream(filename);
			while ((len = fis.read(b)) != -1) {
				md.update(b, 0, len);
			}
			byte[] digest = md.digest();
			StringBuffer fileNameBuffer = new StringBuffer(128)
			.append(filename).append(".").append(algorithm);
			fos = new FileOutputStream(fileNameBuffer.toString());
			OutputStream encodedStream = new Base64OutputStream(fos);
			encodedStream.write(digest);
			encodedStream.flush();
			encodedStream.close();
		} catch (Exception e) {
			logger.error("computing digest error -fileName:{} - error message:", filename, e);
		} finally {
			try {
				if (fis != null)
					fis.close();
			} catch (Exception ignored) {
				logger.error("close FileInputstream error - error message:", ignored);
			}
			try {
				if (fos != null)
					fos.close();
			} catch (Exception ignored) {
				logger.error("close FileOutputStream error - error message:", ignored);
			}
		}
	}  
}  

