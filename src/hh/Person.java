package hh;

public class Person {

	int hr ;
	int min; int sec;
	public Person(int hr,
	int min,int sec)
	{
		this. hr =hr;;
		this. min=min; 
		this. sec=sec;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Person p1 =new Person( 12 ,45,6);
        Person p2=new Person (12 ,45,6);
        System.out.println(p2.hashCode() );
        System.out.println(p1==p2);
        if(p1.equals(p2))
        {
        	System.out.println("same");
        }
        else 
        	System.out.println("different");
        
        
	}
	
	
	public boolean equals( Object o)
	{
		Person p=(Person) o;
		return this.hr==p.hr && this.min==p.min && this.sec== p.sec;
		
	}
	
	

}
