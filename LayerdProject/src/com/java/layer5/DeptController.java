package com.java.layer5;

import com.java.layer2.Department;
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

}
}