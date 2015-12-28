package parameterized;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class c1 {
	FirefoxDriver a=new FirefoxDriver();
	
	void web(WebElement e){
		System.out.println(e.isDisplayed());
	}
	void prin(String t){
		System.out.print(t);
	}
	void click(By r){
		disp(r);
		a.findElement(r).click();
	}
	void title(){
	 prin("title is= ");
       f(); 
		System.out.print(a.getTitle());
		l();
     }
    void equals(String r){
    	f();
    	System.out.print(a.getTitle().equals(r));
    	l();
    }
    void con(String v){
    	f();
    	System.out.print(a.getTitle().contains(v));
    	l();
    }
    void text(By u){
    	System.out.println(a.findElement(u).getText());
    	}
    void disp(By t){
    	prin("display is= ");
    	f();
    	System.out.print(a.findElement(t).isDisplayed());
        l();  
    }
    void f(){
    	System.out.print("(");
    }
    void l(){
    	System.out.println(")");
    	
    }
}
