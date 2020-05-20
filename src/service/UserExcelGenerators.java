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


public class UserExcelGenerators 
{
	String filename="C:\\Users\\HP\\eclipse-workspace\\FoodSafetyPortal\\ExcelSheets\\UserDetails.xls";
	int i=1;
	File checkFile = new File(filename);

	Workbook  workbook = null;
	FileOutputStream out;
	public HSSFWorkbook  excelGenerate(UserRegistration register, List<UserRegistration> list) throws IOException 
	{
		if(checkFile.exists()) 
		{
			try 
			{
				FileInputStream fis = new FileInputStream(checkFile);
				Workbook  workbook = new HSSFWorkbook(fis);
				Sheet sheet= workbook.getSheet("UserDetails");
				
				fis.close();
				for(UserRegistration fillSheet: list) 
				{ 
					int rowSize = sheet.getPhysicalNumberOfRows();
			      	Row nextRows = sheet.createRow(rowSize);
			      	nextRows.createCell(0).setCellValue(fillSheet.getEmail());
			      	nextRows.createCell(1).setCellValue(fillSheet.getPassword());
			      	nextRows.createCell(2).setCellValue(fillSheet.getConfirmPassword());
			      	nextRows.createCell(3).setCellValue(fillSheet.getMobile());  
			      	nextRows.createCell(4).setCellValue(fillSheet.getName());
	      	  	}
				
				out = new FileOutputStream(filename);
				workbook.write(out);
				out.close();
				workbook.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			return null;
		}	
			
		else 
		{
			try 
			{
				workbook = new HSSFWorkbook ();
				HSSFSheet  sheet= (HSSFSheet) workbook.createSheet("UserDetails");
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
	
				out = new FileOutputStream(filename);
				workbook.write(out);
				
			}
			catch (Exception e) 
			{
					e.printStackTrace();
			}
			return null;
		}	
		
    } 
} 

