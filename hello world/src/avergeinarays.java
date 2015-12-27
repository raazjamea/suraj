
public class avergeinarays {
	public static void main(String[] arg){
		int x[]={1,1,1,1,1};
	System.out.println(re(x));
	
	}
	public static int re(int c[]) {  
		int total=0;
for(int a:c){
	total+=a;
	
}
	
	return total/c.length;
	}
	
}
