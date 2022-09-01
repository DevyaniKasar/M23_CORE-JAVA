package com.cg.Framework;

public abstract class PrimeAcc extends ShopAcc
{
	private boolean isPrime;
	@SuppressWarnings("unused")
	static final private float deliveryCharges=0.0f;
	//Constructor
	public PrimeAcc(int accNo, String accNm, float charges,boolean isPrime) 
	{
		super(accNo, accNm, charges);
		this.isPrime=isPrime;
		
	}
		
   //ToString Method
	@Override
	public String toString() {
		return String.format("PrimeAcc [isPrime=%s,toString()=%s]", isPrime,super.toString());
	}
	//BookProduct
	public void bookProduct(float charges)
	{
			System.out.println("Account no is "+this.getAccNo()+" Account name is: "
					+this.getAccNm()+" "+"Charge is : "+this.getCharges());
	}

}
