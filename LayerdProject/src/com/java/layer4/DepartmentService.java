package com.java.layer4;

import java.util.List;

import com.java.layer2.Department;

public interface DepartmentService {

	void createDepartmentService(Department dobj)throws DepartmentExits;
	List<Department> findAllDeptService();
	void modifyDepartmentService(Department dobj) throws DepartmentNotFoundException;
	
	void removeDepartmentService(int dno)throws DepartmentNotFoundException;

}
