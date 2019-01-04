package Week1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SampleTestScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "G:\\SeleniumStandAloneServer\\work\\mozilla\\geckodriver.exe");	
		FirefoxDriver rv1=new FirefoxDriver();
		rv1.get("http://desktop-hhtfbov/login.do");
		Dimension rv=new Dimension(600, 600);
		rv1.manage().window().setSize(rv);
		rv1.manage().window().maximize();
		String s=rv1.getTitle();
		System.out.println(s);
	    
		rv1.manage().deleteAllCookies();
		
		

	}

}
