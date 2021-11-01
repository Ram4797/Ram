package com.example.demo.layer5;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.layer2.Department;
import com.example.demo.layer3.DepartmentRepositoryImpl;

@CrossOrigin
@RestController
@RequestMapping("/dept")
public class DeptController {

	@Autowired 
	DepartmentRepositoryImpl deptRepo;

	
	@RequestMapping("/hi")
	public String greet() {
		return "hello";
	}
//	@GetMapping(produces =  MediaType.APPLICATION_JSON_VALUE)
	@RequestMapping("/get/{dno}")
	public Department getDept(@PathVariable("dno") int x)
	{
		Department dept = null;
		dept=deptRepo.selectDepartment(x);
		System.out.println("controller : dept : "+dept.getDepartmentNumber());
		return dept;
	}
	
//	@GetMapping(produces =  MediaType.APPLICATION_JSON_VALUE)
	@RequestMapping("/getAll")
	public List<Department> getDepts()
	{
		System.out.println("getAll");
		List<Department> deptList;
		deptList=deptRepo.selectDepartments();
		return deptList;
	}
	
}
