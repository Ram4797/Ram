import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.Query;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.java.orm.Employee;

public class EmployeeTest {
	@Test
	public void testInsertDept() {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("MyJPA");
		System.out.println("entity manager factory : "+entityManagerFactory);
		
		
		Assertions.assertNotNull(entityManagerFactory);
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		System.out.println("entity manager : "+entityManager);
		
		Assertions.assertNotNull(entityManager);
		
		EntityTransaction transaction = entityManager.getTransaction();
		
		Assertions.assertNotNull(transaction);
		
		System.out.println("transaction : "+transaction);
		
		transaction.begin();
		System.out.println("Transaction started....");
		
				Employee emp = new Employee();
				System.out.println("POJO created...");
				
				emp.setEmployeeno(3);
				emp.setEmployeename("Rushab");
				emp.setEmployeeLocation("Shegaon");
				emp.setEmployeeDepartment("mechanical");
				System.out.println("POJO filled up..");
				
				entityManager.persist(emp);
				System.out.println("Persited...");
				
		transaction.commit();
		System.out.println("Committed...");
	}
	
	@Test
	public void deptUpdateTest() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("MyJPA");
		
		
		
	Assertions.assertNotNull(entityManagerFactory);
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		System.out.println("entity manager : "+entityManager);
		
	Assertions.assertNotNull(entityManager);
		
		EntityTransaction transaction = entityManager.getTransaction();
		
	Assertions.assertNotNull(transaction);
		
		System.out.println("transaction : "+transaction);
		
		transaction.begin();
		System.out.println("Transaction started....");
		
		Employee emp = null;
		System.out.println("null POJO created...");

		emp = entityManager.find(Employee.class,371);
		
	Assertions.assertNotNull(emp);
		
		System.out.println("employeeno "+emp.getEmployeeno());
		System.out.println("employeename"+emp.getEmployeename());
		System.out.println("EmployeeLocation "+emp.getEmployeeLocation());
		System.out.println("employeeDepartment "+emp.getEmployeeDepartment());
		
		emp.setEmployeename("CODING");
		emp.setEmployeeLocation("PENTAGON3");
		
		entityManager.merge(emp); // it will fire update query
		
		
		
		System.out.println("GOT THE POJO FROM DB..");
		System.out.println("RETRIEVED...");
		
		transaction.commit();
		System.out.println("Committed...");
				
		
	}
	
	@Test
	public void empDeleteTest() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("MyJPA");
		System.out.println("entity manager factory : "+entityManagerFactory);
		
		
	Assertions.assertNotNull(entityManagerFactory);
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		System.out.println("entity manager : "+entityManager);
		
	Assertions.assertNotNull(entityManager);
		
		EntityTransaction transaction = entityManager.getTransaction();
		
	Assertions.assertNotNull(transaction);
		
		System.out.println("transaction : "+transaction);
		
		transaction.begin();
		System.out.println("Transaction started....");
		
		Employee emp = null;
		System.out.println("null POJO created...");

		emp = entityManager.find(Employee.class,1);
		
	Assertions.assertNotNull(emp);
		
	System.out.println("employeeno "+emp.getEmployeeno());
	System.out.println("employeename"+emp.getEmployeename());
	System.out.println("EmployeeLocation "+emp.getEmployeeLocation());
	System.out.println("employeeDepartment "+emp.getEmployeeDepartment());
	
		entityManager.remove(emp); // it will fire update query
		
		
		
		System.out.println("GOT THE POJO FROM DB..");
		System.out.println("RETRIEVED...");
		
		transaction.commit();
		System.out.println("Committed...");
				
		
	}
	
	@Test
	public void empSelectTest() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("MyJPA");
		System.out.println("entity manager factory : "+entityManagerFactory);
		
		
	Assertions.assertNotNull(entityManagerFactory);
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		System.out.println("entity manager : "+entityManager);
		
	Assertions.assertNotNull(entityManager);
		
		EntityTransaction transaction = entityManager.getTransaction();
		
	Assertions.assertNotNull(transaction);
		
		System.out.println("transaction : "+transaction);
		
		transaction.begin();
		System.out.println("Transaction started....");
		
		Employee emp = null;
		System.out.println("null POJO created...");

		emp = entityManager.find(Employee.class,3);
		
	Assertions.assertNotNull(emp);
		
		
		
		System.out.println("GOT THE POJO FROM DB..");
		System.out.println("RETRIEVED...");
		
		transaction.commit();
		System.out.println("Committed...");
				
		
	}
	
	@Test
	public void empSelectAllTest() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("MyJPA");
		System.out.println("entity manager factory : "+entityManagerFactory);
		
		
	Assertions.assertNotNull(entityManagerFactory);
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		System.out.println("entity manager : "+entityManager);
		
	Assertions.assertNotNull(entityManager);
		
		EntityTransaction transaction = entityManager.getTransaction();
		
	Assertions.assertNotNull(transaction);
		
		System.out.println("transaction : "+transaction);
		
		transaction.begin();
		System.out.println("Transaction started....");
		
		System.out.println("null POJO created...");

		Query theQuery = (Query) entityManager.createQuery("from Employee"); //SQL -> HQSL -> JPQL   (Department.class,363);
		
		List<Employee> empList = theQuery.getResultList();
		
	Assertions.assertNotNull(empList);
	Assertions.assertTrue(empList.size() > 0 );
	
		for(Employee emp : empList) {	
			System.out.println("employeeno "+emp.getEmployeeno());
			System.out.println("employeename"+emp.getEmployeename());
			System.out.println("EmployeeLocation "+emp.getEmployeeLocation());
			System.out.println("employeeDepartment "+emp.getEmployeeDepartment());
			System.out.println("------------");
		}
		System.out.println("RETRIEVED...");
		
		transaction.commit();
		System.out.println("Committed...");
				
		
	}
	
}


