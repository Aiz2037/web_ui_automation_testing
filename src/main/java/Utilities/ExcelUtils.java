package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	public FileInputStream fi;
	public XSSFWorkbook workbook;
	public XSSFSheet sheet;
	public XSSFRow row;
	public XSSFCell cell;
	public FileOutputStream fo;
	
	String path;
	
		//create constructor
	public ExcelUtils(String path) {
			this.path = path;
		}
		
	public int getRowCount (String sheetname) throws IOException 
		{
			
		fi = new FileInputStream(path);	
		workbook = new XSSFWorkbook(fi);
		sheet = workbook.getSheet(sheetname);
		int rowcount = sheet.getLastRowNum();
		workbook.close();
		fi.close();
		return rowcount;   //row number
		
		}
		
	public int getCellCount (String sheetname, int rownum) throws IOException {
		fi = new FileInputStream(path);	
		workbook = new XSSFWorkbook(fi);
		sheet = workbook.getSheet(sheetname);
		row = sheet.getRow(rownum);
		int cellcount = row.getLastCellNum();
		workbook.close();
		fi.close();
		return cellcount;	//column number
		}
		
	public String getCellData (String sheetname, int rownum, int colnum) throws IOException {
			
		fi = new FileInputStream(path);	
		workbook = new XSSFWorkbook(fi);
		sheet = workbook.getSheet(sheetname);
		row = sheet.getRow(rownum);
		cell = row.getCell(colnum);
			
		String data;
		DataFormatter formatter = new DataFormatter();
			
		try {
		data = formatter.formatCellValue(cell);
		}catch(Exception e) {		
		data="";
		}
			
		return data; //read cell value
		}
		
	public void setCellData(String sheetname, int rownum, int colnum, String data) throws IOException {
			
		File xlfile = new File(path);
		if(!xlfile.exists()) {
			workbook = new XSSFWorkbook();
			fo = new FileOutputStream(path);
			workbook.write(fo);	
		}
			
		fi = new FileInputStream(path);	
		workbook = new XSSFWorkbook(fi);
			
		if (workbook.getSheetIndex(sheetname)==-1){
			workbook.createSheet(sheetname);
		}
			
			sheet = workbook.getSheet(sheetname);
			
			if (sheet.getRow(rownum) == null) {
				sheet.createRow(rownum);
			}
			
			row = sheet.getRow(rownum);
			cell = row.createCell(colnum);
			cell.setCellValue(data);
			fo = new FileOutputStream(path);
			workbook.write(fo);
			workbook.close();
			fi.close();
			fo.close();
			
		}
}
