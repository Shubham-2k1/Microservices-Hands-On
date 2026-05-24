package com.practice.addressService.services;


import com.practice.addressService.dto.AddressDto;
import com.practice.addressService.entity.Address;
import com.practice.addressService.repository.AddressRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class AddressService {

    @Autowired
    private AddressRepository addressRepository;

    public List<AddressDto> getAddress(){
       return addressRepository.findAll().stream().map(add -> new AddressDto(add.getName(),add.getCity(),add.getPincode())).collect(Collectors.toUnmodifiableList());
    }

    public Address getAddressByName(String name){
        Optional<Address> address = addressRepository.findByName(name);
        return address.orElseThrow(() -> new RuntimeException("Address not found"));
    }
}
