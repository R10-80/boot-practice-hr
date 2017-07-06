package edu.practice.application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

	@RequestMapping(value = "/loginHome", method = RequestMethod.GET)
	public String loginPage(Model model) {

		System.out.println("Hit");

		return "login";
	}

}
