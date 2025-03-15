package AssignmentFile;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/upload");
		
		WebElement uploadfile =driver.findElement(By.id("file-upload"));
		
		
		uploadfile.sendKeys("C:\\Users\\kanav\\Downloads\\R_System_assignment-20250315T135126Z-001.zip");
		
		WebElement clickUpload=driver.findElement(By.id("file-submit"));
		clickUpload.click();
		
		System.out.println("Successfullu Uploaded"+ uploadfile);
		driver.close();
		
	}

}
