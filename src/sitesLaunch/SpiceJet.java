package sitesLaunch;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SpiceJet {

static WebDriver driver;

static String AppUrl ="https://spicejet.com";

public static void main(String[] args) {

ChromeOptions options=new ChromeOptions();

Map<String, Object> prefs=new HashMap<String,Object>();

prefs.put("profile.default_content_setting_values.notifications", 1);

//1-Allow, 2-Block, 0-default

options.setExperimentalOption("prefs",prefs);

//WebDriverManager.chromedriver().setup();

driver = new ChromeDriver(options);

driver.get(AppUrl);

driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

// From City

driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']")).click();

driver.findElement(By.xpath("//div[text()='AMD']")).click();

// To City

driver.findElement(By.xpath("//div[@data-testid='to-testID-destination']")).click();

driver.findElement(By.xpath("//div[text()='BLR']")).click();

}

}