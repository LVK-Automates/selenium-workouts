package actionsPrograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput;

public class ScrollOriginFromElementWithOffset {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.guru99.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		 WebElement vpnForIphone = driver.findElement(By.xpath("//a[contains(text(),'VPN for iPhone')]"));
	        WheelInput.ScrollOrigin scrollOrigin = WheelInput.ScrollOrigin.fromElement(vpnForIphone, 0, -50);
	        new Actions(driver)
	                .scrollFromOrigin(scrollOrigin,0, 100)
	                .pause(Duration.ofSeconds(3))
	                .click(vpnForIphone)
	                .perform();
	
	       
	
	
	}

}
