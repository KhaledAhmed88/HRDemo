package Kscode.HRSpringDemo.repository;
import Kscode.HRSpringDemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long> {

    List <Employee> findByDepartmentId (Long id);
    @Query("SELECT e FROM Employee e WHERE e.department.depName = :depName")
    List <Employee> findByDepartmentName (String depName);


}
