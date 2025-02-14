package weekend7.day2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelIntegration {
	
	public static String[][] readData() throws IOException {
		
		//locate workbook
		
		XSSFWorkbook wb=new XSSFWorkbook("./data/CreateLead.xlsx");
		
		//locate worksheet
		
		XSSFSheet ws = wb.getSheetAt(0);
		
	      int rowCount = ws.getLastRowNum();
	        
	        System.out.println("Row Count: "+rowCount);
	        
	        //column count
	        
	        int columnCount = ws.getRow(1).getLastCellNum();
	        
	        System.out.println("Column Count: "+columnCount);
	        
	        
	        String [][] data =new String[rowCount][columnCount];
	        

	        //entire data
	        
	        for (int i = 1; i <=rowCount; i++) {
	        	for (int j = 0; j <columnCount; j++) {
	        		
	        		String stringCellValue2 = ws.getRow(i).getCell(j).getStringCellValue();
	        		
	        		data[i-1][j]=stringCellValue2;
	        	}
	}wb.close();
	return data;

}
}
