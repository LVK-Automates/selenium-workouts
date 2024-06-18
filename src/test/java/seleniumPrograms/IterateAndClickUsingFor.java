package seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class IterateAndClickUsingFor {

    public static void main(String[] args) throws InterruptedException {
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.guru99.com/");
        webDriver.manage().window().maximize();
        Thread.sleep(5000);
        List<WebElement> listObj = webDriver.findElements(By.tagName("a"));

        for(WebElement elem : listObj){

            if(elem.getText().trim().contains("Artificial Intelligence")){
                elem.click();
                break;
            }
        }
        // listObj.stream().filter(webElement -> webElement.getText().trim().contains("Artificial Intelligence")).forEach(WebElement::click);



    }


}
