package model;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
import model.Restaurant;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;



@SuppressWarnings("unused")
public class FilterRestaurant 
{
	List<Restaurant> res=new ArrayList<Restaurant>();
	
	public FilterRestaurant(){}
	
	public void filterOptions() throws IOException
	{	
		res.add(new Restaurant(101,"Rangla Punjab", "Punjabi Food",4.5, 7, "Tilak Nagar, Indore", 5));
		res.add(new Restaurant(102,"The Rajputi Dhaba", "Rajasthani Food",4.7, 8, "Rau, Indore", 9));
		res.add(new Restaurant(103,"Aamchi Mumbai", "Marathi Food",4.2, 7, "Geeta Bhawan, Indore", 7));
		res.add(new Restaurant(104,"The Gujju Food", "Gujarati Food",4.5, 8, "MR10, Indore", 8));
		res.add(new Restaurant(105,"The Punjabi Restaurant", "Punjabi Food",4.7, 9, "Bhawarkua, Indore", 9));
		res.add(new Restaurant(106,"The South Indian Restaurant", "South Indian Food",4.8, 8, "Sapna Sangeeta, Indore", 7));
		res.add(new Restaurant(107,"The Gujrati Food", "Gujarati Food",4.7, 8, "Vijay Nagar, Indore", 6));
		res.add(new Restaurant(108,"Mharo Mewad", "Rajasthani Food",4.8, 6, "Tilak Nagar, Indore", 4));
		theRunningLoop();
		
		}
	
	
	public void allRestaurants()
	{
		System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
	    System.out.printf("%10s %30s %20s %20s %40s %20s", "RESTAURANT ID", "RESTAURANT NAME", "SPECIAL CUISINE", "RATINGS", "HEALTH CERTIFICATION RATINGS","AREA");
	    System.out.println();
	    System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
	    for(Restaurant student: res){
	        System.out.format("%10d %30s %20s %20f %30f %40s",
	                student.getRestaurantId(), student.getRestaurantName(), student.getCuisines(), student.getRestaurantRatings(), student.getHealthCertificationRatings(), student.getReataurantArea());
	        System.out.println();
	    }
	    System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
	}
	
