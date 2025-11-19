public class Main {
	public static void main(String[] args) {
		Laptop[] lp = new Laptop[4];
		lp[0] = new Laptop("HP", 122.45, 8);
		lp[1] = new Laptop("Lenovo", 223.60, 16);
		lp[2] = new Laptop("ASUS", 250.00, 16);
		lp[3] = new Laptop("Acer", 112.05, 8);
		
		for(int i = 0; i < 4; i++) {
			lp[i].display();
		}
		
		Laptop.displayTotalLaptops();
		
	}
}
