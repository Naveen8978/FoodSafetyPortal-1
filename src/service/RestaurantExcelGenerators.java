package service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import model.Restaurant;
import model.UserRegistration;


import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.hssf.usermodel.HSSFSheet;  
import org.apache.poi.hssf.usermodel.HSSFWorkbook;  


public class RestaurantExcelGenerators 
{
//	String filename="C:\\Users\\HP\\eclipse-workspace\\FoodSafetyPortal\\ExcelSheets\\RestaurantDetails.xls";
//	int i=1;
//	File checkFile = new File(filename);
	int i=1;

	
	FileOutputStream out;
	public HSSFWorkbook  excelGenerate(Restaurant restaurant, List<Restaurant> list) throws IOException 
	{
		
			
		
			try 
			{
				HSSFWorkbook workbook = new HSSFWorkbook ();
				HSSFSheet  sheet= workbook.createSheet("RestaurantDetails");
				Row row=sheet.createRow(0);
				
				row.createCell(0).setCellValue("Restaurant-Id");
				row.createCell(1).setCellValue("Restaurant-Name");
				row.createCell(2).setCellValue("Restaurant-Cuisines");
				row.createCell(3).setCellValue("Restaurant-Ratings");
				row.createCell(4).setCellValue("Restaurant-Health-Certification-Ratings");
				row.createCell(5).setCellValue("Restaurant-Area");
				
			 	
				for(Restaurant fillSheet: list) 
				{ 
			      	Row nextRows = sheet.createRow(i);
			      	nextRows.createCell(0).setCellValue(fillSheet.getRestaurantId());
			      	nextRows.createCell(1).setCellValue(fillSheet.getRestaurantName());
			      	nextRows.createCell(2).setCellValue(fillSheet.getCuisines());
			      	nextRows.createCell(3).setCellValue(fillSheet.getHealthCertificationRatings());  
			      	nextRows.createCell(4).setCellValue(fillSheet.getRestaurantRatings());
			      	nextRows.createCell(5).setCellValue(fillSheet.getReataurantArea());
	      	  	}
				
				for(int j=0; j<6; j++) {
					sheet.autoSizeColumn(j);
				}
				out = new FileOutputStream("C:\\Users\\HP\\eclipse-workspace\\FoodSafetyPortal\\ExcelSheets\\UserDetails.xls");
				workbook.write(out);
				out.close();
				workbook.close();
				System.out.println("Excel created successfully");
				
			}
			catch (Exception e) 
			{
					e.printStackTrace();
			}
			return null;
		}	
		
    } 
 

