package com.tuyano.springboot;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	String[] names = {"kim", "lee","park","choi","jo"};
	String[] mails = {"kim@aaa.com", "lee@aaa.com","park@aaa.com","choi@aaa.com","jo@aaa.com"};

	@RequestMapping("/")
	public String index() {
		return "index";
	}
	

}
