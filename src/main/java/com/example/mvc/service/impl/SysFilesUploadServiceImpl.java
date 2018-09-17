package com.example.mvc.service.impl;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.mvc.service.SysFilesUploadService;
@Service
public class SysFilesUploadServiceImpl implements SysFilesUploadService {

	@Override
	public String upload(List<MultipartFile> files) {
		 BufferedOutputStream bos =null;  
         BufferedInputStream bis=null;  
         String Storage_PATH = "E:/test";
         try {  
             //遍历文件夹  
             for (MultipartFile mf : files) {  
                 if(!mf.isEmpty()) {  
                     String originalFilename = mf.getOriginalFilename();  
                     //格式限制，非wav格式的不上传  
                     if(!"wav".equals(originalFilename.substring(originalFilename.lastIndexOf(".")+1))) {  
                         continue;  
                     }  
                     String fileName=originalFilename.substring(originalFilename.lastIndexOf("/")+1);  
                     //为避免文件同名覆盖，给文件名加上时间戳  
                     int index = fileName.lastIndexOf(".");  
                     String firstName=fileName.substring(0, index);  
                     String lastName=fileName.substring(index);  
                     fileName=firstName+"_"+System.currentTimeMillis()+lastName;  
                     //读取文件  
                     bis=new BufferedInputStream (mf.getInputStream());  
                     //指定存储的路径  
                     bos=new BufferedOutputStream(new FileOutputStream  
                             (Storage_PATH+fileName));  
                     int len=0;  
                     byte[] buffer=new byte[10240];  
                     while((len=bis.read(buffer))!=-1){  
                         bos.write(buffer, 0, len);  
                     }  
                     //刷新此缓冲的输出流，保证数据全部都能写出  
                     bos.flush();  
                 }  
             }  
             bis.close();  
             bos.close();  
             return "ok";  
         } catch (FileNotFoundException e) {        
             e.printStackTrace();        
             return "error";        
         } catch (IOException e) {        
             e.printStackTrace();        
             return "error";            
         }  
	}

}
