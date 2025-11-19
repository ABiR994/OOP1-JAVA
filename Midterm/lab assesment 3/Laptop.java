public class Laptop extends Device {
	private int ram;
	private static int totalLaptops;
	
	static {
		totalLaptops = 0;
	}
	
	Laptop(String brand, double price, int ram) {
		super(brand, price);
		this.ram = ram;
		totalLaptops++;
	}
	
	void setRAM(int ram) {
		this.ram = ram;
	}
	
	int getRAM() {
		return ram;
	}
	
	void display() {
		super.display();
		System.out.println("RAM: " +this.ram);
	}
	
	static void displayTotalLaptops() {
		System.out.println("Total Laptops: " +totalLaptops);
	}
}