	public void cuisineSpecific() throws IOException
	{
	System.out.println("Which Food you will prefer!!!");
	System.out.println("Gujarati Food");
	System.out.println("Punjabi Food");
	System.out.println("Rajasthani Food");
	System.out.println("Marathi Food");
	System.out.println("South Indian Food");
	System.out.println("Note: Please write the name of the food mentioned above.");
	Scanner sc=new Scanner(System.in);
	String option=sc.nextLine();
	switch(option) {
	case "Gujarati Food":
		int count=0;
		for(Restaurant res1:res ) {
			
			if(option.equals(res1.getCuisines())) {
				
				if(count==0) {
					System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
				    System.out.printf("%10s %30s %20s %20s %40s %20s", "RESTAURANT ID", "RESTAURANT NAME", "SPECIAL CUISINE", "RATINGS", "HEALTH CERTIFICATION RATINGS","AREA");
				    System.out.println();
				    System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
					System.out.printf("%10d %30s %20s %20f %30f %40s", res1.getRestaurantId(), res1.getRestaurantName(), res1.getCuisines(), res1.getRestaurantRatings(), res1.getHealthCertificationRatings(), res1.getReataurantArea());
					System.out.println();
			    System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			    count++;
				}
				else {
					System.out.printf("%10d %30s %20s %20f %30f %40s", res1.getRestaurantId(), res1.getRestaurantName(), res1.getCuisines(), res1.getRestaurantRatings(), res1.getHealthCertificationRatings(), res1.getReataurantArea());
					System.out.println();
					System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
				}
			}
		}
		bookingSeats();
		break;
	
	case "Rajasthani Food":
		
		for(Restaurant res1:res ) {
			int count1=0;
			if(option.equals(res1.getCuisines())) {
				
				if(count1==0) {
					System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
				    System.out.printf("%10s %30s %20s %20s %40s %20s", "RESTAURANT ID", "RESTAURANT NAME", "SPECIAL CUISINE", "RATINGS", "HEALTH CERTIFICATION RATINGS","AREA");
				    System.out.println();
				    System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
					System.out.printf("%10d %30s %20s %20f %30f %40s", res1.getRestaurantId(), res1.getRestaurantName(), res1.getCuisines(), res1.getRestaurantRatings(), res1.getHealthCertificationRatings(), res1.getReataurantArea());
					System.out.println();
			    System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			    count1++;
				}
				else {
					System.out.printf("%10d %30s %20s %20f %30f %40s", res1.getRestaurantId(), res1.getRestaurantName(), res1.getCuisines(), res1.getRestaurantRatings(), res1.getHealthCertificationRatings(), res1.getReataurantArea());
					System.out.println();
					System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
				}
			}
		}
		bookingSeats();
		break;
	case "Punjabi Food":
		int count2=0;
		for(Restaurant res1:res ) {
			
			if(option.equals(res1.getCuisines())) {
				
				if(count2==0) {
					System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
				    System.out.printf("%10s %30s %20s %20s %40s %20s", "RESTAURANT ID", "RESTAURANT NAME", "SPECIAL CUISINE", "RATINGS", "HEALTH CERTIFICATION RATINGS","AREA");
				    System.out.println();
				    System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
					System.out.printf("%10d %30s %20s %20f %30f %40s", res1.getRestaurantId(), res1.getRestaurantName(), res1.getCuisines(), res1.getRestaurantRatings(), res1.getHealthCertificationRatings(), res1.getReataurantArea());
					System.out.println();
			    System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			    count2++;
				}
				else {
					System.out.printf("%10d %30s %20s %20f %30f %40s", res1.getRestaurantId(), res1.getRestaurantName(), res1.getCuisines(), res1.getRestaurantRatings(), res1.getHealthCertificationRatings(), res1.getReataurantArea());
					System.out.println();
					System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
				}
			}
		}
		bookingSeats();
		break;
	case "Marathi Food":
		int count3=0;
		for(Restaurant res1:res ) {
			
			if(option.equals(res1.getCuisines())) {
				
				if(count3==0) {
					System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
				    System.out.printf("%10s %30s %20s %20s %40s %20s", "RESTAURANT ID", "RESTAURANT NAME", "SPECIAL CUISINE", "RATINGS", "HEALTH CERTIFICATION RATINGS","AREA");
				    System.out.println();
				    System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
					System.out.printf("%10d %30s %20s %20f %30f %40s", res1.getRestaurantId(), res1.getRestaurantName(), res1.getCuisines(), res1.getRestaurantRatings(), res1.getHealthCertificationRatings(), res1.getReataurantArea());
					System.out.println();
			    System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			    count3++;
				}
				else {
					System.out.printf("%10d %30s %20s %20f %30f %40s", res1.getRestaurantId(), res1.getRestaurantName(), res1.getCuisines(), res1.getRestaurantRatings(), res1.getHealthCertificationRatings(), res1.getReataurantArea());
					System.out.println();
					System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
				}
			}
		}
		bookingSeats();
		break;
	case "South Indian Food":
		int count4=0;
		for(Restaurant res1:res ) {
			
			if(option.equals(res1.getCuisines())) {
				
				if(count4==0) {
					System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
				    System.out.printf("%10s %30s %20s %20s %40s %20s", "RESTAURANT ID", "RESTAURANT NAME", "SPECIAL CUISINE", "RATINGS", "HEALTH CERTIFICATION RATINGS","AREA");
				    System.out.println();
				    System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
					System.out.printf("%10d %30s %20s %20f %30f %40s", res1.getRestaurantId(), res1.getRestaurantName(), res1.getCuisines(), res1.getRestaurantRatings(), res1.getHealthCertificationRatings(), res1.getReataurantArea());
					System.out.println();
			    System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			    count4++;
				}
				else {
					System.out.printf("%10d %30s %20s %20f %30f %40s", res1.getRestaurantId(), res1.getRestaurantName(), res1.getCuisines(), res1.getRestaurantRatings(), res1.getHealthCertificationRatings(), res1.getReataurantArea());
					System.out.println();
					System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
				}
			}
		}
		bookingSeats();
		break;
		default:
			System.out.println("This cuisine isn't available");
			theRunningLoop();
	}
	
	}
	
