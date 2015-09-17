package Logowanie;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import Basement.MyDriver;

public class WnioskiSzkoleniowe {
	
	public static void manageWnioski(){
		
		MyDriver.driver.findElement(By.xpath(".//*[@id='innerContainer']/tbody/tr[2]/td[1]/div/ul/li[1]/ul/li[3]/span/a")).click();			
		MyDriver.driver.findElement(By.xpath(".//*[@id='mainArea']/table[3]/tbody/tr[1]/td/table/tbody/tr[2]/td[2]/table/tbody/tr/td[2]/table/tbody/tr[1]/td/a/span")).click();			
		MyDriver.driver.findElement(By.xpath(".//*[@id='idData_Template_result']/tbody/tr[1]/td/table/tbody/tr[2]/td[4]/a")).click();			
	//	MyDriver.driver.findElement(By.xpath(".//*[@id='fieldValuetrfir000000000001621_dateImgLink']/img")).click();			
	//	MyDriver.driver.findElement(By.xpath(".//*[@id='wdkApplicationWindow']/table/tbody/tr[1]/td/div/form/table[4]/tbody/tr[5]/td[3]/a")).click();	
		
		MyDriver.driver.findElement(By.xpath(".//*[@id='id1011']")).click();	
		
		MyDriver.driver.findElement(By.name(".//*[@id='id1011']")).sendKeys("15.09.2015");	
		
		MyDriver.driver.findElement(By.xpath(".//*[@id='fieldValuetrfir000000000001622_dateImgLink']/img")).click();		
		MyDriver.driver.findElement(By.xpath(".//*[@id='wdkApplicationWindow']/table/tbody/tr[1]/td/div/form/table[4]/tbody/tr[5]/td[4]/a")).click();		
		MyDriver.driver.findElement(By.xpath(".//*[@id='id1032Lookup']")).click();		
		MyDriver.driver.findElement(By.xpath(".//*[@id='id1029Lookup']")).click();		
		MyDriver.driver.findElement(By.xpath(".//*[@id='Box3DP_list']/div/div")).click();		
		MyDriver.driver.findElement(By.xpath(".//*[@id='mainArea']/table[3]/tbody/tr[11]/td/table/tbody/tr/td/table[2]/tbody/tr[3]/td[2]/span/img")).click();		
		MyDriver.driver.findElement(By.xpath(".//*[@id='testdiv1']/table/tbody/tr/td/center/table[2]/tbody/tr[2]/td[2]/a")).click();		
		MyDriver.driver.findElement(By.xpath(".//*[@id='id1030Lookup']")).click();		
		MyDriver.driver.findElement(By.xpath(".//*[@id='Box3DP_list']/div[2]/div")).click();		
		MyDriver.driver.findElement(By.xpath(".//*[@id='id1031Lookup']")).click();		
		
		MyDriver.driver.findElement(By.xpath(".//*[@id='Box3DP_list']/div[4]/div")).click();		
		MyDriver.driver.findElement(By.xpath(".//*[@id='id1010']")).click();		
		MyDriver.driver.findElement(By.xpath(".//*[@id='id1010']/option[2]")).click();		
		
	//	MyDriver.driver.findElement(By.xpath("")).click();		
	}
	
}
