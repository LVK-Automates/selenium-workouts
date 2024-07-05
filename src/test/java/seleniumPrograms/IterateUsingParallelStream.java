package seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class IterateUsingParallelStream {


    public static void main(String[] args) throws InterruptedException {


            WebDriver driver = new ChromeDriver();
            driver.get("https://www.guru99.com/");
            driver.manage().window().maximize();
            Thread.sleep(3000);
            By by = By.tagName("a");
            List<WebElement> listObj = driver.findElements(by);
            listObj.parallelStream().map(WebElement::getText).forEach(System.out::println);
    }
}
