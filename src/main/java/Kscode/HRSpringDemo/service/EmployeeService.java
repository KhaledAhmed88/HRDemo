package Kscode.HRSpringDemo.service;
import Kscode.HRSpringDemo.entity.Department;
import Kscode.HRSpringDemo.entity.Employee;
import Kscode.HRSpringDemo.repository.DepartmentRepo;
import Kscode.HRSpringDemo.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepo;

    public List<Employee> findAll(){
       return employeeRepo.findAll();
    }
    public Employee findById(Long id){
        return employeeRepo.findById(id).orElseThrow();
    }

    public List<Employee> findByDepartmentId (Long id){
        return employeeRepo.findByDepartmentId(id);
    }
    public List<Employee> findByDepartmentName (String depName){
        return employeeRepo.findByDepartmentName(depName);
    }
    public Employee insert(Employee employee){
        return employeeRepo.save(employee);
    }

    public Employee update(Employee employee){

       Employee current = employeeRepo.findById(employee.getId()).get();

       current.setName(employee.getName());
       current.setSalary(employee.getSalary());
       current.setDepartment(employee.getDepartment());

       return  employeeRepo.save(current);
    }
}
