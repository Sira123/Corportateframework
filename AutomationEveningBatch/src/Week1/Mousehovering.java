package Week1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousehovering {
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "G:\\drivers\\geckodriver.exe"); 
		 FirefoxDriver ff=new FirefoxDriver();
		 ff.get("http://store.demoqa.com/");
		 ff.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement rv1 =ff.findElement(By.linkText("Product Category"));
		Actions a1=new Actions(ff);
		a1.moveToElement(rv1).build().perform();
		ff.findElement(By.linkText("iPhones")).click();
		
		 
		
	}

}
