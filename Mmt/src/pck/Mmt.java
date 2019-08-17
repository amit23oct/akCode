package pck;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Mmt {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "../Mmt/chromedriver.exe");
		ChromeDriver driver = new  ChromeDriver();
		driver.get("https://www.makemytrip.com");
		driver.manage().window().maximize();
		Actions ac=new Actions(driver);
		WebElement frm=driver.findElementByXPath("//input[@id=\"fromCity\"]");
		frm.click();
		ac.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		/*
		 * ac.keyUp(Keys.TAB).perform(); WebElement
		 * too=driver.findElementByXPath("//input[@id=\"toCity\"]"); too.click();
		 * ac.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).
		 * build().perform();
		 */
		
		
		}

}
