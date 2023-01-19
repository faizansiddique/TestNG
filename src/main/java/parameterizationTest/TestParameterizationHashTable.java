package parameterizationTest;

import java.util.Hashtable;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import util.Xls_Reader;

public class TestParameterizationHashTable {
	
	public static Xls_Reader excel = null;

	@Test(dataProvider="getData")
	public void doLogin(Hashtable<String, String> data) {
		System.out.println(data.get("username"));
		//System.out.println(username+"---"+password+"---"+is_correct);
	}
	
	@DataProvider
	public static Object[][] getData(){
		
		if(excel == null) {
			excel = new Xls_Reader("C:\\Automation Tutorial\\TestData.xlsx");
		}
		
		String sheetName="TestData";
		int rows = excel.getRowCount(sheetName);
		int cols = excel.getColumnCount(sheetName);
		
		Object[][] data = new Object[rows-1][1];
		
		Hashtable<String, String> table = null;
		
		for(int rowNums=2; rowNums<=rows; rowNums++) {
			
			table = new Hashtable<String, String>();
			
			for(int colNums=0; colNums<cols; colNums++) {
				table.put(excel.getCellData(sheetName, colNums, 1), excel.getCellData(sheetName, colNums, rowNums));
				data[rowNums-2][0] = table;
			}
		}
		
		return data;
		
	}

}