	public void ratingsSpecific() throws IOException
	{
		System.out.println("How much ratings would you prefer!");
		System.out.println("Above 4.5");
		System.out.println("Above 4.0");
		System.out.println("5.0");
		System.out.println("Note: Please write the above options as it given");
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		switch(input) {
		case "Above 4.5":
			int count1=0;
			for(Restaurant res1:res) {
				
				if(res1.getRestaurantRatings()>4.5) {
					
					if(count1==0) {
						System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
					    System.out.printf("%10s %30s %20s %20s %40s %20s", "RESTAURANT ID", "RESTAURANT NAME", "SPECIAL CUISINE", "RATINGS", "HEALTH CERTIFICATION RATINGS","AREA");
					    System.out.println();
					    System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
						System.out.printf("%10d %30s %20s %20f %30f %40s", res1.getRestaurantId(), res1.getRestaurantName(), res1.getCuisines(), res1.getRestaurantRatings(), res1.getHealthCertificationRatings(), res1.getReataurantArea());
						System.out.println();
				    System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
				    count1++;	
					}
					else {
						System.out.printf("%10d %30s %20s %20f %30f %40s", res1.getRestaurantId(), res1.getRestaurantName(), res1.getCuisines(), res1.getRestaurantRatings(), res1.getHealthCertificationRatings(), res1.getReataurantArea());
						System.out.println();
						System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
					}
				}
			}
			bookingSeats();
			break;
		case "Above 4.0":
			int count2=0;
			for(Restaurant res1:res) {
				
				if(res1.getRestaurantRatings()>4.0) {
					
					if(count2==0) {
						System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
					    System.out.printf("%10s %30s %20s %20s %40s %20s", "RESTAURANT ID", "RESTAURANT NAME", "SPECIAL CUISINE", "RATINGS", "HEALTH CERTIFICATION RATINGS","AREA");
					    System.out.println();
					    System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
						System.out.printf("%10d %30s %20s %20f %30f %40s", res1.getRestaurantId(), res1.getRestaurantName(), res1.getCuisines(), res1.getRestaurantRatings(), res1.getHealthCertificationRatings(), res1.getReataurantArea());
						System.out.println();
				    System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
				    count2++;
					}
					else {
						System.out.printf("%10d %30s %20s %20f %30f %40s", res1.getRestaurantId(), res1.getRestaurantName(), res1.getCuisines(), res1.getRestaurantRatings(), res1.getHealthCertificationRatings(), res1.getReataurantArea());
						System.out.println();
						System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
					}
					
				
				}
			}
			bookingSeats();
			break;
		case "5.0":
			int count3=0;
			for(Restaurant res1:res) {
				
				if(res1.getRestaurantRatings()>5.0) {
					System.out.println("No Restaurant with this ratings");
				}
			}
			theRunningLoop();
			break;
		default:
				System.out.println("We have only high rating Restaurants");
				theRunningLoop();
		}
	}
	public void certificateOfHealth() throws IOException
	{
		System.out.println("Health is the key to happiness\n So what rating restaurant you want to visit!");
		System.out.println("Above 5.0");
		System.out.println("Atleast 8.0 or above");
		System.out.println("Only 10.0");
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		switch(input) {
		case "Above 5.0":
			int count1=0;
			for(Restaurant res1:res) {
				
				if(res1.getHealthCertificationRatings()>5.0) {
					
					if(count1==0) {
						System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
					    System.out.printf("%10s %30s %20s %20s %40s %20s", "RESTAURANT ID", "RESTAURANT NAME", "SPECIAL CUISINE", "RATINGS", "HEALTH CERTIFICATION RATINGS","AREA");
					    System.out.println();
					    System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
						System.out.printf("%10d %30s %20s %20f %30f %40s", res1.getRestaurantId(), res1.getRestaurantName(), res1.getCuisines(), res1.getRestaurantRatings(), res1.getHealthCertificationRatings(), res1.getReataurantArea());
						System.out.println();
				    System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
				    count1++;
					}
					else {
						System.out.printf("%10d %30s %20s %20f %30f %40s", res1.getRestaurantId(), res1.getRestaurantName(), res1.getCuisines(), res1.getRestaurantRatings(), res1.getHealthCertificationRatings(), res1.getReataurantArea());
						System.out.println();
						System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
					}
				}
			}
			bookingSeats();
			break;
		case "Atleast 8.0 or above":
			int count2=0;
			for(Restaurant res1:res) {
				
				if(res1.getHealthCertificationRatings()>=8.0) {
					
					if(count2==0) {
						System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
					    System.out.printf("%10s %30s %20s %20s %40s %20s", "RESTAURANT ID", "RESTAURANT NAME", "SPECIAL CUISINE", "RATINGS", "HEALTH CERTIFICATION RATINGS","AREA");
					    System.out.println();
					    System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
						System.out.printf("%10d %30s %20s %20f %30f %40s", res1.getRestaurantId(), res1.getRestaurantName(), res1.getCuisines(), res1.getRestaurantRatings(), res1.getHealthCertificationRatings(), res1.getReataurantArea());
						System.out.println();
				    System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
				    count2++;
					}
					else {
						System.out.printf("%10d %30s %20s %20f %30f %40s", res1.getRestaurantId(), res1.getRestaurantName(), res1.getCuisines(), res1.getRestaurantRatings(), res1.getHealthCertificationRatings(), res1.getReataurantArea());
						System.out.println();
						System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
					}
				}
			}
			
			break;
			
		case "Only 10.0":
			System.out.println("Oops!!!No restaurant with this ratings");
			theRunningLoop();
			break;
			default:
				System.out.println("Health is our major concern... So we prefer high ratings");
				theRunningLoop();
		}
	}
	
