package cn.net.sinodata.util;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import cn.net.sinodata.vo.UploadFileVo;
import org.springframework.web.multipart.MultipartFile;

public class UploadFileUtil {
	
	public static Map<String, Object> uploadFile(MultipartFile file, HttpServletRequest request) {
		// 判断文件是否为空
		if (!file.isEmpty()) {
			try {
				Map<String, Object> savePath = saveFile(file, request);
				String[] format = (String[]) savePath.get("format");
				Map<String, Object> map = new HashMap<String, Object>();
				map.put("accName", format[0]);
				map.put("fileName", file.getOriginalFilename());
				map.put("fileType", format[1]);
				map.put("accessoryAdd", savePath.get("filePath").toString());
				return map;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return new HashMap<String, Object>();
	}

	public static UploadFileVo newUploadFile(MultipartFile file, HttpServletRequest request) {
		// 判断文件是否为空
		if (!file.isEmpty()) {
			try {
				Map<String, Object> savePath = saveFile(file, request);
				UploadFileVo uploadFileVo = new UploadFileVo();
				String[] format = (String[]) savePath.get("format");
				uploadFileVo.setAccName(format[0]);
				uploadFileVo.setFileName(file.getOriginalFilename());
				uploadFileVo.setFileType(format[1]);
				uploadFileVo.setFilePath(savePath.get("filePath").toString());
				return uploadFileVo;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return new UploadFileVo();
	}

	private static Map<String, Object> saveFile(MultipartFile file, HttpServletRequest request) {
		String[] format = file.getOriginalFilename().split("[.]");
		// 文件保存路径
		String filePath = request.getSession().getServletContext().getRealPath("/") + "static/template/upload_file"
				+ File.separator
				+ UUID.randomUUID().toString().replaceAll("-", "")
				+ "." + format[1];
		File saveFile = new File(filePath);
		if (!saveFile.getParentFile().exists()) {
			saveFile.getParentFile().mkdirs();
		}
		// 转存文件
		try {
			file.transferTo(saveFile);
		} catch (IOException e) {
			e.printStackTrace();
		}

		Map<String, Object> rtnMap = new HashMap<>();
		rtnMap.put("format", format);
		rtnMap.put("filePath", filePath);
		return rtnMap;
	}
}
