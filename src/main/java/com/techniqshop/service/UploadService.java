package com.techniqshop.service;

import java.io.File;

import org.springframework.web.multipart.MultipartFile;

public interface UploadService {

	File save(MultipartFile multipartFile, String folder);

	
}
