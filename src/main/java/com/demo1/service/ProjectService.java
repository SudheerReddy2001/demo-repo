package com.demo1.service;


import com.demo1.entity.Project;

import com.demo1.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ProjectService {
    @Autowired
    private ProjectRepository projectRepository;


    public List<Project> getAllEmployeeActivities() {
        return projectRepository.findAll();
    }

    public Project getEmployeeActivityById(Long id) {
        return projectRepository.findById(id).get();
    }

    public Project createProject(Project Project) {
        Project.setCreatedAt(new Date());
       return projectRepository.save(Project);


    }
}

