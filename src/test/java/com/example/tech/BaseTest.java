package com.example.tech;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;

public abstract class BaseTest {
	protected Product product;

	@BeforeEach
	public void setUp() {
		product = new Product("Sample Product", 100.0);
	}

	protected void assertProductPrice(double expectedPrice) {
		assertEquals(expectedPrice, product.getPrice(), 0.01);
	}
}
