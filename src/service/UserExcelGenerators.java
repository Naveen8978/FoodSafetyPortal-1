package service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import model.UserRegistration;


import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.hssf.usermodel.HSSFSheet;  
import org.apache.poi.hssf.usermodel.HSSFWorkbook;  
import org.apache.poi.hssf.util.*;  
import org.apache.poi.ss.util.*;  



public class UserExcelGenerators 
{
//	String filename="C:\\Users\\HP\\eclipse-workspace\\FoodSafetyPortal\\ExcelSheets\\RestaurantDetails.xls";
	int i=1;
//	File checkFile = new File(filename);
//
//	Workbook  workbook = null;
	FileOutputStream out;
	public HSSFWorkbook  excelGenerate(UserRegistration register, List<UserRegistration> list) throws IOException 
	{
		
		
			try 
			{
				HSSFWorkbook workbook = new HSSFWorkbook ();
				HSSFSheet  sheet= workbook.createSheet("RestaurantDetails");
				Row row=sheet.createRow(0);
				
				row.createCell(0).setCellValue("Email-Id");
				row.createCell(1).setCellValue("Password");
				row.createCell(2).setCellValue("confirm Password");
				row.createCell(3).setCellValue("Mobile");
				row.createCell(4).setCellValue("UserName");
				
			 	
				for(UserRegistration fillSheet: list) 
				{ 
			      	Row nextRows = sheet.createRow(i);
			      	nextRows.createCell(0).setCellValue(fillSheet.getEmail());
			      	nextRows.createCell(1).setCellValue(fillSheet.getPassword());
			      	nextRows.createCell(2).setCellValue(fillSheet.getConfirmPassword());
			      	nextRows.createCell(3).setCellValue(fillSheet.getMobile());  
			      	nextRows.createCell(4).setCellValue(fillSheet.getName());
	      	  	}
				
				for(int j=0; j<6; j++) {
					sheet.autoSizeColumn(j);
				}
	
			FileOutputStream out= new FileOutputStream(new File("C:\\Users\\HP\\eclipse-workspace\\FoodSafetyPortal\\ExcelSheets\\RestaurantDetails.xls"));
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


