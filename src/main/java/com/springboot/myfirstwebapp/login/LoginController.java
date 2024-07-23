package com.springboot.myfirstwebapp.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	
//	public LoginController(LoginService loginService) {
//		super();
//		this.loginService = loginService;
//	}

	@RequestMapping(value="login", method=RequestMethod.GET)
	private String login() {
		return "login";
	}
	
	@RequestMapping(value="login", method=RequestMethod.POST)
	private String welcome(@RequestParam String uname, 
			@RequestParam String pwd, 
			ModelMap model) {
		model.put("username", uname);
		boolean valid = loginService.validate(uname, pwd);
		if (!valid) return "login";
		return "welcome";
	}
}
