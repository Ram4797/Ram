package com.java.test;

import com.java.bank.SavingAccount;

class Bank{
	public static SavingAccount getAccount(String hint)
	{
		if(hint.equalsIgnoreCase("sav"))
		
			return new SavingAccount(101,"jack",5000);
		
		else
		
			return null;
	     
	}
	}