	public void bookingSeats() throws IOException {
		System.out.println("Do you want to book your seat (Y/N)");
		Scanner sc1=new Scanner(System.in);
		String option1=sc1.nextLine();
		
		if(option1.equalsIgnoreCase("Y")) {
			System.out.println("How Many Seats you want to book:");
			for(Restaurant res2:res) {
			int input=sc1.nextInt();
			if(res2.getSeatAvailability()>0 && input<=res2.getSeatAvailability()) {
				int remainingSeats=res2.getSeatAvailability()-input;
				System.out.println("You booking is done!!!\nEnjoy the food");
				System.out.println("Total number of seats remaining: "+remainingSeats);
			}
			else {
				System.out.println("No seats are available");
			}
			break;
		}
		}
		System.out.println("Please Visit again");
	}
	public void theRunningLoop() throws IOException {
		try(Scanner sc = new Scanner(System.in))
		{
		
			System.out.println("Please select an option for the type of Restaurant you want to prefer! \n");
			System.out.println("1.All the Restaurants List \n2.Cuisine Specific Restaurants \n3.Ratings of the Restaurant \n4.Health Certifications Ratings of Restaurants");
			int option = sc.nextInt();
			switch(option)
			{
				case 1: allRestaurants();
						break;
				case 2: cuisineSpecific();
						break;
				case 3: ratingsSpecific();
						break;
				case 4: certificateOfHealth();
						break;
				
				default: System.out.println("Enter Valid Option.");
				
			}
		}
	}
}
