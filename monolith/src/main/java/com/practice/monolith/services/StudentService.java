package com.practice.monolith.services;

import com.practice.monolith.dto.StudentDto;
import com.practice.monolith.entity.Student;
import com.practice.monolith.repository.StudentRepository;
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
