package com.nkxgen.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nkxgen.spring.orm.model.Employee;
import com.nkxgen.spring.orm.model.T4_ProjectModules;
import com.nkxgen.spring.orm.model.T4_Projects;
import com.nkxgen.spring.orm.service.EmpService;
import com.nkxgen.spring.orm.service.ProService;
import com.nkxgen.spring.orm.service.T4_ProjectModuleService;

@Controller
public class EmpCRUDController {

	EmpService eserv;
	ProService pserv;
	T4_ProjectModuleService promodserv;
	// T4_ProjectsModuleRepository ProjectsModuleRepositoryserv;,T4_ProjectsModuleRepository t4ProjectsModuleRepository

	@Autowired
	public EmpCRUDController(EmpService empserv, ProService proserv, T4_ProjectModuleService promodsserv) {
		System.out.println("Here");
		eserv = empserv;
		pserv = proserv;
		promodserv = promodsserv;
		// ProjectsModuleRepositoryserv = t4ProjectsModuleRepository;
	}

	/**
	 * selects the Add New Employee view to render by returning its name.
	 */

	@RequestMapping(value = "/emplist", method = RequestMethod.GET)
	public String getAllEmployees(Model model) {
		System.out.println("Employees List JSP Requested");

		// get all employees from DAO
		List<Employee> empList = eserv.listAll();
		System.out.println(empList);
		// set it to the model
		model.addAttribute("elist", empList);

		// call the view
		return "emplist";
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getAllProjects(Model model) {
		System.out.println("Projects List JSP Requested");

		// get all employees from DAO
		List<T4_Projects> pList = pserv.listAll();
		System.out.println(pList);
		// set it to the model
		model.addAttribute("pList", pList);

		// call the view
		return "prolist";
	}

	@RequestMapping(value = "/modlbyid", method = RequestMethod.GET)
	public String getModuleById(Model model) {
		System.out.println("ModulebyId page JSP Requested");

		// get all employees from DAO
		List<T4_ProjectModules> pmidList = promodserv.listById(1);
		// List<T4_ProjectModules> projectModules = promodserv.getAllModulesByModlProjId(1);

		System.out.println(pmidList);
		// set it to the model
		model.addAttribute("pmidList", pmidList);

		// call the view
		return "modidlist";
	}

	@RequestMapping(value = "/newproj", method = RequestMethod.GET)
	public String getJsp(Model model) {
		// call the view
		return "newProj";
	}

	@RequestMapping(value = "/dynamicbut", method = RequestMethod.GET)
	public String dynamicProjs(Model model) {
		// System.out.println("Add New Emp JSP Requested");
		return "DynamicProj";
	}

	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String addNewEmpl(Model model) {
		System.out.println("Add New Emp JSP Requested");
		return "prod";
	}

	// @RequestMapping(value = "/test", method = RequestMethod.GET)
	// public String getsAllpo(Model model) {
	// // List<T4_ProjectModules> modules = T4_ProjectsModuleRepository.findBymodl_proj_id(12L);
	// T4_ProjectModulesRepository p;
	// List<T4_ProjectModules> modules = T4_ProjectModulesRepository.findByModlProjId((short) 1);
	// // System.out.println("modules \n" + modules);
	// return "prolist";
	// }

	@RequestMapping(value = "/addnewemp", method = RequestMethod.GET)
	public String addNewEmployee(Model model) {
		System.out.println("Add New Emp JSP Requested");
		return "newemp";
	}

	@RequestMapping(value = "/savenewemp", method = RequestMethod.POST)
	public String saveNewEmployee(@Validated Employee emp, Model model) {
		System.out.println("Save New Employee Page Requested");
		// get all employees from DAO
		eserv.add(emp);

		// set it to the model
		model.addAttribute("emp", emp);

		return "saveempsuccess";
	}
}