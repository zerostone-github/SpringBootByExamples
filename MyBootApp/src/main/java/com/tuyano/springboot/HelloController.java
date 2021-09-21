package com.tuyano.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/{num}")
	public ModelAndView index(@PathVariable int num, ModelAndView mav) {
		int res = 0;
		for (int i=0; i<num ; i++) {
			res += i;
		}
		mav.addObject("msg", "total: " + res);
		mav.setViewName("index");
		
		return mav;
	}
	

}
