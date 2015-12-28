package construvcter;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class subvalue1 {
FirefoxDriver b;
	subvalue1(FirefoxDriver y){
		b=y;
		
	}
	void login(){
		b.findElement(By.cssSelector("#pass")).sendKeys("12345");
		
	}
	
}
