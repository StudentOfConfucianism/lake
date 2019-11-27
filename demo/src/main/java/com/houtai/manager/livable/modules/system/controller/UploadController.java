package com.houtai.manager.livable.modules.system.controller;

import java.io.File;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.houtai.manager.livable.utils.UploadUtil;
import com.houtai.manager.livable.utils.response.ResponseMessage;

/**
 * 上传控制器
 * 
 * @author 抓娃小兵
 */
@Controller
@RequestMapping("/admin/uploadController")
public class UploadController {
	
	@Autowired
	UploadUtil uploadUtil;

	// 处理文件上传
	@RequestMapping(value = "/uploadImg", method = RequestMethod.POST)
	@ResponseBody
	public Object uploadImg(@RequestParam("file") MultipartFile file, HttpServletRequest request) {
		String imgPath = null;
		if (file != null && !file.isEmpty()) {
			imgPath = request.getContextPath() + File.separator + uploadUtil.uploadImg(file);
		}
		return ResponseMessage.ok(imgPath);
	}

	// 处理文件上传
	@RequestMapping(value = "/uploadExcel", method = RequestMethod.POST)
	@ResponseBody
	public Object uploadExcel(@RequestParam("file") MultipartFile file, HttpServletRequest request) {
		String excelPath = null;
		if (file != null && !file.isEmpty()) {
			excelPath = uploadUtil.uploadExcel(file);
		}
		return ResponseMessage.ok(excelPath);
	}
	
	
}
