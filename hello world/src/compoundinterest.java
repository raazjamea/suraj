
public class compoundinterest{
	public static void main(String[] args){
	  double p=2000;
	   double r=0.2;
		double a;
		for(int d=1;d<=15;d++){
			a=p*Math.pow(1+r, d);//very important
			System.out.println(d+" "+a);
		}
		
		
	                                          }

}
