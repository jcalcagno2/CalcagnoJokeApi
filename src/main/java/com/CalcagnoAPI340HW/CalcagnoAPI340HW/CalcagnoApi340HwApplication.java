package com.CalcagnoAPI340HW.CalcagnoAPI340HW;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalcagnoApi340HwApplication {
public static void main(String[] args) {
		SpringApplication.run(CalcagnoApi340HwApplication.class, args);
                CalcagnoController control = new CalcagnoController();
                control.joke();
	}  
 
}  
