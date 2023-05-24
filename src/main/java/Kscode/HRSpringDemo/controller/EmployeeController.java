package Kscode.HRSpringDemo.controller;

import Kscode.HRSpringDemo.entity.Department;
import Kscode.HRSpringDemo.entity.Employee;
import Kscode.HRSpringDemo.service.DepartmentService;
import Kscode.HRSpringDemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/employees")
    public Employee insert(@RequestBody Employee employee){
        Employee inserted = employeeService.insert(employee);
        return inserted;
    }
    @PutMapping("/employees")
    public Employee update(@RequestBody Employee employee){
        return employeeService.update(employee);
    }
    @GetMapping("/employees")
    public List<Employee> findAll(){
        return employeeService.findAll();
    }
    @GetMapping("/employees/{id}")
    public Employee findById(@PathVariable Long id){
        return employeeService.findById(id);
    }
    @GetMapping("/EmpBydepId/{id}")
    public List<Employee> findByDepartmentId (@PathVariable Long id){
        return employeeService.findByDepartmentId(id);
    }
    @GetMapping("/EmpBydepName/{depName}")
    public List<Employee> findByDepartmentName (@PathVariable String depName){
        return employeeService.findByDepartmentName(depName);
    }



}
