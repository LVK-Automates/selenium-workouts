package seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RelativeLocatorsExample {

	public static void main(String[] args) throws InterruptedException {

		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		
		WebElement username = driver.findElement(By.name("username"));
		WebElement password = driver.findElement(By.name("password"));
		
		//Below
		WebElement loginBtn = driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']"));
		
		WebElement forgotPasswordLink = driver.findElement(RelativeLocator.with(By.tagName("p")).below(loginBtn));
		
		if(forgotPasswordLink.isDisplayed() && forgotPasswordLink.getText().trim().contains("Forgot"))
			System.out.println("Forgot your password link is displayed");
		else
			System.out.println("Not displayed");
		
		
		//Above
		
		WebElement passwordLabel = driver.findElement(RelativeLocator.with(By.tagName("label")).above(password));
		if(passwordLabel.isDisplayed())
			System.out.println("Password Label is above password field");
		else
			System.out.println("Password Label is not above password field");
		
		
		username.sendKeys("Admin");
		password.sendKeys("admin123");
		loginBtn.click();
		
		Thread.sleep(5000);
		
		
		//toRightOf
		
		WebElement selfReviewIcon = driver.findElement(By.xpath("//button[@class='oxd-icon-button oxd-icon-button--danger orangehrm-report-icon']"));
		WebElement pendingReviewText = driver.findElement(RelativeLocator.with(By.tagName("p")).toRightOf(selfReviewIcon));
		
		if(pendingReviewText.isDisplayed() && pendingReviewText.getText().contains("Pending Self Review"))
			System.out.println("Displayed to the right");
		else
			System.out.println("Not Displayed to the right");
		
		
		//toLeftOf
		WebElement candidateToInterview = driver.findElement(By.xpath("(//p[@class='oxd-text oxd-text--p'])[6]"));
		
		WebElement interviewIcon = driver.findElement(RelativeLocator.with(By.tagName("button")).toLeftOf(candidateToInterview));
		
		if(interviewIcon.isDisplayed())
			System.out.println("Displayed to left");
		else
			System.out.println("Not Displayed to left");
		
		//Near
		
		//WebElement myActionsIcon = driver.findElement(By.xpath("//i[@class='oxd-icon bi-list-check orangehrm-dashboard-widget-icon']"));
		
		WebElement nearIcon = driver.findElement(RelativeLocator.
				with(By.xpath("//i[@class='oxd-icon bi-list-check orangehrm-dashboard-widget-icon']")).near(selfReviewIcon));
		
		if(nearIcon.isDisplayed())
			System.out.println("Both are near");
		else
			System.out.println("Both are not near");
		
		
		
	}

}
