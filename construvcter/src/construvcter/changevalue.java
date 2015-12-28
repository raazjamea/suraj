package construvcter;

import org.openqa.selenium.firefox.FirefoxDriver;

public class changevalue {
	

	public static void main(String[] args) {
		FirefoxDriver s=new FirefoxDriver();
		subvalue i=new subvalue(s);
        i.k();
        subvalue1 e=new subvalue1(s); 
        e.login();
        subvalue2 f=new subvalue2(s); 
        f.logclick();
        
        
	//s.quit();
	
	}
	

}
