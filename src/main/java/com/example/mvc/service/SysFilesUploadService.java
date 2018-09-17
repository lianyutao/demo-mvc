package com.example.mvc.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
@Service
public interface SysFilesUploadService {
	 public String upload(List<MultipartFile> files);
}
