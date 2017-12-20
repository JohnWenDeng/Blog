package com.personal.blog.pages;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/love")
public class LovePageController {

	public static final String DEFAULT_PAGE = "love/love";

	@RequestMapping( method = RequestMethod.GET)
	public String getLoginPage() {
		
		System.out.print(DEFAULT_PAGE);
		return DEFAULT_PAGE;
	}
}
