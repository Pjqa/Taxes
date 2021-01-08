package com.qa.main;

public class Runner {

	
	public static void main(String[] args) {
		
		Ta taxmoney = new Ta();
	
		System.out.println(taxmoney.percentTaxed (70000));
		System.out.println(taxmoney.amoutTax (90000));

	}

}
