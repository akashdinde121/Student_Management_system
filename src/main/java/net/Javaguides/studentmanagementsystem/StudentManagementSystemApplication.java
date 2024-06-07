package net.Javaguides.studentmanagementsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.Javaguides.studentmanagementsystem.entity.Student;
import net.Javaguides.studentmanagementsystem.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	
	@Autowired
	private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {

		Student student1= new Student("Akash","Dinde","akash@gmail.com" );
		studentRepository.save(student1);
		
		Student student2= new Student("Sudhir","Gutal","sudhir@gmail.com");
		studentRepository.save(student2);
	}

}
