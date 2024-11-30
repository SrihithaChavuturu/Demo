package Mavan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.get("https://www.amazon.in/");
		By search=By.id("twotabsearchtextbox");
		WebElement ele = d.findElement(search);
		ele.sendKeys("iphone");
		By id=By.id("nav-search-submit-button");
		WebElement ele1=d.findElement(id);
		ele1.sendKeys("iphone");
		By chk=By.id("check");
		WebElement ele3=d.findElement(chk);
		ele3.click();
		d.close();
	}

}
