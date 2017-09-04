package edu.practice.application.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.practice.application.dao.CheckIdDAO;
import edu.practice.application.service.AuthenticationService;
import edu.practice.exception.BootException;

@Controller
public class LoginController {

	private static final Logger LOGGER = Logger.getLogger(LoginController.class);

	@Autowired
	private AuthenticationService authenticationService;

	@Autowired
	private CheckIdDAO checkIdDAO;

	@RequestMapping(value = "/loginHome", method = RequestMethod.GET)
	public String loginPage(Model model) {
		LOGGER.debug("loginPage - Hit");
		return "login";
	}

	@RequestMapping(value = "/checkLogin.html", method = RequestMethod.GET)
	public String checkLogin(Model model, Integer id) {
		System.out.println("checkLogin.html - Hit " + id);
		try {
			boolean result = authenticationService.authenticate(id);
			if(result){
            	return "login";
			}
		} catch (BootException e) {
			System.out.println("Exception!!");
		}
		return "somewhere";
	}

}
