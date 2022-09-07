package com.cg.Framework;

public abstract class BankAcc 
{
	private int accNo;
	private String accNm;
	protected float accBal;
   
	//Constructor
	public BankAcc (int accNo, String accNm, float accBal)
	{
		
		this.accNo = accNo;
		this.accNm = accNm;
		this.accBal = accBal;
	}
	//Getter And Setter Method
	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getAccNm() {
		return accNm;
	}

	public void setAccNm(String accNm) {
		this.accNm = accNm;
	}

	public float getAccBal() {
		return accBal;
	}

	public void setAccBal(float accBal) {
		this.accBal = accBal;
	}
	//ToString Method
	@Override
	public String toString() {
		return "BankAcc [accNo=" + accNo + ", accNm=" + accNm + ", accBal=" + accBal + "]";
	}
	
	 
}
