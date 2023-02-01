//package Campaing;
//
//
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.util.Properties;
//
//import org.apache.poi.sl.usermodel.Sheet;
//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.ss.usermodel.Workbook;
//import org.apache.poi.ss.usermodel.WorkbookFactory;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import com.google.common.collect.Table.Cell;
//
//import Genenric_Utility.Excel_Utility;
//
//public class Create_Campaing {
//
//	public static void main(String[] args) throws Throwable {
//		String Key = "webdriver.driver.chrome";
//		String Value = "C:\\Users\\bhure\\Downloads\\chromedriver_win32.zip";
//		System.setProperty(Key, Value);
//	WebDriver driver = new ChromeDriver();
//	
//	
//	
//	driver.manage().window().maximize();
//	FileInputStream fis = new FileInputStream("./src/test/resources/PropertyData.properties.txt");
//	Properties pro = new Properties();
//	pro.load(fis);
//	
//	
//	String URL = pro.getProperty("url");
//	String USERNAME = pro.getProperty("username");
//	String PASSWORD = pro.getProperty("password");
//	
//	
//	driver.get(URL);
//	driver.findElement(By.name("user_name")).sendKeys(USERNAME);
//	driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
//	
//	driver.findElement(By.id("submitButton")).click();
//	driver.findElement(By.linkText("Products")).click();
//	driver.findElement(By.linkText("Products")).click();
//	driver.findElement(By.xpath("//img[@alt='Create Product...']")).click();
//	
//	Excel_Utility elib = new Excel_Utility();
//	String orgName = elib.getExcelData1("Sheet007", 0, 0);
//	
//	driver.findElement(By.name("productname")).sendKeys(orgName);
//	
////	FileInputStream efis = new FileInputStream("./src/test/resources/Book4040.xlsx.");
////	Workbook book = WorkbookFactory.create(efis);
////		Sheet sh = (Sheet) book.getSheet("Organizations");
////		Row row = ((org.apache.poi.ss.usermodel.Sheet) sh).getRow(0);
////		Cell cel = (Cell) row.getCell(0);
////		String ProductName1 = ((org.apache.poi.ss.usermodel.Cell) cel).getStringCellValue();
////		prd.productTextField(ProductName1);
//		
//		//driver.findElement(By.name("productname")).sendKeys(orgName);
//	
//	
//	
////	driver.findElement(By.name("productname")).sendKeys(ProductName);
////	driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
//	
//	
//	
//	}
//
//}
