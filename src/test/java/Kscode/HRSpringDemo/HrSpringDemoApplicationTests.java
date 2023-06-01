package Kscode.HRSpringDemo;

import Kscode.HRSpringDemo.entity.Employee;
import Kscode.HRSpringDemo.service.EmployeeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
class HrSpringDemoApplicationTests {
	@Autowired
	EmployeeService employeeService;
	@Test
	void findById() {
		Optional<Employee> employee = employeeService.findById(1);
	}

}
