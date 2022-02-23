package dataAndKeyDriven;

public class DataDriven {
	
	public static void main(String args[]) throws Throwable {
		
		FileLib flib = new FileLib();
//		String value = flib.readExcelData("D:\\Selenium\\TestNGProject\\Data\\DataSheet.xlsx", "Sheet1", 0, 1);
//		System.out.println(value);
		
		flib.writeExcelData("D:\\Selenium\\TestNGProject\\Data\\DataSheet.xlsx","Sheet1" , 0, 5, "Ashok kumar");
		flib.writeExcelData("D:\\Selenium\\TestNGProject\\Data\\DataSheet.xlsx","Sheet1" , 0, 4, "Ashok kumar");
		flib.writeExcelData("D:\\Selenium\\TestNGProject\\Data\\DataSheet.xlsx","Sheet1" , 0, 3, "Ashok kumar");
		// replace with old name
		flib.writeExcelData("D:\\Selenium\\TestNGProject\\Data\\DataSheet.xlsx","Sheet1" , 0, 1, "Jhansi rani");
		System.out.println("Done writing");
//		
//		int value1 = flib.getRowCount("D:\\Selenium\\TestNGProject\\Data\\DataSheet.xlsx", "Sheet1");
//		System.out.println(value1);
		
//		String value2 = flib.readProprertyData("D:\\Selenium\\Automatiom\\Data\\Config.properties", "browser");
//		System.out.println(value2);
//		
//		String value3 = flib.readProprertyData("D:\\Selenium\\Automatiom\\Data\\Config.properties", "name");
//		System.out.println(value3);
		
	}

}
