package Logowanie;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Basement.MyDriver;

public class PickerTest {

	public static String getPickerHref(String name){
		String href;

		WebElement pickerElement = MyDriver.driver.findElement(By.xpath("//td[span/input[contains(@name,'" + name + "')]]/a"));

		href = pickerElement.getAttribute("href");

		href = href.substring(0, href.length() - 4); // usuwam z koñca hrefa ('')

		return href;

	}
}
