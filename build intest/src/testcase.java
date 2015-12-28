
public class testcase {

	public static void main(String[] args) {
		String m="hello miss";
		String s=" hello sir";

	System.out.println(m.equals(s));
	System.out.println(m.contains(s));
	System.out.println(m.concat(" lata"));
	System.out.println(m.compareTo(s));
	System.out.println(m.contains("miss"));
	System.out.println(s.contains("miss"));
	System.out.println(m.length());
	System.out.println(m.endsWith("miss"));
	System.out.println(m.startsWith("he"));
	System.out.println(m.indexOf("o"));
	System.out.println(m.replace("miss","sir"));
	System.out.println(s.substring(1,4));
	System.out.println(s.toUpperCase());
	System.out.println(s.trim());
	String[] f=m.split(" "); 
	System.out.println(f[1]);
	String i="4";
	String i1="5";
	int e=Integer.parseInt(i);
	int e1=Integer.parseInt(i1);
	System.out.println(e+e1);
	
	}

}
