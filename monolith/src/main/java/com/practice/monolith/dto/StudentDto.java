package com.practice.monolith.dto;


import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class StudentDto {
    private String name;

    public StudentDto(String name){
        this.name = name;
    }
}