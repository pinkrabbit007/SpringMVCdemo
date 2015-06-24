package com.test.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/test.do")
public class TestController {

	@RequestMapping(params = "act=test", method = { RequestMethod.POST,
			RequestMethod.GET })
	public ModelAndView testPage() {

		ModelAndView mav = new ModelAndView("index");
		mav.addObject("info", "new added info object");

		return mav;
	}
	
	@RequestMapping(params = "act=test2", method = { RequestMethod.POST,
			RequestMethod.GET })
	public ModelAndView testPage2() {

		ModelAndView mav = new ModelAndView("index2");
		mav.addObject("info", "testindex2");
		return mav;
	}
}
