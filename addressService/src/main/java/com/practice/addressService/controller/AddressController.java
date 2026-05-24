package com.practice.addressService.controller;

import com.practice.addressService.dto.AddressDto;
import com.practice.addressService.entity.Address;
import com.practice.addressService.services.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/address")
public class AddressController {

    @Autowired
    private AddressService addressService;


    @GetMapping("/getAddress")
    public ResponseEntity<List<AddressDto>> getAddress(){
        return ResponseEntity.ok(this.addressService.getAddress());
    }

    @PostMapping("/getAddressByName")
    public ResponseEntity<AddressDto> getAddressByName(@RequestBody String name){
        Address address = this.addressService.getAddressByName(name);
        return ResponseEntity.ok(new AddressDto(address.getCity(), address.getPincode()));
    }
}
