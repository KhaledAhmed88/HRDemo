package Kscode.HRSpringDemo.controller;

import Kscode.HRSpringDemo.entity.Department;
import Kscode.HRSpringDemo.entity.Employee;
import Kscode.HRSpringDemo.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class DepartmentController {

    @Autowired
    DepartmentService departmentService;

    @PostMapping("/departments")
    public Department insert(@RequestBody Department department){
        return departmentService.insert(department);
    }

    @PutMapping("/departments")
    public Department update(@RequestBody Department department){
        return departmentService.update(department);
    }

    @GetMapping("/departments")
    public List<Department> findAll(){
        return departmentService.findAll();
    }

    @GetMapping("/departments/{id}")
    public Department findById(@PathVariable Long id) {
        return departmentService.findById(id);
    }

}
