package com.practice.monolith.controller;

import com.practice.monolith.dto.AddressDto;
import com.practice.monolith.services.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AddressController {

    @Autowired
    private AddressService addressService;


    @GetMapping("/getAddress")
    public ResponseEntity<List<AddressDto>> getAddress(){
        return ResponseEntity.ok(this.addressService.getAddress());
    }

    @PostMapping("/getAddressByName")
    public ResponseEntity<String> getAddressByName(@RequestBody String name){
        return ResponseEntity.ok(this.addressService.getAddressByName(name).getCity());
    }
}
