package edu.practice.application.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.practice.application.model.User;
import edu.practice.application.service.AuthenticationService;

@Controller
//@RequestMapping(value = "/bootHR")
public class LoginController {

	private static final Logger LOGGER = Logger.getLogger(LoginController.class);

	@Autowired
	private AuthenticationService authenticationService;

	@RequestMapping(value = "/loginHome", method = RequestMethod.GET)
	public String loginPage(Model model) {

		LOGGER.debug("loginPage - Hit");

		model.addAttribute("user", new User());

		return "login";
	}

	@RequestMapping(value = "/homePage", method = RequestMethod.POST)
	public String loginHome(Model model, User user) {

		System.out.println("loginHome - Hit");

		authenticationService.authenticate(user);

		return "home";
	}

}
