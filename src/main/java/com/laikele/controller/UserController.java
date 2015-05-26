package com.laikele.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.laikele.dao.entity.User;
import com.laikele.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userBiz;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(ModelMap model) {
		if (null == model.get("username")) {
			model.addAttribute("tips", "please login first!");
			return "login";
		}

		String username = model.get("username").toString();
		User user = userBiz.selectUser(username);
		model.addAttribute("user", user);
		return "login";
	}

	@RequestMapping(value = "/saveuser", method = RequestMethod.POST)
	public String saveuser(@ModelAttribute("user") User user) {
		userBiz.saveUser(user);
		return "login";
	}
}
