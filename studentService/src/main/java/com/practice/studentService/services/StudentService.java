package com.practice.studentService.services;


import com.practice.studentService.dto.StudentDto;
import com.practice.studentService.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<StudentDto> getAllStudent() {
        return studentRepository.findAll().stream().map(std -> new StudentDto(std.getName())).collect(Collectors.toUnmodifiableList());
    }
}
