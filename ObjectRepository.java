package supportlibraries;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import allocator.ParallelRunner;


public class ObjectRepository {
	
	static HSSFWorkbook inputworkbook = null;
    static HSSFSheet inputworksheet = null;    
    static FileInputStream inputfileIn = null;
    static HashMap <String, Object[]> ORTables = new HashMap <String, Object[]>();
	public ObjectRepository() {
	
		//getInputData();
		
	}

	//static String inputFile=properties.getProperty("ORTablePath");	
	
   
	public void getInputData(String properties) {
		
	// File inputfiles = new File("C:\\Users\\co24066\\mobile_sales\\ORTable\\ObjectRepository.xls"); 
	
		File inputfiles = new File("ORTable\\ObjectRepository.xls");
	 
	
	//	File inputfiles = new File("H:\\MobileSales\\ORTable\\ObjectRepository1.xls");
	
		
		try {
			inputfileIn = new FileInputStream(inputfiles);		
			inputworkbook = new HSSFWorkbook(inputfileIn);
			
		/*	if(ParallelRunner.mobilePlatform.equalsIgnoreCase("Native_Web_iOS")||ParallelRunner.mobilePlatform.equalsIgnoreCase("Native_web_Android"))
				inputworksheet = inputworkbook.getSheetAt(1);
			else if(!(ParallelRunner.mobilePlatform.equalsIgnoreCase("iOS")||ParallelRunner.mobilePlatform.equalsIgnoreCase("Android")))
				inputworksheet = inputworkbook.getSheetAt(0);						
			else */
				inputworksheet = inputworkbook.getSheetAt(1);
			Iterator<Row> rowIterator = inputworksheet.iterator();
			while(rowIterator.hasNext()) {
		        Row row1 = rowIterator.next();
		        Cell cell1 = row1.getCell(0);
		        String ORName = cell1.getStringCellValue().trim();
		        
		        Cell cell2 = row1.getCell(1);
		        String ORtype = cell2.getStringCellValue().trim();
		        
		        Cell cell3 = row1.getCell(2);
		        String ORelement = cell3.getStringCellValue().trim();
		        
		        ORTables.put(ORName, new Object[]{ORtype,ORelement});
			}
		} catch (IOException e) {
			
		}
	}
	public String getType(String ORName) {
		
		Object[] value = ORTables.get(ORName);
		String type= (String) value[0];
		return type;
	}

	public String getElement(String ORName) {
		Object[] value = ORTables.get(ORName);
		String element= (String) value[1];
		return element;
	}

	
}
