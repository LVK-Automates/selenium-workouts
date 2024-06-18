package seleniumPrograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput;

public class ActionsExamples {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.guru99.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
/*		WebElement myCareer = driver.findElement(By.xpath("//a[contains(text(),'VPN for iPhone')]"));
		
		new Actions(driver)
			.scrollToElement(myChttps://github.com/LVK-Automates/selenium-workouts.gitareer)
			.perform();
		
		myCareer.click();
		
		*/
		
/*		WebElement myCareer1 = driver.findElement(By.xpath("//a[contains(text(),'VPN for iPhone')]"));
		int coordinates = myCareer1.getRect().y;
		
		new Actions(driver)
		.scrollByAmount(0, coordinates)
		.click(myCareer1)
		.perform();
		*/
		
		//myCareer1.click();
		
		
	/*     WebElement sql = driver.findElement(By.linkText("SQL"));
	        WheelInput.ScrollOrigin scrollOrigin = WheelInput.ScrollOrigin.fromElement(sql);
	        new Actions(driver)
	                .scrollFromOrigin(scrollOrigin, 0, 160)
	                .click(sql)
	                .perform();
	                */
		
		 WebElement vpnForIphone = driver.findElement(By.xpath("//a[contains(text(),'VPN for iPhone')]"));
	        WheelInput.ScrollOrigin scrollOrigin = WheelInput.ScrollOrigin.fromElement(vpnForIphone, 0, -50);
	        new Actions(driver)
	                .scrollFromOrigin(scrollOrigin,0, 100)
	                .pause(Duration.ofSeconds(3))
	                .click(vpnForIphone)
	                .perform();
	
	       
	
	
	}

}
