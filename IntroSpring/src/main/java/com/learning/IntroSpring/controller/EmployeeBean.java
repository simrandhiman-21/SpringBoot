package com.learning.IntroSpring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeBean {

    @Autowired
    private DepaartmentBean depaartmentBean;

//    //ways to inject DepartmentBean inside EmployeeBean
    @Autowired
    public EmployeeBean(DepaartmentBean department) {
        this.depaartmentBean = department;
    }
//
//    @Autowired
//    public void setDepartment(DepaartmentBean department) {
//        this.depaartmentBean = department;
//    }

//    public String showEmployeeDetails(){
//        System.out.println("Employee belongs to Department: " + depaartmentBean.getDepartmentName());
//    }
}
