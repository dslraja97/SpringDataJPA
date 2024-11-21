package com.learning.interceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class RequestLogInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		System.out.println("Inside PreHandle Methoud!" + request.getRequestURL());

		Long startTime = System.currentTimeMillis();

		request.setAttribute("startTime", startTime);
		String clientId = request.getParameter("clientId");
		if ("DineshLogan".equals(clientId)) {
			return true;
		} else {
			response.getWriter().print("Invalid clientId!");

			return false;
		}

	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView)
			throws Exception {
		System.out.println("Inside PostHandle Methoud!");
		Long endTime = System.currentTimeMillis();
		Long startTime = (Long) request.getAttribute("startTime");
		Long timeTaken = endTime - startTime;
		System.out.println("Total Time Taken: " + timeTaken);
		HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
	}

}
