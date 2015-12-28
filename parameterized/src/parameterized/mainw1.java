package parameterized;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class mainw1 {
	FirefoxDriver a=new FirefoxDriver();
	void c(String ab,String ac,String ad){
		a.findElement(By.cssSelector(ab)).sendKeys(ad);
		a.findElement(By.cssSelector(ac)).click();
	}
	
}
