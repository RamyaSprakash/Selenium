package tostring;

public class Employee {
int id;
String name ;
public Employee(int id, String name) {
	this.id = id;
	this.name = name;
}
public String toString()
{
	return "Employee[ name is "+name +" and id is "+id+" ]";
}
public static void main(String[] args) {
	Employee e=new Employee(8090026,"Ramya");
	Employee e1=new Employee(909088,"Tanya");
	System.out.println(e);
	System.out.println(e1);
}
/*@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + "]";
}*/
}
