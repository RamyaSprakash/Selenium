package equals;
/*overeride the equals method and in this case 
when we call eqausl method it will call the hash code methid original implementation*/
public class Person {
int age ;
String name;

	public Person(int age, String name) {
	this.age = age;
	this.name = name;
}
public boolean equals(Object o)//upcasting object is super class
{
	Person p=(Person)o;//downcasting
	return this.age==p.age && this.name==p.name;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Person p1=new Person(101,"Ramya");
Person p2=new Person(101,"Ramya");
System.out.println(p1==p2);//false
System.out.println(p1.equals(p2));//true 
	}

}
