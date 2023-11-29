package com.demo1.controller;

import com.demo1.entity.Project;
import com.demo1.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/demo")
public class ProjectController {

    @Autowired
   public ProjectService projectService;

    @GetMapping
    public List<Project> getAllEmployeeActivities() {
        return projectService.getAllEmployeeActivities();
    }

    @GetMapping("/{id}")
    public Project getEmployeeActivityById(@PathVariable Long id) {
        return projectService.getEmployeeActivityById(id);
    }
@PostMapping
    public Project createEmployeeActivity(@RequestBody Project project) {


        return projectService .createProject(project);

    }


}
