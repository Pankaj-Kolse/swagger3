package com.capg.springBoot.demo;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

public class Employee implements Serializable {

    private static final Long serialVersionUID =1L;

    @ApiModelProperty(notes = "ID of the Employee",name ="id",required = true,value="1234L")
    private Long id;

    @ApiModelProperty(notes = "Name of the Employee",name ="name",required = true,value="Sarang")
    private String name;

    @ApiModelProperty(notes = "Department of the Employee",name ="department",required = true,value="Electrical")
    private String department;

    @ApiModelProperty(notes = "Phone Number of the Employee",name ="phoneNumber",required = true,value="9422139554L")
    private Long phoneNumber;

    public Employee(Long id,String name,String department,Long phoneNumber){
        this.id = id;
        this.name = name;
        this.department = department;
        this.phoneNumber = phoneNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
