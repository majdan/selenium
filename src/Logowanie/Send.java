package Logowanie;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;

import Basement.MyDriver;

public class Send {
	
	public static void manageDriver(){   
		//  Wait For Page To Load
	    MyDriver.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
		// Navigate to URL
	    MyDriver.driver.get("http://172.30.4.161/Saba/Web/Main");
	    
	    MyDriver.driver.manage().window().maximize();
	    
	    MyDriver.driver.switchTo().frame("SabaMain");
	    
	    MyDriver.driver.findElement(By.name("j_username")).click();	
	    MyDriver.driver.findElement(By.name("j_username")).sendKeys("mokon");	
	    MyDriver.driver.findElement(By.name("j_password")).click();	
	    MyDriver.driver.findElement(By.name("j_password")).sendKeys("welcome");
	    MyDriver.driver.findElement(By.xpath("html/body/form/div/div[2]/div[2]/div[3]/div[1]/table/tbody/tr[1]/td/a")).click();
			
		//Close the browser.
	    //driver.close();
	}
}
