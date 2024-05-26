package actionsPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollByAmount {

	public static void main(String[] args) throws InterruptedException {

	WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		WebElement myCareer1 = driver.findElement(By.linkText("Puma Shoes"));
		int coordinates = myCareer1.getRect().y;
		
		new Actions(driver)
		.scrollByAmount(0, coordinates)
		.click(myCareer1)
		.perform();
		
	}

}
