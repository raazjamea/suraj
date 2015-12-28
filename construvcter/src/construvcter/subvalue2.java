package construvcter;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class subvalue2 {
	FirefoxDriver b;
	subvalue2(FirefoxDriver y){
		b=y;
		}
	void logclick(){
		b.findElement(By.cssSelector("#u_0_x")).click();
	}
	
}
