public class Student {
	private String name;
	private int rollNo;
	private double marks;

	Student(String name, int rollNo, double marks) {
		this.name = name;
		this.rollNo = rollNo;
		this.marks = marks;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public double getMarks() {
		return marks;
	}

	public void displayResult() {
		System.out.println("Student Details:");
		System.out.println("Name: " + this.name);
		System.out.println("Roll No: " + this.rollNo);
		System.out.println("Marks: " + this.marks);
	}
}