package sitesLaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Safe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new SafariDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/");
		System.out.println(driver.getTitle());
		driver.close();

	}

}
