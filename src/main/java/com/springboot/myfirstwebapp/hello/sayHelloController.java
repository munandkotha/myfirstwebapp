package com.springboot.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class sayHelloController {
	
	@RequestMapping("sayHello")
	@ResponseBody
	private String sayHello() {
		return "Hello from the rest!";
		
	}
	
	@RequestMapping("say-hello-jsp")
	private String sayHelloJsp(ModelMap model) {
		model.put("name", "Munand");
		model.put("JobTitle", "Sr. Software Engineer");
		return "sayHelloJsp";
		
	}
}
