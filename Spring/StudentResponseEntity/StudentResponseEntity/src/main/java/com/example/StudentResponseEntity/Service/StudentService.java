package com.example.StudentResponseEntity.Service;

import com.example.StudentResponseEntity.Entity.Student;
import com.example.StudentResponseEntity.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    public StudentRepository repository;

    public List<Student> getStudents() {
        return repository.findAll();
    }

    public Student getStdByRno(int rno) {
        return (Student) repository.findById(rno).orElse(null);
    }

    public void addStudent(Student student) {
        repository.save(student);
    }

    public String updatestudent(Student student) {
        if (repository.existsById(student.getRno())) {
            repository.save(student);
            return "Updated done";
        }
        return "No Student data exist";
    }

    public String deletestudent(int rno) {
        if (repository.existsById(rno)) {
            repository.deleteById(rno);
            return "Student deleted successfully";
        }
        return "No data exist";
    }
}
