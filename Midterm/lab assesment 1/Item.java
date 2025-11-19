public class Item {
	private String item_name;
	private double item_price;
	private int quantity;
	private static int total_item;
	
	static {
		System.out.println("Cart System Loaded");
		total_item = 0;
	}
	
	Item() {
		total_item++;
	}
	
	Item(String item_name, double item_price) {
		this.item_name = item_name;
		this.item_price = item_price;
		total_item++;
	}
	
	void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	int getQuantity() {
		return quantity;
	}
	
	static void Show_total_Item() {
		System.out.println("Total Item: " +total_item);
	}
	
	void Display() {
		System.out.println("Item Name: " +item_name);
		System.out.println("Item Price: " +item_price);
		System.out.println("Item Quantity: " +quantity);
	}
}