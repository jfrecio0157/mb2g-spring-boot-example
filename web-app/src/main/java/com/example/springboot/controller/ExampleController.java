package com.example.springboot.controller;

import org.example.model.ShippingAddress;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {

    @RequestMapping("/")
    public ShippingAddress getShippingAddress(){

        ShippingAddress shippingAddress = new ShippingAddress();
        shippingAddress.setPostOfficeBox("postOfficeBox");
        shippingAddress.setExtendedAddress("extendedAddress");
        shippingAddress.setStreetAddress("streetAddress");
        shippingAddress.setLocality("locality");
        shippingAddress.setRegion("region");
        shippingAddress.setPostalCode("postalCode");
        shippingAddress.setCountryName("countryName");

        return shippingAddress;
    }

}
