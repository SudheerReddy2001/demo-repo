package com.demo1.entity;

import jdk.jfr.DataAmount;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;
@Entity
@Data
public class Project {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String employeeid;
    private String employeename;
    private String projectid;
    private String projectname;
    private String clientname;
    private String taskid;
    private String resourceassigmentid;
    private String taskname;
    private Date activitydate;
    private int activityeffort;
    private String activitydescription;
    private  String activitytype;
    private String status;
    private Date createdAt;
    private Date updatedAt;
    private String Approvedby;


}
