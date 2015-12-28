package parameterized;

import org.openqa.selenium.firefox.FirefoxDriver;

public class mainw {

	public static void main(String[] args) {
		mainw1 t=new mainw1();
		t.a.get("https://www.facebook.com");
		
		t.c("#email","#u_0_x","hello");

	}

}
