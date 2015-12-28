package parameterized;

import org.openqa.selenium.By;

class cmain {

	public static void main(String[] args)throws InterruptedException{
		
		c1 b=new c1();
		b.a.get("https://www.facebook.com");
		//b.a.manage().window().maximize();
		b.prin("log in- ");
		//b.web(b.a.findElement(By.xpath(".//*[@id='u_0_x']")));
		b.click(By.xpath(".//*[@id='u_0_x']"));
		b.prin("sign up- ");
		b.click(By.xpath(".//*[@id='blueBarNAXAnchor']/div/div[2]/div/div/span/a"));
	    b.title();
	    b.prin("sign up equals- (Sign Up for Facebook | Facebook)= ");
	    b.equals("Sign Up for Facebook | Facebook");
	    b.prin("sign contains-{Sign Up for Facebook}= ");
	    b.con("Sign Up for Facebook");
	    b.prin("sign up- ");
	    b.disp(By.xpath(".//*[@id='u_0_9']"));
	  
	    Thread.sleep(5000);
	    b.a.quit();
	
	
	}

}
