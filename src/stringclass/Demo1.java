package stringclass;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("program started");
String str1=new String("jspiders");
String str2=new String("jspiders");
System.out.println(str1);
System.out.println(str2);
int n1=str1.hashCode();
int n2=str2.hashCode();
System.out.println(n1);
System.out.println(n2);
System.out.println(str1==str2);
System.out.println(str1.equals(str2));

	}

}
