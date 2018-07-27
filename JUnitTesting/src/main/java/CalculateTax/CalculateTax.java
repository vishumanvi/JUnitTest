package CalculateTax;

interface CalculateTaxSlab {
	int calculate(int income);
}

public class CalculateTax {
	public static CalculateTaxSlab calculateTaxRate() {
		CalculateTaxSlab calc;
		calc = (income) -> {
							int taxSlab;
							if (income <250000) taxSlab = 5;
							else if (income > 250000 && income < 500000) taxSlab = 10;
								else if (income > 500000 && income < 100000) taxSlab = 20;
										else taxSlab=30;
							return taxSlab;
						  };
		return calc;
	}
}
