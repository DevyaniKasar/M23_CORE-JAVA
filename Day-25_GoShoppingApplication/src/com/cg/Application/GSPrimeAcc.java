package com.cg.Application;

import com.cg.Framework.PrimeAcc;

public class GSPrimeAcc extends PrimeAcc
{
     public GSPrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
		super(accNo, accNm, charges, isPrime);
		// TODO Auto-generated constructor stub
	}
    //ToString Method

	@Override
	public String toString() {
		return "GSPrimeAcc [toString()=" + super.toString() + "]";
	}
   
	
	

}
