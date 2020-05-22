package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.FilterRestaurant;
import model.UserRegistration;
import service.ExcelFileReader;
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
			
			
			System.out.println("1. Registration");
			System.out.println("2. Login");
			
			int n=scanner.nextInt();
			switch(n) {
			case 1:
			System.out.println("Enter Your Name: \n");
			String userName = scanner.next();
			
			System.out.println("Enter Your Email-Id: \n");
			String email = scanner.next();
			
			System.out.println("Enter Your Password: \n");
			String password = scanner.next();
			
			System.out.println("Re-enter Your Password: \n");
			String confirmPassword = scanner.next();
			
			System.out.println("Enter Your Mobile Number: \n");
			String mobile = scanner.nextLine();
			
			if(ValidationDetails.isValid(email, password, confirmPassword, mobile))
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
			break;
			
			case 2:
				System.out.println("Enter your email-Id: \n");
				String email1 = scanner.next();
				
				System.out.println("Enter your password: \n");
				String password1 = scanner.next();
				
				ExcelFileReader vc = new ExcelFileReader();
				if(vc.checkCredentials(email1,password1,0)) 
				{
					System.out.println("Logged in Successfully");
					FilterRestaurant fr=new FilterRestaurant();
					fr.filterOptions();
				}
				else 
				{
					System.out.println("Please Check your Credentials");
				}
				scanner.close();
				break;
			
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