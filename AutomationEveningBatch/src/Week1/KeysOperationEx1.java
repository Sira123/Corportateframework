package Week1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;

public class KeysOperationEx1 {
	public static void main(String[] args) {
		
		
		
		 System.setProperty("webdriver.gecko.driver", "G:\\drivers\\geckodriver.exe"); 
		 FirefoxDriver ff=new FirefoxDriver();
		 ff.get("http://desktop-hhtfbov/login.do");
		 ff.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 ff.findElement(By.name("username")).sendKeys("admin");
		 ff.findElement(By.name("pwd")).sendKeys("manager");
		 ff.findElement(By.xpath("//input[@type='submit']")).click();
		 ff.findElement(By.linkText("Projects & Customers")).click();
		ff.findElement(By.xpath("//input[@value='Add New Customer']")).click();
		ff.findElement(By.name("name")).sendKeys("Sira1233"+Keys.CONTROL+"a"+"c");
		ff.findElement(By.name("description")).sendKeys(Keys.CONTROL+"v");
	}

}
