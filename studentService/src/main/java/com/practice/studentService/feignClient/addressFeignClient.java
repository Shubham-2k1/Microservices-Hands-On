package com.practice.studentService.feignClient;

import com.practice.studentService.dto.AddressDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

//@FeignClient(url="${address-service-url}", value = "address-feign-client")
@FeignClient(value="address-service", path="/address")
public interface addressFeignClient {

    @PostMapping("/getAddressByName")
    public ResponseEntity<AddressDto> getAddressByName(@RequestBody String name);
}
