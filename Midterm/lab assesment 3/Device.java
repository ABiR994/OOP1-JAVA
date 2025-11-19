public class Device {
	private String brand;
	private double price;
	
	Device(String brand, double price) {
		this.brand = brand;
		this.price = price;
	}
	
	void display() {
		System.out.println("Brand: " +this.brand);
		System.out.println("Price: " +this.price);
	}
}