package equals;

public class Student {
String name;
Student(String name)
{
	this.name=name;
}
	public static void main(String[] args) {

		// TODO Auto-generated method stub
		//in this case even the name is same ...but hashcode of object will be different for erach object
		//and for literal it will become true s1==s2
Student s1=new Student("Ramya");
Student s2=new Student("Ramya");
System.out.println(s1==s2);
System.out.println(s1.equals(s2));
	}

}
