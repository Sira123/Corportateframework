package Week1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BulkElements {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "G:\\drivers\\geckodriver.exe");
		FirefoxDriver ff=new FirefoxDriver();
		ff.get("file:///C:/Users/harrshaa/Desktop/Checkbox.html");
		   List<WebElement> rv1 = ff.findElements(By.xpath("//input[@type='checkbox']"));
		 for(int i=0;i<=rv1.size()-1;i++)
		 {
			 rv1.get(i).click();
		 }
		
		
	}

}
