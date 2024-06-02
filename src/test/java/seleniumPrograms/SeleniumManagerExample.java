package seleniumPrograms;

import jdk.nashorn.internal.runtime.options.Options;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.openqa.selenium.manager.SeleniumManager;
import org.openqa.selenium.remote.service.DriverFinder;
import org.openqa.selenium.remote.service.DriverService;

import java.io.IOException;
import java.net.URL;
import java.util.Map;

public class SeleniumManagerExample {

    public static void main(String[] args) throws IOException {

        DriverService driverService = new ChromeDriverService.Builder().build();
        Capabilities capabilities = new ChromeOptions();

        DriverFinder driverFinder = new DriverFinder(driverService,capabilities);
        String driverPath = driverFinder.getDriverPath();
        System.out.println(driverPath);
        driverService.start();

        System.out.println(driverService.isRunning());
        URL url = driverService.getUrl();
        System.out.println(url.getProtocol());
        String driverProperty = driverService.getDriverProperty();
        System.out.println(driverProperty);

    }

}
