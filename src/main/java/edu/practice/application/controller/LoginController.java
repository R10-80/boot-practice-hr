package edu.practice.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import edu.practice.application.dao.CheckIdDAO;
import edu.practice.application.model.Department;
import edu.practice.application.model.Details;
import edu.practice.application.service.AuthenticationService;
import edu.practice.application.service.DepartmentService;
import edu.practice.exception.BootException;

@Controller
@SessionAttributes("department")
public class LoginController {

	@Autowired
	private AuthenticationService authenticationService;

	@Autowired
	private CheckIdDAO checkIdDAO;

	@Autowired
	private DepartmentService departmentService;

	@RequestMapping(value = "/loginHome", method = RequestMethod.GET)
	public String loginPage(Model model) {
		model.addAttribute("department", new Department());
		return "login";
	}

	@RequestMapping(value = "/checkLogin.html", params="checkLogin",method = RequestMethod.POST)
	public String checkLogin(@ModelAttribute("department") Department department, Model model) throws BootException {
		System.out.println("checkLogin.html - Hit " + department.getId());
		boolean result = authenticationService.authenticate(department.getId());
		if (result) {
			department.setDepartments(checkIdDAO.departments());
			model.addAttribute("department", department);
			model.addAttribute("departments", department.getDepartments());
			return "login";
		}
		return "login";
	}

	@RequestMapping(value = "/checkLogin.html", params="home",method = RequestMethod.POST)
	public String homeLogin(@ModelAttribute("department") Department department, Model model) throws BootException {

		model.addAttribute("deptName", department.getDepartments().get(department.getDeptId()));
		Details details = departmentService.getDetails(department.getDeptId());
		model.addAttribute("details", details);
		return "home";
	}

	@ExceptionHandler(BootException.class)
	public ModelAndView handleException(BootException ex) {

		ModelAndView model = new ModelAndView("exception");
		model.addObject("errCode", ex.getCode());
		model.addObject("errMsg", ex.getMessage());

		return model;

	}

}
