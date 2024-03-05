package stringclass;

import java.util.Scanner;

public class Login {
public static void main(String[] args) {
	String username="admin";
	String password="admineps";
	Scanner sc1=new Scanner(System.in);
	System.out.println("enetr the username");
	String iu=sc1.next();
	System.out.println("enter the poassword");
	String ip=sc1.next();
	
	if((username.equals(iu)) && (password.equals(ip)))
			{
		
		System.out.println("login succesfull");
			}
	else 
	{
		System.out.println("usetname or password is invalid");
	}
}
}
