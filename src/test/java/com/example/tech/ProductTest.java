package com.example.tech;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class ProductTest extends BaseTest {

    @Test
    public void testProductInitialization() {
        assertEquals("Sample Product", product.getName());
        assertProductPrice(100.0);
    }

    @Test
    public void testApplyValidDiscount() {
        product.applyDiscount(10);
        assertProductPrice(90.0);
    }

    @Test
    public void testApplyInvalidDiscount() {
        assertThrows(IllegalArgumentException.class, () -> product.applyDiscount(-10));
        assertThrows(IllegalArgumentException.class, () -> product.applyDiscount(110));
    }
}

