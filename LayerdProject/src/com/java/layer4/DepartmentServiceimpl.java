package com.java.layer4;

import java.util.List;

import com.java.layer2.Department;
import com.java.layer3.DepartmentDAOimpl;

public class DepartmentServiceimpl implements DepartmentService {
	DepartmentDAOimpl dept=new DepartmentDAOimpl();

	public void createDepartmentService(Department dobj) {
		// TODO Auto-generated method stub
		dept.insertDepartment(dobj);
		System.out.println("DepartmentServiceimpl :  createDepartmentService");

	}
	public void createDepartmentService1(Department dobj)
	{
		System.out.println("=>createDepartmentService() started");
		dept.insertDepartment(dobj);
		System.out.println("DepartmentServiceimpl :createDepartmentService");
		System.out.println("=>createDepartmentService() finishe");
	}

	public List<Department> findAllDeptService() {
		// TODO Auto-generated method stub
		return dept.selectDepartment();
	}
	
	public void modifyDepartmentService(Department dobj) throws DepartmentNotFoundException
	{ Department dummyDept=dept.selectDepartment(dobj.getDepartmentNumber());
	     if(dummyDept==null) {
	    	 DepartmentNotFoundException dnfe=new DepartmentNotFoundException("This Department is modify"+dobj.getDepartmentNumber());
	    	 throw dnfe;
	     }
	     else
		dept.modifyDepartment(dobj);
		
	}
	
	public void removeDepartmentService(int dno) throws DepartmentNotFoundException
	
	{
		Department dummyDept=dept.selectDepartment(dno);
		if(dummyDept==null)
		{
			DepartmentNotFoundException dnfe=new DepartmentNotFoundException("This dept no is removed"+dno);
		}
		dept.removeDepartment(dno);
		
	}
	
	

}
