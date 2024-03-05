package hashcode;

public class Laptop {
	String brand;
	int cost;
	String ramSize;

	Laptop(String brand, int cost, String ramSize) {
		this.brand = brand;
		this.cost = cost;
		this.ramSize = ramSize;
	}

	@Override
	public String toString() {
		return "Brand:"+brand+
				" Cost:"+cost+
				    " RAM Size:"+ramSize;
	}

}
