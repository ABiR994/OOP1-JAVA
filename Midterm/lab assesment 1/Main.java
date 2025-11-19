public class Main {
	public static void main(String[] args) {
		Item i1 = new Item("Pen", 20.0);
		i1.setQuantity(2);
		//System.out.println();
		i1.Display();
		Item.Show_total_Item();
		//System.out.println();
		
		Item i2 = new Item("Pencil", 5.0);
		i2.setQuantity(6);
		i2.Display();
		Item.Show_total_Item();
		//System.out.println();
		
		Item i3 = new Item("Paper", 2.0);
		i3.setQuantity(10);
		i3.Display();
		i3.setQuantity(20);
		System.out.println("Updated Quantity: " +i3.getQuantity());
		Item.Show_total_Item();
	}
}