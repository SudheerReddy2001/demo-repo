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
    public List<Project> getAllEmployeeActivities(
            @RequestParam(value = "pageNumber", defaultValue = "0", required = false) Integer pageNumber,
            @RequestParam(value = "pageSize", defaultValue = "5", required = false) Integer pageSize
    ) {
        return projectService.getAllEmployeeActivities(pageNumber, pageSize);
    }

    @GetMapping("/{id}")
    public Project getEmployeeActivityById(@PathVariable Long id) {
        return projectService.getEmployeeActivityById(id);
    }

    @GetMapping("/email/{employeeid}")
    public Project getEmployeeActivityByEmail(@PathVariable String employeeid) {
        return projectService.getEmployeeActivityByemployeeid(employeeid);
    }

    @GetMapping("/project/{projectid}")
    public Project getEmployeeActivityByprojectid(@PathVariable String projectid) {
        return projectService.getEmployeeActivityByprojectid(projectid);
    }

    @PostMapping
    public Project createEmployeeActivity(@RequestBody Project project) {
        return projectService.createProject(project);

    }

    @DeleteMapping("{id}")
    public void deleteEmployeeActivity(@PathVariable Long id) {
        projectService.deleteEmployeeActivity(id);
    }

    @PutMapping("/{id}")
    public Project updateEmployeeActivity(@PathVariable Long id, @RequestBody Project updateproject) {
        return projectService.updateEmployeeActivity(id, updateproject);
    }
}

