package stringclass;

public class Functions {
public static void main(String[] args) {
	String s="Software Developer";
	System.out.println(s);
	System.out.println("----------------------------------");
	System.out.println(s.length());//18
	System.out.println("----------------------------------");
	System.out.println(s.startsWith("soft"));//false
	System.out.println(s.startsWith("Soft"));//true
	System.out.println("----------------------------------");
	System.out.println(s.endsWith("er"));//true
	System.out.println(s.endsWith("Eloper"));//false
 System.out.println("----------------------------------");
 System.out.println(s.toUpperCase());//SOFTWARE DEVELOPER
 System.out.println("----------------------------------");
 System.out.println(s.toLowerCase());//software developer
 System.out.println("--------------------------------------");
 System.out.println(s.contains("dev"));//false
 System.out.println(s.contains("Dev"));//true
 System.out.println("----------------------------------");
 System.out.println(s.concat("IN TY"));// Software Developer IN TY
 System.out.println("----------------------------------");
 System.out.println(s.substring(3)); //tware Developer
 System.out.println(s.substring(3, 7));//twar //exclude last character index
 System.out.println("      ----------------------------------------->");
 
 System.out.println(s.charAt(3));//t
 System.out.println(s.charAt(5));//a
 
 System.out.println(" ---------------------------->");
 
 System.out.println(s.indexOf('Y'));//2
 
 
 
 
 String a="Java";
 String b="jAVa";
 String c="Java";
 System.out.println(a.equals(c));//true
 System.out.println(a.equals(b));//false
 System.out.println(a.equalsIgnoreCase(b));//true
}
}
