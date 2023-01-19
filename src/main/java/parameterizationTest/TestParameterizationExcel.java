package parameterizationTest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import util.Xls_Reader;

public class TestParameterizationExcel {
	
	public static Xls_Reader excel = null;

	@Test(dataProvider="getData")
	public void doLogin(String username, String password, String is_correct) {
		System.out.println(username+"---"+password+"---"+is_correct);
	}
	
	@DataProvider
	public static Object[][] getData(){
		
		if(excel == null) {
			excel = new Xls_Reader("C:\\Automation Tutorial\\TestData.xlsx");
		}
		
		String sheetName="TestData";
		int rows = excel.getRowCount(sheetName);
		int cols = excel.getColumnCount(sheetName);
		
		Object[][] data = new Object[rows-1][cols];
		
		for(int rowNums=2; rowNums<=rows; rowNums++) {
			
			for(int colNums=0; colNums<cols; colNums++) {
				data[rowNums-2][colNums] = excel.getCellData(sheetName, colNums, rowNums);
			}
		}
		
		return data;
		
	}
}
