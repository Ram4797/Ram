package com.java.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.java.bank.SavingAccount;

public class tester {

	@Test
	public void testA() {
	System.out.println("a testing2 saving account...");
	SavingAccount saObj = Bank.getAccount("sav");
	Assertions.assertTrue(saObj!=null);
	System.out.println("test passed1");
	System.out.println("object created");
	saObj.withdraw(4000);
	Assertions.assertEquals(1000, saObj.getAccountBalance());
	System.out.println("test passed2");

	}
	@Test
	public void testB() {

	}
	
	
}
