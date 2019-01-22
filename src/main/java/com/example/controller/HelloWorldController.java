package com.example.controller;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.tomcat.util.http.fileupload.FileUploadBase.IOFileUploadException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloWorldController {
	private static final Log log=LogFactory.getLog(HelloWorldController.class);
	@GetMapping
    public Map<String ,Object> hello(){
		Map<String,Object> result=new HashMap<>();
		result.put("message", "hello world");
		result.put("message2", "hello world222");
        
		return result;
    }
}
