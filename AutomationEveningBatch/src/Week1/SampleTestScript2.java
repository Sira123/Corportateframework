package Week1;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SampleTestScript2 
{
      public static void main(String[] args) {
	
    System.setProperty("webdriver.gecko.driver", "G:\\drivers\\geckodriver.exe");
    FirefoxDriver ff=new FirefoxDriver();
    ff.get("file:///C:/Users/harrshaa/Desktop/QspidersPunjagutta.html");
    ff.findElement(By.id("un")).sendKeys("sira");
    ff.findElement(By.name("pwd")).sendKeys("sira");
    ff.findElement(By.className("login")).click();
    ff.findElement(By.id("cb2")).click();
    ff.findElement(By.className("male")).click();
    ff.findElement(By.linkText("actitime")).click();
   //ff.findElement(By.partialLinkText("acti")).click();
    
    
    	  
    	  
    	  
    	  
	}
}
