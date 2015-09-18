package Logowanie;

import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.WebElement;

import Basement.MyDriver;

public class WnioskiSzkoleniowe {
	
	public static void manageWnioski(){
		
		MyDriver.driver.findElement(By.xpath(".//*[@id='innerContainer']/tbody/tr[2]/td[1]/div/ul/li[1]/ul/li[3]/span/a")).click();			
		MyDriver.driver.findElement(By.xpath(".//*[@id='mainArea']/table[3]/tbody/tr[1]/td/table/tbody/tr[2]/td[2]/table/tbody/tr/td[2]/table/tbody/tr[1]/td/a/span")).click();			
		MyDriver.driver.findElement(By.xpath(".//*[@id='idData_Template_result']/tbody/tr[1]/td/table/tbody/tr[2]/td[4]/a")).click();			
        //data rozpoczecia 
		MyDriver.driver.findElement(By.name("fieldValuetrfir000000000001621")).click();	
		MyDriver.driver.findElement(By.name("fieldValuetrfir000000000001621")).sendKeys("18.09.2015");	
		
		//data zakonczenia
		MyDriver.driver.findElement(By.name("fieldValuetrfir000000000001622")).click();	
		MyDriver.driver.findElement(By.name("fieldValuetrfir000000000001622")).sendKeys("21.09.2015");	
		
		//kategoria projektu
		MyDriver.driver.findElement(By.id("id1030Lookup")).click();		
		MyDriver.driver.findElement(By.xpath(".//*[@id='Box3DP_list']/div[2]/div")).click();	
//		MyDriver.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Mpk 
		MyDriver.driver.findElement(By.id("id1029Lookup")).click();		
		MyDriver.driver.findElement(By.xpath(".//*[@id='Box3DP_list']/div[1]/div")).click();	
		MyDriver.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//termin realizacji
		MyDriver.driver.findElement(By.xpath(".//*[@id='mainArea']/table[3]/tbody/tr[11]/td/table/tbody/tr/td/table[2]/tbody/tr[3]/td[2]/span/img")).click();				
		MyDriver.driver.findElement(By.xpath(".//*[@id='testdiv1']/table/tbody/tr/td/center/table[2]/tbody/tr[4]/td[3]/a")).click();	
		MyDriver.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//tytu³ oferty rozwojowej
		MyDriver.driver.findElement(By.ti("id1031Lookup")).click();		
		MyDriver.driver.findElement(By.xpath(".//*[@id='id1031']")).sendKeys("01_OPTI14.4 - Zgoda na kontakt z Klientem w celach marketingowych oraz zgoda na wczeœniejsze uruchomienie us³ug");	
		MyDriver.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
	//	MyDriver.driver.findElement(By.xpath("")).click();		
	}
	
	
}
