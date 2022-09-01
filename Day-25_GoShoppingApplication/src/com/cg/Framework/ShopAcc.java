package com.cg.Framework;

public abstract class ShopAcc 
{
	private int accNo;
	private String accNm;
	private float charges;
	//Constructor
	public ShopAcc(int accNo, String accNm, float charges)
	{
		
		this.accNo = accNo;
		this.accNm = accNm;
		this.charges = charges;
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

	public float getCharges() {
		return charges;
	}

	public void setCharges(float charges) {
		this.charges = charges;
	}
    //ToString Method
	@Override
	public String toString() {
		return String.format("ShopAcc [accNo=%s, accNm=%s, charges=%s]", accNo, accNm, charges);
	}
	//Book Product
	abstract public void bookProduct(float charges);
	public void items(float charges)
	{
		System.out.println(charges);
	}
	

}
