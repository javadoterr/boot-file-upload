package com.javadoterr.api.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller
public class FileUploadController {
	
	@GetMapping(path = "/")
	public String showUploadForm() {
		return "fileform";
	}
	
	@PostMapping(path = "/uploadImage")
	public String fileUpload(@RequestParam("profile") CommonsMultipartFile file,
									HttpSession httpSession, Model model) throws IOException {
		System.out.println(file.getName());
		System.out.println(file.getSize());
		System.out.println(file.getContentType());
		System.out.println(file.getOriginalFilename());
		System.out.println(file.getStorageDescription());
		
		byte[] data = file.getBytes();
		// we have to save this file to server
//		String path = httpSession.getServletContext().getRealPath("/")+file.getOriginalFilename(); //file uploaded in contextPath
		
//		files to uploaded in webapp/WEB-INF/uploadedFiles/file.name
		String path = httpSession.getServletContext().getRealPath("/")
				+"WEB-INF"+File.separator+"uploadedFiles"
				+File.separator+file.getOriginalFilename();
		
		FileOutputStream fos = new FileOutputStream(path);
		fos.write(data);
		fos.close();
		
		model.addAttribute("message", "uploaded successfully");
		model.addAttribute("filename", file.getOriginalFilename());
		
		return "filesuccess";
	}

}
