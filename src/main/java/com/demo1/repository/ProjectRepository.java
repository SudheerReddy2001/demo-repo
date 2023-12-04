package com.demo1.repository;

import com.demo1.entity.Project;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
    public Project findByemployeeid(String employeeid);
    public Project findByprojectid(String projectid);

}
