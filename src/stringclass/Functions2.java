package stringclass;
//J a v a d e v e l o p e r
//0 1 2 3 4 5 6 7 8 9 10 11 12
public class Functions2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="Javadeveloper";
//since toString method is overrdidden it vl print the string value
System.out.println(s);
System.out.println("---------------------------------->");
//returns the total  no of character in the given string  even spaces vl be counted
System.out.println(s.length());
System.out.println("---------------------------------->");
// convert the given string to upper case
System.out.println(s.toUpperCase());
System.out.println("---------------------------------->");
//convert the given string to lower case
System.out.println(s.toLowerCase());
System.out.println("---------------------------------->");
//returns true if the string starts with speciffies sequence of characters 
System.out.println(s.startsWith("Java"));
System.out.println("---------------------------------->");
//returns true if the string ends with speciffies sequence of characters 
System.out.println(s.endsWith("per"));
System.out.println("---------------------------------->");
//returns the charcter @gieven index position 
System.out.println(s.charAt(4));
System.out.println("---------------------------------->");
//returns first occurence index of given char ..if char is not present returns -1

System.out.println(s.indexOf('e'));
System.out.println("---------------------------------->");
//starts looking for the character from given index

System.out.println(s.indexOf('e', 6));
System.out.println("---------------------------------->");
//start from the last character ,,,,,,,traverse in reverse direction
System.out.println(s.lastIndexOf('e'));

System.out.println("---------------------------------->");

System.out.println(s.lastIndexOf('e', 10));

System.out.println("---------------------------------->");

//check whether the character or part of string present in given string or not 
System.out.println(s.contains("dev"));
System.out.println("---------------------------------->");
//returns specifies sequence of characters from given index till end 
System.out.println(s.substring(8));

System.out.println("---------------------------------->");
//returns specifies sequence of characters from given index and end index ecxcluded

System.out.println(s.substring(4, 11));

System.out.println("---------------------------------->");

String s1="a";
String s2="b";
System.out.println(s1==s2);
System.out.println(s1.equals(s2));
int n=s1.compareTo(s2);//sort the strings in array or collections based on ascii value
//a=97 and b=98 97-98=-1
System.out.println(n);







//to split a string based on delimeter


String s5="java_sql_web_j2ee_frameworks";
System.out.println(s5);

String obj[]=s5.split("_");

//returns array of string 
for (int i=0;i<obj.length;i++)
{
	System.out.println(obj[i]);
}

//to reverse a string
String s10="deepak";
for(int i=s10.length()-1;i>=0;i--)
{
	System.out.print(s10.charAt(i));
}
	}

}
