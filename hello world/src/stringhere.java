
public class stringhere {
int month;
int day;
int year;

  public stringhere(int m,int d,int y){
	month=m;
	day=d;
	year=y;
	System.out.printf("here are follows %s",this);
}

public String toString(){
	
	return String.format("%d/%d/%d",month,day,year);
	
                              }




}
