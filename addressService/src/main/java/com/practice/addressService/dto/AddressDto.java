package com.practice.addressService.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class AddressDto {

    private String name;
    private String city;
    private long pincode;

    public AddressDto(String name, String city, long pincode) {
        this.name = name;
        this.city = city;
        this.pincode = pincode;
    }
}
