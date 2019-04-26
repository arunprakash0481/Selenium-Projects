package selenium.org;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.selenium.launch.Baseclass;

public class windowhandling extends Baseclass {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =  launchBrowser("https://www.lvbankonline.in/lvbretail/RetailLogin.html");
		WebElement name = driver.findElement(By.xpath("//*[@id='fldLoginUserId']"));
		name.sendKeys("kalai");
		WebElement pass = driver.findElement((By.xpath("//*[@id='fldPassword']")));
		pass.sendKeys("kalai");
		driver.findElement(By.xpath("(//input[@name='imageField'])[1]")).click();
		String pwind = driver.getWindowHandle();
		System.out.println(pwind);
		Set<String> allwind = driver.getWindowHandles();
		System.out.println(allwind);
		int c=0;
		for (String cwind : allwind) {
		if(c==1)
			{
			driver.switchTo().window(cwind);
			Thread.sleep(5000);
			driver.findElement(By.xpath("//a[@onclick='CloseAll()']")).click();
			}
			c++;
			
		}
		
		

	}

}
