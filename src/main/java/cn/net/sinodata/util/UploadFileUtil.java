package cn.net.sinodata.util;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.multipart.MultipartFile;

public class UploadFileUtil {
	
	public static Map<String, Object> uploadFile(MultipartFile file, HttpServletRequest request) {
		// 判断文件是否为空
		if (!file.isEmpty()) {
			try {
				String[] format = file.getOriginalFilename().split("[.]");
				// 文件保存路径
				String filePath = request.getSession().getServletContext().getRealPath("/") + "WEB-INF/template/upload_file"
						+ File.separator
						+ UUID.randomUUID().toString().replaceAll("-", "")
						+ "." + format[1];
				File saveFile = new File(filePath);
				if (!saveFile.getParentFile().exists()) {
					saveFile.getParentFile().mkdirs();
				}
				// 转存文件
				file.transferTo(saveFile);
				Map<String, Object> map = new HashMap<String, Object>();
				map.put("accName", format[0]);
				map.put("fileName", file.getOriginalFilename());
				map.put("fileType", format[1]);
				map.put("accessoryAdd", filePath);
				return map;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return new HashMap<String, Object>();
	}
}
