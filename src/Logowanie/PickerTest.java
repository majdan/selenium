package Logowanie;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Basement.MyDriver;

public class PickerTest {

	public static String getPickerHref(String name){
		String href;

		WebElement pickerElement = MyDriver.driver.findElement(By.xpath(".//*[@id='wdkApplicationWindow']/table/tbody/tr[1]/td/div/form/table[4]/tbody/tr[5]/td[6]/a"));

		href = pickerElement.getAttribute("href");

	//	href = href.substring(0, href.length() - 4); // usuwam z koñca hrefa ('')

		return href;

	}
}
