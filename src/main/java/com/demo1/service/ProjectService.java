package com.demo1.service;


import com.demo1.entity.Project;

import com.demo1.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    public Project getEmployeeActivityById(Long id) {
        return projectRepository.findById(id).get();
    }

    public Project getEmployeeActivityByemployeeid(String employeeid) {
        return projectRepository.findByemployeeid(employeeid);
    }

    public Project getEmployeeActivityByprojectid(String projectid) {
        return projectRepository.findByprojectid(projectid);
    }

    public Project createProject(Project Project) {
        Project.setCreatedAt(new Date());
        return projectRepository.save(Project);
    }

    public void deleteEmployeeActivity(Long id) {
        projectRepository.deleteById(id);
    }

    public Project updateEmployeeActivity(Long id, Project updateproject) {
        Project project = projectRepository.findById(id).get();
        project.setEmployeeid(updateproject.getEmployeeid());
        project.setEmployeename(updateproject.getEmployeename());
        project.setApprovedby(updateproject.getApprovedby());
        project.setUpdatedAt(new Date());
        Project project1 = projectRepository.save(project);
        return project1;
    }

    public List<Project> getAllEmployeeActivities(Integer pageNumber, Integer pageSize) {
        PageRequest pageRequest = PageRequest.of(pageNumber, pageSize);
        Page<Project> all = projectRepository.findAll(pageRequest);
        return all.getContent();
    }
}





