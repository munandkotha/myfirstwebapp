package com.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Service;

@Service
public class LoginService {

	public boolean validate(String uname, String pwd) {
		boolean uvalid = uname.equalsIgnoreCase("Munand");
		boolean pwdvalid = pwd.equalsIgnoreCase("blabla");
		return uvalid && pwdvalid;
	}

}
