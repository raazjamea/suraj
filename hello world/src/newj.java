import java.util.Scanner;
public class newj {
	public static void main(String[] args){
		int a[]=new int[4];
		for(int b=0;b<4;b++)
		{
			 System.out.print("enter the value in no. "+(b+1));
			Scanner x=new Scanner(System.in);	
			a[b]=x.nextInt();
		
		}	
		for(int c=0;c<4;c++)
		{   System.out.println(a[c]);
			
			
		}
	}

}
