package com.cg.Framework;

public abstract class SavingAcc extends BankAcc
{
	
	private boolean isSalaried;

	static final private float MINBAL=0.0f;
	//Constructor
	public SavingAcc(int accNo, String accNm, float accBal  ,boolean isSalaried  ) 
	{
		super(accNo, accNm, accBal);
		this.isSalaried=isSalaried;
		
	}
		
	public void withraw(float WithdrawAmu)

	{
		if(accBal<MINBAL)
		   {
			  System.out.println("Account Balance Minimum Limit "+MINBAL);
		   }
		else
		   {
			  System.out.println("Account no"+this.getAccNo()+" Account name "+this.getAccNm()+" Account Balance "+(accBal-WithdrawAmu));
	       }
	}
	
	@Override
	public String toString() {
		return String.format("SavingAcc [isSalaried=%s]", isSalaried);
	}



}
