package service;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;

public class ExcelFileReader 
{
	public boolean checkCredentials(String email, String pass,int prof) throws IOException 
	{
		String temp = "";
		int j=0,count = 0;
		File file = null;
		switch(prof) 
		{
		case 0:
			file = new File("C:\\Users\\HP\\eclipse-workspace\\FoodSafetyPortal\\ExcelSheets\\RestaurantDetails.xls");
			break;
		}
		FileInputStream fis = new FileInputStream(file);
		HSSFWorkbook workbook = new HSSFWorkbook(fis);
		HSSFSheet sheet =  workbook.getSheetAt(0);
		
		Iterator<Row> itr = sheet.iterator();
		while(itr.hasNext()) 
		{
			Row row = itr.next();
			Iterator<Cell> itrcell = row.cellIterator();
			j = 0 ;
			while(itrcell.hasNext()) 
			{
				Cell cell = itrcell.next();
				temp = cell.getStringCellValue();
				if(temp.equals(email)) 
				{
					count++;
				}
				if(temp.equals(pass)) 
				{
					count++;
				}
				j++;
				
				if(j>1) 
				{
					break;
				} 
			}
		}
		workbook.close();
		if(count == 2)
			return true;
		return false;
	}

}
