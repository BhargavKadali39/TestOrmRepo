package com.nkxgen.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.nkxgen.spring.orm.model.ModuleDTO;
import com.nkxgen.spring.orm.service.ModuleService;

@Controller
public class ModuleController {

	ModuleService moduleService;

	@Autowired
	public ModuleController(ModuleService moduleService) {
		this.moduleService = moduleService;
	}

	@RequestMapping(value = "/module", method = RequestMethod.GET)
	public String getModule(Model m) {
		// Module module = new Module(1, "module-11", "module descjklpmcf", 11);
		System.out.println("modules page returnss");
		// m.addAttribute("mod", module);
		return "module";
	}

	@RequestMapping(value = "/createModule", method = RequestMethod.GET)
	public String Createmodule() {
		System.out.println("createModule jsp called");
		return "createModule";
	}

	@RequestMapping(value = "/moduleDetailsByProjId", method = RequestMethod.GET)
	public String getModuleDetailsByProjId(@RequestParam("projectId") Integer projectId, Model model) {
		System.out.println("moduleDetailsByProjId jsp called");
		System.out.println("projid " + projectId);
		List<ModuleDTO> modules = moduleService.getModuleByProjId(projectId);
		System.out.println("module data " + modules);
		model.addAttribute("moduleDTO", modules);
		return "moduleDetailsbyProjId";
	}
}