package AssignmentFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingframe {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		 FileInputStream fis = new FileInputStream("C:\\Users\\kanav\\eclipse-workspace\\herokuapp\\src\\test\\resources\\data\\data.xlsx");
			
			Workbook book = WorkbookFactory.create(fis);
			
		  String username = book.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		  String password = book.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		  Thread.sleep(4000);
		  
		// Locate login elements and perfrom login
		 driver.findElement(By.xpath("//input[@id='username']")).sendKeys("username");
		 driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password");
		 Thread.sleep(5000);
	    driver.findElement(By.xpath("//button[@id='submit']")).click();
		
		
		Thread.sleep(5000);
		fis.close();
		driver.quit();
	}      
       
	}

