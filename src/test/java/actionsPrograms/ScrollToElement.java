package actionsPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollToElement {

	public static void main(String[] args) throws InterruptedException {

	WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.guru99.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);

		WebElement vpnForIPhone = driver.findElement(By.xpath("//a[contains(text(),'VPN for iPhone')]"));
		
		new Actions(driver)
			.scrollToElement(vpnForIPhone)
			.perform();
		
		vpnForIPhone.click();
	}

}
