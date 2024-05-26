package actionsPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput;

public class ScrollOriginFromElement {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.hdfcbank.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		WebElement hdfcCapital = driver.findElement(By.linkText("HDFC Capital"));
        WheelInput.ScrollOrigin scrollOrigin = WheelInput.ScrollOrigin.fromElement(hdfcCapital);
        new Actions(driver)
                .scrollFromOrigin(scrollOrigin, 0, 160)
                .click(hdfcCapital)
                .perform();
                
	}

}
