public abstract class Staff extends Person {
	private static final String schoolName = "ABC School";

	Staff(String name, int age) {
		super(name, age);
	}

	public static final void displaySchool() {
		System.out.println("School Name: " + schoolName);
	}

	public abstract void calculateSalary();
}