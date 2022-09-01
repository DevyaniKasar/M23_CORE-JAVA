package com.cg.Framework;

public abstract class NormalAcc extends ShopAcc {
	private final float deliveryCharges;
	//Constructor
	public NormalAcc(int accNo, String accNm, float charges,float deliveryCharges) 
	{
		super(accNo, accNm, charges);
		this.deliveryCharges=deliveryCharges;
		
	}
	//ToString Method
	@Override
	public String toString() {
		return "NormalAcc [deliveryCharges=" + deliveryCharges + "]";
	} 
	//BookProduct
	public void bookProduct(float charges)
	{
		System.out.println("Account no is "+this.getAccNo()+" Account name is: "
				+this.getAccNm()+" "+"Charge is : "+(charges+deliveryCharges));
	}




}
