package com.personal.blog.pages;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/login")
public class LoginPageController {

	public static final String LOGIN_PAGE = "login/login";

	@RequestMapping( method = RequestMethod.GET)
	public String getLoginPage() {
		System.out.print(LOGIN_PAGE);
		return LOGIN_PAGE;
	}
}
