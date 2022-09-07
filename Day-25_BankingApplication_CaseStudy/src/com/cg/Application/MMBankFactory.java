package com.cg.Application;

import com.cg.Framework.BankFactory;
import com.cg.Framework.CurrentAcc;
import com.cg.Framework.SavingAcc;

public class MMBankFactory  extends BankFactory{

	@Override
	public SavingAcc getNewSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		MMSavingAcc s=new MMSavingAcc(accNo, accNm, accBal, isSalaried);
		return s;
	}

	@Override
	public CurrentAcc getNewCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		MMCurrentAcc c=new MMCurrentAcc(accNo, accNm, accBal, creditLimit);
		return c;
	}

}
