package AssignmentFile;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.poi.hpsf.Array;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowHandles {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/#Open%20New%20Tab");
		
		driver.findElement(By.id("Open New Window")).click();
		driver.findElement(By.partialLinkText("Click Here")).click();
		
		Set<String> WinId = driver.getWindowHandles();

		List<String>WinList=new ArrayList<String>(WinId);
		String parentID=WinList.get(0);
		String childID=WinList.get(1);
		
		driver.switchTo().window(parentID);
		System.out.println(driver.getTitle());
		
		driver.quit();
	}

}
