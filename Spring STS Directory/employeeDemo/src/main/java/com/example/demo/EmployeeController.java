package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController("/employee")
public class EmployeeController {
	
	private final Map<Integer, Employee> employeeMap;
	
	public EmployeeController() {
		employeeMap = new HashMap<>();
	}

	@GetMapping("/getAllEmployees")
	public List<Employee> getAllEmployees(){
		return new ArrayList<>(employeeMap.values());
	}
	
	@GetMapping("/getEmployee")
	public void getEmployee(int id){
		if(employeeMap.containsKey(id)) {
			for(Employee e:employeeMap.values()) {
				if(e.getId() == id) {
					System.out.print("\nEmployee Details: "+e.getId()+"\t"+e.getName()+"\t"+e.getSalary());
				}
			}
		}
	}
	
	@GetMapping("/createEmployee")
	public void createEmployee(int id, String name, double salary) {
		Employee e = new Employee(id,name, salary);
	}
	
}
