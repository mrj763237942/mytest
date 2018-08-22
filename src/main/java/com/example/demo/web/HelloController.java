package com.example.demo.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HelloController {
	@Value("${com.name}")
	private String name;
	@Value("${com.title}")
	private String title;

	@RequestMapping("/")
	public String index(ModelMap map) throws Exception {
		throw new Exception("发生错误");
	}

	@ControllerAdvice
	class GlobalExceptionHandler {

		public static final String DEFAULT_ERROR_VIEW = "error";

		@ExceptionHandler(value = Exception.class)
		public ModelAndView defaultErrorHandler(HttpServletRequest request,
				Exception e) {
			ModelAndView mav = new ModelAndView();
			mav.addObject("exception", e);
			mav.addObject("url", request.getRequestURL());
			mav.setViewName(DEFAULT_ERROR_VIEW);
			return mav;
		}

	}
}
