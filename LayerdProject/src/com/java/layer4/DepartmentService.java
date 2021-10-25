package com.java.layer4;

import java.util.List;

import com.java.layer2.Department;

public interface DepartmentService {

	void createDepartmentService(Department dobj);
	List<Department> findAllDeptService();
}
