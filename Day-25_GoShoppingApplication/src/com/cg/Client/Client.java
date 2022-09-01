package com.cg.Client;

import com.cg.Application.GSNormalAcc;
import com.cg.Application.GSPrimeAcc;
import com.cg.Application.GSShopFactory;
import com.cg.Framework.NormalAcc;
import com.cg.Framework.PrimeAcc;
import com.cg.Framework.ShopFactory;

public class Client {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		ShopFactory s=new GSShopFactory();
		PrimeAcc p=new GSPrimeAcc(1001,"Devyani Kasar",500,true);
		NormalAcc n=new GSNormalAcc(111,"Akshay Kasar",500,50);
		System.out.println("Prime account ");
		p.bookProduct(500);
		System.out.println("Normal account");
		n.bookProduct(500);
		
		
		
		System.out.println(p);
		System.out.println(n);
	}

}
