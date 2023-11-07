package TestUtils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Arrays;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;


public class GenericMethods {
	@DataProvider(name="ExcelData")
	static String[][] readExcelData() throws Exception {
	File excelFile=new File("./src/main/java/TestData/TestData.xlsx");
	FileInputStream fis=new FileInputStream(excelFile);
	XSSFWorkbook workbook=new XSSFWorkbook(fis);
	XSSFSheet sheet=workbook.getSheet("LoginData");
	int totalRows=sheet.getPhysicalNumberOfRows();
	int totalColumns=sheet.getRow(0).getLastCellNum();
	System.out.println(totalRows+" : "+totalColumns);
	String [][] testData=new String[totalRows-1][totalColumns];
	for(int i=0;i<totalRows-1;i++) {
		for(int j=0;j<totalColumns;j++) {
			testData[i][j]=sheet.getRow(i+1).getCell(j).getStringCellValue();
		}
		System.out.println();
	}
	workbook.close();
	fis.close();
	for(String[] drr:testData) {
		System.out.println(Arrays.toString(drr));
	}
	return testData;
	}
	public static void main(String[] args) throws Exception {
		readExcelData();
	}

}
 