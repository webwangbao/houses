package com.webwangbao.house.biz.service;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.google.common.base.Strings;
import com.google.common.collect.Lists;
import com.google.common.io.Files;
/**
 * @author :wangbao02
 * @desc:文件操作
 * @date:2018/04/18
 */
@Service
public class FileService {
	
	@Value("${file.path:}")
	private String filePath;

	
	public List<String> getImgPaths(List<MultipartFile> files) {
	    if (Strings.isNullOrEmpty(filePath)) {
            filePath = getResourcePath();
        }
		List<String> paths = Lists.newArrayList();
		files.forEach(file -> {
			File localFile = null;
			if (!file.isEmpty()) {
				try {
					localFile =  saveToLocal(file, filePath);
					String path = StringUtils.substringAfterLast(localFile.getAbsolutePath(), filePath);
					String path1 = path.replaceAll("\\\\","/");
					paths.add(path1);
				} catch (IOException e) {
					throw new IllegalArgumentException(e);
				}
			}
		});
		return paths;
	}
	
	public static String getResourcePath(){
	  File file = new File(".");
	  String absolutePath = file.getAbsolutePath();
	  return absolutePath;
	}

	private File saveToLocal(MultipartFile file, String filePath2) throws IOException {
		long code = Instant.now().getEpochSecond();
	 File newFile = new File(filePath + "/" + code +"/"+file.getOriginalFilename());
	 if (!newFile.exists()) {
		 newFile.getParentFile().mkdirs();
		 newFile.createNewFile();
	 }
	 String filepath = "D:\\BiShe\\housev1.0\\house-web\\src\\main\\resources\\static\\static\\imgs";
	 File newfile1 = new File(filepath + "\\" + code +"\\"+file.getOriginalFilename());
	 if(!newfile1.exists()){
	 	newfile1.getParentFile().mkdirs();
	 	newfile1.createNewFile();
	 }
	 Files.write(file.getBytes(), newFile);
	 Files.write(file.getBytes(),newfile1);
     return newFile;
	}

}
