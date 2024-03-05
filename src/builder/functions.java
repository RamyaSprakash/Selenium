package builder;

public class functions {
public static void main(String[] args) {
	StringBuilder s1=new StringBuilder("developer");
	System.out.println(s1);
	System.out.println(s1.append('s'));
	System.out.println("to insert the character at given pos");
	System.out.println(s1.insert(3, 'w'));
	System.out.println("to replace a character");
	s1.setCharAt(3, 'E');
	System.out.println(s1);
	System.out.println("to reverse a given string");
	s1.reverse();
	System.out.println(s1);
	
}
}
