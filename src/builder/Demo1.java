package builder;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StringBuilder s1=new StringBuilder("developer");
StringBuilder s2=new StringBuilder("developer");
System.out.println(s1);
System.out.println(s2);
System.out.println(s1.hashCode());
System.out.println(s2.hashCode());
System.out.println(s1.equals(s2));
System.out.println(s1==s2);


	}

}
