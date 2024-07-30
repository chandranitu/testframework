package com.example.tech;

public class Product {
	private String name;
	private double price;

	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public void applyDiscount(double percentage) {
		if (percentage < 0 || percentage > 100) {
			throw new IllegalArgumentException("Invalid discount percentage");
		}
		price -= price * (percentage / 100);
	}
}
