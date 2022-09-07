package com.cg.Client;

import com.cg.Application.MMBankFactory;
import com.cg.Application.MMCurrentAcc;
import com.cg.Application.MMSavingAcc;
import com.cg.Framework.BankFactory;
import com.cg.Framework.CurrentAcc;
import com.cg.Framework.SavingAcc;

public class Client {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		BankFactory b=new MMBankFactory();
		SavingAcc s=new MMSavingAcc(1001,"Devyani Kasar",1000,true);
		CurrentAcc c=new MMCurrentAcc(111,"D Kasar",1500,5000);
		System.out.println("Saving Account:");
		s.withraw(500);
		System.out.println();
		System.out.println("Current Account:");
		c.withdraw(1000);
		
	
	}

}
