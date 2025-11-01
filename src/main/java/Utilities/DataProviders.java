package Utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataProviders {
	
	@DataProvider(name="login")
	public String[][] logindetails() throws IOException{
		String path = "C:\\Users\\ahmad\\eclipse-workspace\\OrangeHRM\\testdata\\LoginDetails.xlsx";
		ExcelUtils xlutils = new ExcelUtils(path);
		int row = xlutils.getRowCount("Sheet1");
		int col = xlutils.getCellCount("Sheet1", row);
		
		System.out.print("Row:" + row); //4
		System.out.print("Col:" + col); //3
		String logindata[][] = new String[row][col-1]; //create array to store logindetails 4x2
		
		/*logindata[0][0] = xlutils.getCellData("Sheet1", 1, 0);
		logindata[1][0] = xlutils.getCellData("Sheet1", 2, 0);
		logindata[2][0] = xlutils.getCellData("Sheet1", 3, 0);
		logindata[3][0] = xlutils.getCellData("Sheet1", 4, 0);
		//logindata[4][0] = xlutils.getCellData("Sheet1", 4, 0);
		System.out.print(logindata[0][0]);
		System.out.print(logindata[1][0]);
		System.out.print(logindata[2][0]);
		System.out.print(logindata[3][0]);
		//System.out.print(logindata[4][0]); */
		
		for (int i=1;i<=row;i++) {
			
			for(int j=0;j<col-1;j++) {
				logindata[i-1][j] = xlutils.getCellData("Sheet1", i, j);
				System.out.println(logindata[i-1][j]);
			}
		}
		
		System.out.println(logindata);
		return logindata; //return this 2D array of f
	}
	
	@DataProvider(name="mismatchconfirmpassword")
	public String [][] wrongconfirmpassword(){
		
		String logindata [][]= {{"admin123","admin1234", "admin12345"}};
		return logindata;
		
	}
	
	@DataProvider(name="mismatchcurrentpassword")
	public String [][] wrongcurrentpassword(){
		
		String logindata [][]= {{"admin1234","admin1234", "admin1234"}};
		return logindata;
		
	}
}
