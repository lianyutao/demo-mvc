package com.example.mvc.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.example.mvc.service.SysFilesUploadService;
import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataBodyPart;
import com.sun.jersey.multipart.FormDataMultiPart;

@RestController
public class UploadController {
	@RequestMapping(value="/api/upload",method = {RequestMethod.POST, RequestMethod.GET })
	 public String uploadFileFolder(
	             HttpServletRequest request,
	           @RequestParam("fileUploadForm") FormDataMultiPart fileUploadForm) {
		 StringBuffer buffer = new StringBuffer().append("\n\n\n");
		 List<FormDataBodyPart> filePartList = fileUploadForm.getFields("fileFolder");
	        if(null != filePartList){
	            for (FormDataBodyPart part : filePartList) {
	                InputStream inputStream = part.getValueAs(InputStream.class);
	                FormDataContentDisposition detail = part.getFormDataContentDisposition();
	                MediaType type = part.getMediaType();
	                String contentType = type.getType() + "/" + type.getSubtype();
	                  
	                String fileName = detail.getFileName();
	                System.out.println("1 "+fileName);
	                //截取第一个/之后的路径地址
	                int indexOf = fileName.indexOf("/");
	                if(indexOf > 0){
	                    fileName =  fileName.substring(indexOf);
	                    System.out.println("2 "+fileName);
	                }else{
	                    fileName =  fileName;
	                    System.out.println("3 "+fileName);

	                }
//	                File local = new File(fileName);
//	                FileOutputStream outStream = FileOutputStream(file);
	            }
	            }
		 return "";
	 }
  
	      
	    @Autowired  
	    private SysFilesUploadService sysFilesUploadService;  
	      
	    @RequestMapping(value="/sys/uploadFolder",method=RequestMethod.POST)  
	    @ResponseBody  
	    public String uploadFileFolder(HttpServletRequest request) {  
	  
	        MultipartHttpServletRequest params=((MultipartHttpServletRequest) request);   
	        List<MultipartFile> files = params.getFiles("fileFolder");  
	        String result = sysFilesUploadService.upload(files);  
	        return  result ;  
	       
	    }  
	      
}
