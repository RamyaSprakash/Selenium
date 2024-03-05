package hashcode;

public class Car {
String brand;
Car(String brand)
{
	this.brand=brand;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Car c1=new Car("Audi");
Car c2=new Car("BMW");
Car [] c=new Car[2];
c[0]=c1;
c[1]=c2;
for(int i=0;i<c.length;i++)
{
	System.out.println(c[i]);
}
System.out.println("------------");
for(int i=0;i<c.length;i++)
{
	System.out.println(c[i].brand);
}
	}
	
	//public String toString() {
		//return "Car [brand=" + brand + "]";
	//}

}
