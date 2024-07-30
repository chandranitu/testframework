package com.example.tech;

import org.junit.jupiter.api.Test;

public class AdvancedProductTest extends BaseTest {

	@Test
	public void testApplyMaximumDiscount() {
		product.applyDiscount(100);
		assertProductPrice(0.0);
	}

	@Test
	public void testMultipleDiscounts() {
		product.applyDiscount(20);
		assertProductPrice(80.0);
		product.applyDiscount(10);
		assertProductPrice(72.0);
	}
}
