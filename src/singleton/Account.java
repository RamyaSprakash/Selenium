package singleton;

public class Account {
private static Account ac=null;
private Account() {
	System.out.println("accpount can be created");
}

public static void create()
{
	if(ac==null)
	{
		ac=new Account();
	}
	else {
		System.out.println("cannot be created");
	}
}
}
