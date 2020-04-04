package com.example.springboot;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.entity.Student;
import com.example.springboot.service.StudentService;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;
    
	@PostMapping(path = "/student")
	public ResponseEntity<Student> save(@RequestBody Student student) {
	    studentService.save(student);
        
        return ResponseEntity.ok().body(student);
	}

	@PostMapping(path = "/student/{index}")
	public ResponseEntity<Student> update(@PathVariable("index") int index, @RequestBody Student student) {
	    Student studentFound = studentService.findByIndex(index);
	    
	    student.setIndex(studentFound.getIndex());

	    studentService.update(student);
	        
	    return ResponseEntity.ok().body(student);
	}

	@GetMapping(path = "/student")
    public ResponseEntity<Collection<Student>> findAll() {
	    Collection<Student> students = studentService.findAll();

        return ResponseEntity.ok().body(students);
    }

	  
	@GetMapping(path = "/student/{index}")
	public ResponseEntity<Student> findByIndex(@PathVariable("index") int index) {
	    Student student = studentService.findByIndex(index);

	    return ResponseEntity.ok().body(student);
	}

    @DeleteMapping (path = "/student/{index}")
    public ResponseEntity<Student> deleteByIndex(@PathVariable("index") int index) {
        studentService.deleteByIndex(index);

        return ResponseEntity.ok().build();
    }	
	
    @DeleteMapping (path = "/student")
    public ResponseEntity<Student> deleteAll() {
        studentService.deleteAll();

        return ResponseEntity.ok().build();
    }   
}
