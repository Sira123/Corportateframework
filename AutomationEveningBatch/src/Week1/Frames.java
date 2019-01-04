package Week1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frames {
	
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver", "G:\\drivers\\geckodriver.exe");
	FirefoxDriver ff=new FirefoxDriver();
	ff.get("file:///C:/Users/harrshaa/Desktop/ParentPage1.html");
	ff.findElement(By.name("Lang")).click();
	//ff.switchTo().frame("fr");
	WebElement rv1=ff.findElement(By.xpath("//iframe[@type='fr1']"));
	ff.switchTo().frame(rv1);
	ff.findElement(By.id("un")).sendKeys("java");
	ff.switchTo().defaultContent();
	ff.findElement(By.id("weekday")).click();
	

	
}

}
