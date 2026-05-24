package com.practice.studentService.services;


import com.practice.studentService.dto.AddressDto;
import com.practice.studentService.dto.StudentDto;
import com.practice.studentService.feignClient.addressFeignClient;
import com.practice.studentService.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private WebClient webClient;

    @Autowired
    private addressFeignClient addressFeignClient;

    public List<StudentDto> getAllStudent() {
        return studentRepository.findAll().stream().map(std -> new StudentDto(std.getName())).collect(Collectors.toUnmodifiableList());
    }

    public StudentDto getStudent(String name) {
//       Mono<AddressDto> mono = webClient.post().uri("/getAddressByName").bodyValue(name).retrieve().bodyToMono(AddressDto.class);
//        return new StudentDto(name,mono.block());
        return new StudentDto(name, addressFeignClient.getAddressByName(name).getBody());
    }
}
