package CalculateTax;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import CalculateTax.CalculateTax;

class JUnitTestingTest {

	@Test
	void test() {
		CalculateTax calcTax = new CalculateTax();
		CalculateTaxSlab cTS;
		cTS = calcTax.calculateTaxRate();
		assertEquals(cTS.calculate(300000),10);
	}

}
