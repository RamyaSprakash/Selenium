package stringclass;

public class Demo2 {
static void second()
{
	String s3="Jspiders";
	String S4="Jspiders";
	System.out.println(s3==S4);
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1=new String("Jspiders");
String s2=new String ("Jspiders");
System.out.println(s1);
System.out.println(s2);
System.out.println(s1.hashCode());
System.out.println(s2.hashCode());
System.out.println(s1==s2);
System.out.println(s1.equals(s2));
second();
	}

}
