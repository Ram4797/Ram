package com.example.demo;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.layer2.Department;
import com.example.demo.layer3.DepartmentRepositoryImpl;
@SpringBootTest
public class SpringOrm11ApplicationTest {
	@Autowired
	
	DepartmentRepositoryImpl deptRepo;
	
	 
	@Test
	void insertDeptTest()
	{
		Department dept=new  Department();
		dept.setDepartmentNumber(12);
		dept.setDepartmentName("coil3");
		dept.setDepartmentLocation("Nagpur4");
		
		deptRepo.insertDepartment(dept);
		
	      
	
		
	}
	
	@Test
	void selectDeptTest()
	{
		Department dept;
		dept=deptRepo.selectDepartment(37);
		System.out.println(dept.getDepartmentNumber());
		System.out.println(dept.getDepartmentName());
		System.out.println(dept.getDepartmentLocation());
		
		

		
	}
	
	@Test
	void selectAllDeptTest()
	{
		List<Department> deptList;
		deptList=deptRepo.selectDepartments();
		for(Department dept :deptList)
		{
			System.out.println(dept.getDepartmentNumber());
			System.out.println(dept.getDepartmentName());
			System.out.println(dept.getDepartmentLocation());
			
		}
		
		
		

		
	}
	
}
