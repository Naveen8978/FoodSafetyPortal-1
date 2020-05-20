package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.UserRegistration;
import service.UserExcelGenerators;
import utility.ValidationDetails;

public class MainUserRegistration {

	public static void main(String[] args) throws IOException {
		UserRegistration register =new UserRegistration();
	    ValidationDetails validate = new ValidationDetails();
		try(Scanner scanner = new Scanner(System.in))
		{
			System.out.println("-------------------------------------------------------- \n");
			System.out.println("Welcome to the Food Portal \n");
			System.out.println("-------------------------------------------------------- \n");
			System.out.println("Enter Your Name: \n");
			String userName = scanner.nextLine();
			
			System.out.println("Enter Your Email-Id: \n");
			String email = scanner.nextLine();
			
			System.out.println("Enter Your Password: \n");
			String password = scanner.nextLine();
			
			System.out.println("Re-enter Your Password: \n");
			String confirmPassword = scanner.nextLine();
			
			System.out.println("Enter Your Mobile Number: \n");
			String mobile = scanner.nextLine();
			
			if(validate.isValid(email, password, confirmPassword, mobile))
			{
				register.setName(userName);
				register.setEmail(email);
				register.setPassword(password);
				register.setConfirmPassword(confirmPassword);
				register.setMobile(mobile);
				printData(register);
				List<UserRegistration> list = new ArrayList<UserRegistration>();
				UserExcelGenerators excel = new UserExcelGenerators();
				list.add(register);
				excel.excelGenerate(register, list);
				System.out.println("Stored Details");
			}
			else
			{
				System.out.println("Invalid credentials");
			}
			
		}	
				
				
		}	
	
	
	

	private static void printData(UserRegistration register) {
		// TODO Auto-generated method stub
		System.out.println("Your Name: " + register.getName());
		System.out.println("Your Email: " + register.getEmail());
		System.out.println("Your Password: " + register.getPassword());
		System.out.println("Check Your Password: " + register.getConfirmPassword());
		System.out.println("Your Mobile Number: " + register.getMobile());
		
	}

	
	

}
