package com.cg.Framework;

public abstract class CurrentAcc extends BankAcc{
	private final float creditLimit ;
	
	//Constructor
	public CurrentAcc(int accNo, String accNm, float accBal,float creditLimit ) 
	{
		super(accNo, accNm, accBal);
		this.creditLimit=creditLimit;
		
	}
	@Override
	public String toString() {
		return String.format("CurrentAcc [creditLimit=%s]", creditLimit);
	}
	public void withdraw(float WithdrawAmu)	
	{
	   if(WithdrawAmu>=creditLimit)
		
	     {
		    System.out.println("Your credit limit is "+creditLimit);
	     }
	   else
	     {

	        System.out.println("Account no"+this.getAccNo()+" Account name "+this.getAccNm()+" Account Balance "+(accBal-WithdrawAmu)+" With Maximum CreditLimit Rs "+creditLimit);
         }
	}
}
