package com.iamrishavdas.SpringJDBC;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.iamrishavdas.SpringJDBC.Model.Student;
import com.iamrishavdas.SpringJDBC.Service.StudentService;;

@SpringBootApplication
public class SpringJdbcApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringJdbcApplication.class, args);

		StudentService studentService = context.getBean(StudentService.class);
		Student s1 = context.getBean(Student.class);
		s1.setName("Rishav Das");
		s1.setRollNo(15);
		s1.setMarks(8.88f);

		Student s2 = context.getBean(Student.class);
		s2.setName("Sataruapa Das");
		s2.setRollNo(16);
		s2.setMarks(9.88f);

		studentService.addStudent(s1);
		studentService.addStudent(s2);

		List<Student> listOfStudents = studentService.getStudents();
		System.out.println(listOfStudents);
	}

}
