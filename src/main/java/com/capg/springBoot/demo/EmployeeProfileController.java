package com.capg.springBoot.demo;

import io.swagger.annotations.ApiParam;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/profile/v1/employee")
public class EmployeeProfileController {

    List<Employee> employees = Arrays.asList(
            new Employee(1234L,"Sarang", "Electrical",9422139554L),
            new Employee(2245L,"Prem", "Mechanics",887799555L),
            new Employee(3356L,"Aish", "Electronics",987945624L),
            new Employee(5522L,"Anu", "Computer Tech",951129554L),
            new Employee(6688L,"zyan", "Information Tech",94887799L)
    );
    @GetMapping(value = "/fetch/all")
    public List<Employee> fetchAllEmployees(){
        return employees;
    }

    @GetMapping(value = "/fetch/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Employee fetchEmployeeByName(@ApiParam(value ="Employee Name") @PathVariable(value = "name")String name){
        return employees.stream().filter(x-> x.getName().equalsIgnoreCase(name)).findFirst().get();
    }

    @GetMapping(value = "/fetch/{department}")
    public List<Employee> fetchEmployeeByDepartment(@ApiParam(value ="Department Name") @PathVariable(value = "department")String department){
        return employees.stream().filter(x-> x.getDepartment().equalsIgnoreCase(department)).collect(Collectors.toList());
    }

    @PostMapping
    public Employee insertEmployee(@ApiParam(value = "Employee") @RequestBody Employee employee){ return employee;}

    @PutMapping
    public Employee updateEmployee(@ApiParam(value = "Employee") @RequestBody Employee employee){ return employee;}

    @DeleteMapping
    public Employee deleteEmployee(@ApiParam(value = "Employee") @RequestBody Employee employee){ return employee;}

    @PatchMapping
    public Object patchEmployee(@ApiParam(value = "Employee") @RequestBody Map<String , Object>partialUpdate){
        return partialUpdate;
    }

}
