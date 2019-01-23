package com.example.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pojo.User;
import com.example.service.UserService;

@RestController
@RequestMapping("/")
public class HelloWorldController {
	private static final Log log=LogFactory.getLog(HelloWorldController.class);
	@Autowired UserService userService;
	@GetMapping
    public List<User> hello(){
		Map<String,Object> result=new HashMap<>();
		result.put("message", "hello world");
		result.put("message2", "hello world222");
        
		return userService.getUser();
    }
}
