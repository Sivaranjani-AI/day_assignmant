package com.example.component;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ComponentApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(ComponentApplication.class, args);
		component com = context.getBean(component.class);
		com.display();

		Student stu = context.getBean(Student.class);
		stu.show();

		Teacher tea = context.getBean(Teacher.class);
		tea.display();

		Course cou = context.getBean(Course.class);
		cou.show();

	}
}
