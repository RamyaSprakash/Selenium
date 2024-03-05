package hashcode;

public class Customer {
public static void main(String[] args) {
		
		Laptop l1 = new Laptop("HP", 2000, "4GB");
		Laptop l2 = new Laptop("Dell", 3000, "8GB");
		Laptop l3 = new Laptop("Lenovo", 7000, "16GB");
		Laptop l4 = new Laptop("Acer", 2500, "2GB");
		
		Laptop[] l = {l1, l2, l3, l4};
		
		for(int i=0; i<l.length; i++) {
			System.out.println(l[i]);
		}

}
}