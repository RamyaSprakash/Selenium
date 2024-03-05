package tostring;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Battery b=new Battery(50);
System.out.println(b);
b.discharging(40);
System.out.println(b);
b.charging(30);
System.out.println(b);
	}

}
