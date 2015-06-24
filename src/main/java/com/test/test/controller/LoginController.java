package com.test.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller  
@RequestMapping("login")

 public class LoginController {
	@RequestMapping(params = {"username","password"},method = { RequestMethod.POST,
			RequestMethod.GET })  
    public ModelAndView login(String username,String password)
    {    
        ModelAndView mav = new ModelAndView("succ");  
        mav.addObject("username",username);  
        mav.addObject("password",password);  
        return mav;   
   }  
} 

/*
public class LoginController {
	@RequestMapping(method = { RequestMethod.POST,
			RequestMethod.GET })  
    public ModelAndView login()
    {    
        ModelAndView mav = new ModelAndView("succ");   
        return mav;   
   }  
}*/