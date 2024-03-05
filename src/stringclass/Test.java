package stringclass;

public class Test {
public static void main(String[] args) {
		
		// Empty Representation of a String Object
		String s1 = new String();
		System.out.println(s1);
		
		// Passing a String Object
		String s2 = new String("dinga");
		System.out.println(s2);
		
		char[] ch = {'j', 'a', 'v', 'a'};
		
		// Converting an Array of Characters to String
		String s3 = new String(ch);
		System.out.println(s3);
		
	}

}
