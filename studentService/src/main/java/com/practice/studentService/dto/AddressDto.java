package com.practice.studentService.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class AddressDto {

    private String city;
    private long pincode;

    public AddressDto(String city, long pincode) {
        this.city = city;
        this.pincode = pincode;
    }
}
