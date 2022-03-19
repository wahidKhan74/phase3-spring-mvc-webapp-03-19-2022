package com.simplilearn.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("/status")
	public ModelAndView indexMapping() {
		ModelAndView mv = new ModelAndView("response");
		mv.addObject("server","Spring MVC Server");
		mv.addObject("message", "Server is up & running !");
		return mv;
	}
	
	
	@RequestMapping("/hello")
	public ModelAndView helloMapping(@RequestParam(value="username") String username) {
		ModelAndView mv = new ModelAndView("response");
		mv.addObject("server",username);
		mv.addObject("message", "Hello User !");
		return mv;
	}
	
	@RequestMapping("/message")
	public ModelAndView messageMapping(@RequestParam(value="username") String username,
			@RequestParam(value="message") String message) {
		ModelAndView mv = new ModelAndView("response");
		mv.addObject("server",username);
		mv.addObject("message", message);
		return mv;
	}
}
