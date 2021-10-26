package com.java.layer5;

import javax.security.auth.login.AccountNotFoundException;

import com.java.layer2.Department;
import com.java.layer4.DepartmentNotFoundException;
import com.java.layer4.DepartmentServiceimpl;

public class DeptController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       DepartmentServiceimpl deptservice=new DepartmentServiceimpl();
       Department deptobj=new Department();
       
     
       deptobj.setDepartmentNumber(22);
       deptobj.setDepartmentName("com");
       deptobj.setDepatmentLocation("pune");
       
       deptservice.createDepartmentService(deptobj);
     Department deptup=new  Department();
     deptup.setDepartmentName("IT");
     deptup.setDepartmentNumber(10);
     deptup.setDepatmentLocation("ny");
     try
     {
     deptservice.modifyDepartmentService(deptup);
     }
    catch (DepartmentNotFoundException e )   {
    	 System.out.println("problem "+e.getMessage());
     }
     try
     {
      deptservice.removeDepartmentService(2);
      System.out.println("...........");
      deptservice.removeDepartmentService(5);
     }
     catch(DepartmentNotFoundException e)
     {
    	 System.out.println("Proble :"+e.getMessage());
     }
	
	
}
}