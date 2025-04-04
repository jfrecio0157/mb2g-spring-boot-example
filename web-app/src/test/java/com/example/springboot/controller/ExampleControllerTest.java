package com.example.springboot.controller;

import org.example.model.ShippingAddress;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ExampleControllerTest {
    @Test
    void getShippingAddressTest() {
        ExampleController exampleController = new ExampleController();
        ShippingAddress shippingAddress = exampleController.getShippingAddress();

        assertEquals("postOfficeBox",shippingAddress.getPostOfficeBox());
        assertEquals("extendedAddress",shippingAddress.getExtendedAddress());
        assertEquals("streetAddress",shippingAddress.getStreetAddress());
        assertEquals("locality",shippingAddress.getLocality());
        assertEquals("region",shippingAddress.getRegion());
        assertEquals("postalCode",shippingAddress.getPostalCode());
        assertEquals("countryName",shippingAddress.getCountryName());

        System.out.println("Test correcto de ExampleController");
    }
}
