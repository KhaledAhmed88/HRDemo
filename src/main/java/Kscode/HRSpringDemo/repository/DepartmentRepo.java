package Kscode.HRSpringDemo.repository;

import Kscode.HRSpringDemo.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepo extends JpaRepository<Department , Long> {

}
