package com.example.demo.Controller;

import com.example.demo.Entity.Student;
import com.example.demo.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping
    public ResponseEntity<List<Student>> getStudents() {
        List<Student> students = studentService.getStudents();
        if (students.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(students);
    }

    @GetMapping("/{rno}")
    public ResponseEntity<Student> getStudentByRno(@PathVariable int rno) {
        Student student = studentService.getStdByRno(rno);
        if (student == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
        return ResponseEntity.ok(student);
    }

    @PostMapping
    public ResponseEntity<String> addStudent(@RequestBody Student student) {
        studentService.addStudent(student);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body("Student added successfully");
    }

    @PutMapping
    public ResponseEntity<String> updateStudent(@RequestBody Student student) {
        String result = studentService.updatestudent(student);
        if (result.equals("Update done successfully")) {
            return ResponseEntity.ok(result);
        } else {
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body(result);
        }
    }

    @DeleteMapping("/{rno}")
    public ResponseEntity<String> deleteStudent(@PathVariable int rno) {
        String result = studentService.deletestudent(rno);
        if (result.equals("Student deleted successfully")) {
            return ResponseEntity.ok(result);
        } else {
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body(result);
        }
    }
}
