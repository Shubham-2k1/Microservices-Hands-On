package com.practice.studentService.dto;


import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class StudentDto {
    private String name;

    private AddressDto address;


    public StudentDto(String name) {
        this.name = name;
    }

    public StudentDto(String name, AddressDto address){
        this.name = name;
        this.address = address;
    }
}