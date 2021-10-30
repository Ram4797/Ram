package com.java.orm;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class EmployeeTest {

	public static void main(String[] args) 
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("MyJPA");
		System.out.println("entity manager factory : "+entityManagerFactory);
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		System.out.println("entity manager : "+entityManager);
		
		EntityTransaction transaction = entityManager.getTransaction();
		System.out.println("transaction : "+transaction);
		
		transaction.begin();
		System.out.println("Transaction started....");
		Employee emp=new Employee();
		System.out.println("Pojo Created");
		
		emp.setEmployeeno(1);
		emp.setEmployeename("Ram");
		emp.setEmployeeLocation("pune");
		emp.setEmployeeDepartment("com");
		System.out.println("POJO filled up..");
		entityManager.persist(emp);
		System.out.println("Persited...");
		
transaction.commit();
System.out.println("Committed...");
	}
}
