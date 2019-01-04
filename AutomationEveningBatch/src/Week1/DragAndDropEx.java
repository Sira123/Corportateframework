package Week1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "G:\\drivers\\geckodriver.exe"); 
		 FirefoxDriver ff=new FirefoxDriver();
		 ff.get("http://jqueryui.com/resources/demos/droppable/default.html");
		 ff.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 WebElement source = ff.findElement(By.id("draggable"));
		 WebElement target=ff.findElement(By.id("droppable"));
		 Actions a1=new Actions(ff);
		 a1.dragAndDrop(source, target).build().perform();
		 

	}

}
