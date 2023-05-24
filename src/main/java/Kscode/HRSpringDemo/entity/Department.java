package Kscode.HRSpringDemo.entity;


import com.fasterxml.jackson.annotation.*;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "HR_Departments")
@JsonIdentityInfo( generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")

public class Department {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "Department_Name")
    private String depName;

    public Department (){

    }

    public Department(String depName) {
        this.depName = depName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", depName='" + depName + '\'' +
                '}';
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
    @OneToMany(mappedBy = "department")
    private List<Employee> employees;
}
