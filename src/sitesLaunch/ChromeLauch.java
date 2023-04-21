package sitesLaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class ChromeLauch {

	
	public static void main(String[] args) {
		
	     //Browser Setup
	     System.setProperty("webdriver.chrome.driver", "/Users/madhavkharge/Downloads/chromedriver 6");
		
	     //WebDriverManager.chromedriver().setup();
	
	    //Browser Open
        WebDriver driver=new ChromeDriver();
        
        //Browser Maximum
	    driver.manage().window().maximize();
	    
        //URL Open
	    driver.get("https://demo.guru99.com/V1/index.php");
	    
	    
//	    System.out.println(driver.getTitle());
//	    System.out.println(driver.getCurrentUrl());
//	    
	    
	    driver.findElement(By.name("uid")).sendKeys("mngr450618");
	    driver.findElement(By.name("password")).sendKeys("ebunadE");
	   // driver.findElement(By.name("btnLogin")).click();
	    
	    
	   System.out.println(driver.findElement(By.name("btnReset")).getTagName());
	   
//	    String t =driver.findElement(By.name("btnReset")).getTagName();
//	    System.out.println(t);
	    
	  
	    // error msg print 
//	     String t1= driver.findElement(By.name("btnReset")).getText();
//	     System.out.println(t1);
//	    
	    
	    System.out.println(driver.getTitle());
	    
//	    String url   = driver.getCurrentUrl();
//	    String title = driver.getTitle();
//	    
//	    System.out.println(url);
//	    System.out.println(title);
	    
	    driver.close();
	    
	}
}
