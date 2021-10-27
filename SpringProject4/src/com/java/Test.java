package com.java;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		ApplicationContext container = new ClassPathXmlApplicationContext("SpringConfig.xml");
		Car theCar = (Car) container.getBean("mycar");
		
		theCar.startCar();
		System.out.println();
		System.out.println("......Department.......");
		Department dept=(Department) container.getBean("mydept");
		Department dept1=(Department) container.getBean("mydept1");
		Department dept3=(Department) container.getBean("mydept3");
		
		System.out.println("DepatmentNo...."+dept1.getDepartmentno());
		System.out.println("Departmentname....."+dept1.getDepartmentname());
		System.out.println("DepartmentLocation..."+dept1.getDepartmentlocation());
		
		System.out.println("DepatmentNo...."+dept3.getDepartmentno());
		System.out.println("Departmentname....."+dept3.getDepartmentname());
		System.out.println("DepartmentLocation..."+dept3.getDepartmentlocation());
		
		
		System.out.println();
		System.out.println(".......Employee........");
		
		Employee emp=(Employee) container.getBean("myemp");
		emp.setEmployeeno(1);
		emp.setEmployeename("ram");
		emp.setEmployeelocation("pune");
		
		System.out.println("Employee..."+emp.getEmployeeno());
		System.out.println("Employee..."+emp.getEmployeename());
		System.out.println("Empoyee...."+emp.getEmployeelocation());
		
		System.out.println();
		
		Employee emp1=(Employee) container.getBean("myemp");
		emp1.setEmployeeno(2);
		emp1.setEmployeename("Fazil");
		emp1.setEmployeelocation("Aurangabad");
		
		System.out.println("Employee..."+emp1.getEmployeeno());
		System.out.println("Employee..."+emp1.getEmployeename());
		System.out.println("Empoyee...."+emp1.getEmployeelocation());
		System.out.println();
		
		Employee emp2=(Employee) container.getBean("myemp");
		emp2.setEmployeeno(3);
		emp2.setEmployeename("rushab");
		emp2.setEmployeelocation("Akola");
		
		System.out.println("Employee..."+emp2.getEmployeeno());
		System.out.println("Employee..."+emp2.getEmployeename());
		System.out.println("Empoyee...."+emp2.getEmployeelocation());
		
	}
}
