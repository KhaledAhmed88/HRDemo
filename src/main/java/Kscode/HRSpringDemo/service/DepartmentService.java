package Kscode.HRSpringDemo.service;

import Kscode.HRSpringDemo.entity.Department;
import Kscode.HRSpringDemo.entity.Employee;
import Kscode.HRSpringDemo.repository.DepartmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentService {

    @Autowired
    DepartmentRepo departmentRepo;
    public List<Department> findAll(){
        return departmentRepo.findAll();
    }
    public Department findById(Long id){
        return departmentRepo.findById(id).orElseThrow();
    }

    public Department insert(Department department){
        return departmentRepo.save(department);
    }

    public Department update(Department department){

        Department current = departmentRepo.findById(department.getId()).get();
        current.setDepName(department.getDepName());
        return departmentRepo.save(current);
    }

}
