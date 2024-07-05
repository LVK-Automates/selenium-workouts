package seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorBodyExample {


    public static void main(String[] args) throws InterruptedException {

        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        webDriver.manage().window().maximize();
        Thread.sleep(3000);
        String text = webDriver.findElement(By.cssSelector("BODY")).getText();
        System.out.println(text);
    }
}
