package net.Javaguides.studentmanagementsystem.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import net.Javaguides.studentmanagementsystem.entity.Student;
import net.Javaguides.studentmanagementsystem.repository.StudentRepository;
import net.Javaguides.studentmanagementsystem.service.StudentService;

@Service
public class StudentServiceimpl implements StudentService{

	private StudentRepository studentRepository;
	
	
	
	public StudentServiceimpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}


	@Override
	public List<Student> getAllStudent() {
		return studentRepository.findAll();
	}
	
}
