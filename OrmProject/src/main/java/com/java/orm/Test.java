package com.java.orm;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Test {
public static void main(String[] args) 
{
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("MyJPA"); //this will read the persistence.xml file
	System.out.println("Got the EntityManagerFactory : "+entityManagerFactory);
	
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	System.out.println("Got the EntityManager :  "+entityManager);
	
	EntityTransaction entityTransaction = entityManager.getTransaction();
	System.out.println("Got the EntityTransaction : "+entityTransaction);
	
	entityTransaction.begin();
	
	Employee empObj = new Employee(); //detached from hibernate
	empObj.setEmployeeno(5);
	empObj.setEmployeename("Fazil");
	empObj.setEmployeeLocation("aug");
	empObj.setEmployeeDepartment("IT");
	
	
	entityManager.persist(empObj); //peristed object now : this will fire the insert query
	
	
entityTransaction.commit();
System.out.println("Object is persisted....�");

entityManager.close();
entityManagerFactory.close();
System.out.println("Resources closed...");
}
}
