package edu.practice.application.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/bootHR")
public class LoginController {

	private static final Logger LOGGER = Logger.getLogger(LoginController.class);

	@RequestMapping(value = "/loginHome", method = RequestMethod.GET)
	public String loginPage(Model model) {

		LOGGER.debug("loginPage - Hit");

		return "login";
	}

}
