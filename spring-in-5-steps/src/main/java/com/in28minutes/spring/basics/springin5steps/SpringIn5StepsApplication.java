package com.in28minutes.spring.basics.springin5steps;

import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringIn5StepsApplication {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringIn5StepsApplication.class, args);
		BinarySearchImpl binarySearchImpl = context.getBean(BinarySearchImpl.class);
		int result = binarySearchImpl.binarySearch(new int[] { 12, 56, 78 }, 4);
		System.out.println(result);

		int exitCode = SpringApplication.exit(context, new ExitCodeGenerator() {
			@Override
			public int getExitCode() {
				// TODO Auto-generated method stub
				return 0;
			}
		});
		System.exit(exitCode);
	}
}
