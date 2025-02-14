package weekend7.day2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LearnExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//locate workbook
		
		XSSFWorkbook wb=new XSSFWorkbook("./data/CreateLead.xlsx");
		
		//locate worksheet
		
		XSSFSheet ws = wb.getSheetAt(0);
		
		//locate row
		
		//XSSFRow row = ws.getRow(1);
		
		//System.out.println(row);
		
		int totalRows = ws.getPhysicalNumberOfRows();
        System.out.println("Total Rows: "+totalRows);
        
        String stringCellValue = ws.getRow(1).getCell(0).getStringCellValue();
        
        System.out.println(stringCellValue);
        
        //rowcount
        
        int rowCount = ws.getLastRowNum();
        
        System.out.println("Row Count: "+rowCount);
        
        //column count
        
        int columnCount = ws.getRow(1).getLastCellNum();
        
        System.out.println("Column Count: "+columnCount);
        
        //entire data
        
        for (int i = 1; i <=rowCount; i++) {
        	for (int j = 0; j <columnCount; j++) {
        		
        		String stringCellValue2 = ws.getRow(i).getCell(j).getStringCellValue();
        		
        		System.out.println(stringCellValue2);
				
			}
			
		}wb.close();
        
        
	}

}
