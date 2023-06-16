package org.team4.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ResourceController {

	@RequestMapping(value = "/resources", method = RequestMethod.GET)
	public String getAllEmployees(Model model) {
		System.out.println("resources List JSP Requested");

		return "ResourceHome";
	}

	@RequestMapping(value = "/FilterResource", method = RequestMethod.GET)
	public String addNewEmployee(Model model) {
		System.out.println("Filter jsp requested JSP Requested");
		return "FilterResource";
	}

	@RequestMapping(value = "/edit_resource", method = RequestMethod.GET)
	public String deleteEmployee(Model model) {
		System.out.println("update  JSP Requested");
		return "edit_resource";
	}

	@RequestMapping(value = "/AddResource", method = RequestMethod.GET)
	public String deleteEmploye(Model model) {
		System.out.println("update  JSP Requested");
		return "AddResource";
	}

}