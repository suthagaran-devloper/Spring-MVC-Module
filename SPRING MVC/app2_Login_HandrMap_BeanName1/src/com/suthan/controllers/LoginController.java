package com.suthan.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class LoginController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		String uname = request.getParameter("uname");
		String upwd = request.getParameter("upwd");
		
		ModelAndView mav = null;
		
		if(uname.equalsIgnoreCase("sutahn")&&upwd.equals("suthan")) {
			mav = new ModelAndView("success");
		}else
		{
			mav = new ModelAndView("failure");
		}
		
		return mav;
	}

}
