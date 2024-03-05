package singleton;

public class AadhaarCard {
	private	static AadhaarCard ac;

	private AadhaarCard() {
		System.out.println("AadhaarCard Object Created");
	}

	public static void createAadhaarCardObject() {
		if(ac == null) {
			ac = new AadhaarCard();
		}
		else 
		{
			System.out.println("nope");
		}
	}

}
