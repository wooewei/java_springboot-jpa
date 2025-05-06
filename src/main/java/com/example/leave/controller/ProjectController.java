package com.example.leave.controller;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.example.leave.model.dto.ProjectDTO;
import com.example.leave.model.entity.Project;
import com.example.leave.service.ProjectService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/project")
@Controller
public class ProjectController {
	
	@Autowired
	private ProjectService projectService;
	
	@GetMapping
	private String findAllProjects (ProjectDTO projectDTO, Model model) {
		List<ProjectDTO> projectDTOs = projectService.findAllProjectDTOs();
		model.addAttribute("projectDTOs", projectDTOs);
		return "project";
	}
	
	@PostMapping
	public String addProject(ProjectDTO projectDTO) {
		projectService.addProject(projectDTO);
		return "redirect:/project";
	}

}
