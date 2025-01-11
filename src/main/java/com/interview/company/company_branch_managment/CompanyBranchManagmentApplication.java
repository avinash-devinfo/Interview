package com.interview.company.company_branch_managment;

import java.sql.Connection;
import java.sql.DriverManager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CompanyBranchManagmentApplication {

	private static final String url = "jdbc:mysql://localhost:3306/interview";
	private static final String username = "root";
	private static final String password = "password";
    
	public static void main(String[] args) {
		SpringApplication.run(CompanyBranchManagmentApplication.class, args);
		System.out.println("company App");
		try (Connection connection = DriverManager.getConnection(url, username, password)) {
            System.out.println("Connection successful!");
        } catch (Exception e) {
            e.printStackTrace();
        }
	}
	
	

}
