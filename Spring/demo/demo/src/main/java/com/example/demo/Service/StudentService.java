package com.example.demo.Service;
import com.example.demo.Entity.Student;
import com.example.demo.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;
    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    public Student getStdByRno(int rno) {
        return studentRepository.findById(rno).orElse(null);
    }

    public void addStudent(Student student) {
        studentRepository.save(student);
    }

    public String updatestudent(Student student) {
        if(studentRepository.existsById(student.getId())) {
            studentRepository.save(student);
            return "Student updated successfully";
        }
        return "Student not found";
    }

    public String deletestudent(int id) {
        if(studentRepository.existsById(id)) {
            studentRepository.deleteById(id);
            return "Student deleted successfully";
        }
        return "Student not found";
    }
}

