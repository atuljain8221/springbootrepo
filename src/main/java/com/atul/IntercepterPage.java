package com.atul;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class IntercepterPage extends HandlerInterceptorAdapter{

	
	 @Override
	 public boolean preHandle(HttpServletRequest request, 
			HttpServletResponse response, Object object) throws Exception {
		System.out.println("In preHandle we are Intercepting the Request");
		System.out.println("____________________________________________");
		String requestURI = request.getRequestURI();
		Integer personId = ServletRequestUtils.getIntParameter(request, "personId", 0);
		System.out.println("RequestURI::" + requestURI + 
				" || Search for Person with personId ::" + personId);
		System.out.println("____________________________________________");
		//throw new Exception();
		return true;
	 }

	 @Override
	 public void postHandle(HttpServletRequest request, HttpServletResponse response, 
			Object object, ModelAndView model)
			throws Exception {
		System.out.println("_________________________________________");
		System.out.println("In postHandle request processing "
				+ "completed by @RestController");
		System.out.println("_________________________________________");
	 }
	
}
