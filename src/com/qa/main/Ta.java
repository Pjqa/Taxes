package com.qa.main;

public class Ta {

	public double percentTaxed(double taxRate) {	
	
		double percent = 0;
	
	if (taxRate < 0) {
			System.out.println(" Stress' get your money up");
		}if (taxRate < 14999) {
			percent = 0.0;
		} else if (taxRate <= 19999) {
			percent = 10.0;
		} else if (taxRate <= 29999) {
			percent = 15.0;
		} else if (taxRate <= 44999) {
			percent = 20.0;
		} else if (taxRate >= 45000) {
			percent = 25.0;
		}
		
		return percent;
	}

    public double amoutTax(double cashP) {
		
		double Pain = 0;
		
		double moneyLost = percentTaxed(cashP);
		
		if (moneyLost == 0) {
			Pain = 0;
		} else {
			moneyLost = cashP*(moneyLost/100);
		}
		
		System.out.println("Your salary " + cashP + " you will be taxed " + Pain);
		
		return Pain;
    }
}