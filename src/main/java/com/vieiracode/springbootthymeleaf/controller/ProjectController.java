package com.vieiracode.springbootthymeleaf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.vieiracode.springbootthymeleaf.models.User;
import com.vieiracode.springbootthymeleaf.service.UserService;

@Controller
public class ProjectController {

	@Autowired
	UserService userService;

	@RequestMapping("/")
	public String index() {

		return "index";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView save(@ModelAttribute User user) {

		ModelAndView modelAndView = new ModelAndView();

		modelAndView.setViewName("user-page");
		modelAndView.addObject("user", user);
		userService.save(user);
		return modelAndView;
	}

}
