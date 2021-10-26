package com.java.layer3;

import java.util.List;

import com.java.layer2.Department;

public interface DepartmentDAO 
{
	void insertDepartment(Department dobj);
	
		Department selectDepartment(int dno);
		List<Department>selectDepartment();
		
		void modifyDepartment(Department dobj);
		void removeDepartment(int dno);
}
