public class Student{
	String name;
	int id;
	static String uni = "AIUB";
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setID(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public int getID() {
		return id;
	}
	
	public void display() {
		System.out.println("Name: " + name);
		System.out.println("ID: " + id);
		System.out.println("University: " + uni);
	}
}