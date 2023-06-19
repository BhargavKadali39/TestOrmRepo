package com.nkxgen.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nkxgen.spring.orm.model.ProjectDto;
import com.nkxgen.spring.orm.model.ProjectInput;
import com.nkxgen.spring.orm.model.User;
import com.nkxgen.spring.orm.service.ProjectService;
import com.nkxgen.spring.orm.service.ResourceService;

@RestController
public class ProjectController {
	private final ProjectService projectService;
	private final ResourceService resourceService;

	@Autowired
	public ProjectController(ProjectService projectService, ResourceService resourceService) {
		this.projectService = projectService;
		this.resourceService = resourceService;
	}

	@RequestMapping(value = "/projects", method = RequestMethod.GET)
	public String getAllProjects(Model model) {
		List<ProjectDto> projectDto = projectService.getAllProjects();
		System.out.println(projectDto);
		model.addAttribute("projectDto", projectDto);
		return "ProjectList";
	}

	@RequestMapping(value = "/savenewproject", method = RequestMethod.GET)
	public String setNewProjectData(@Validated ProjectInput projectInput, Model model) {
		System.out.println("this is mang value  " + projectInput.getProjectManager());
		projectService.setNewProject(projectInput);
		return "ProjectList";
	}

	@RequestMapping(value = "/projectDetails", method = RequestMethod.GET)
	public String projectDetails(@RequestParam("projectId") Integer projectId, Model model) {
		// Retrieve the selected sprint details from the database and add them to the model
		ProjectDto projectDto = projectService.getProjectById(projectId);
		model.addAttribute("projectDto", projectDto);
		System.out.println("here " + projectDto);
		// Return the appropriate view or redirect
		return "projectDetails"; // Replace with your desired view name
	}

	@RequestMapping(value = "/createproject", method = RequestMethod.GET)
	public String setNewProject(Model model) {
		System.out.println("add new project jsp called");
		List<User> allMngs = resourceService.getAllManagers();
		model.addAttribute("allMngs", allMngs);
		return "Addproject";
	}

}
