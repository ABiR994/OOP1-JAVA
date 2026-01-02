public class Administrator extends Staff {
	private double salary;

	Administrator(String name, int age, double salary) {
		super(name, age);
		this.salary = salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public void calculateSalary() {
		System.out.println("Administrator Salary: " + this.salary);
	}

	@Override
	public String toString() {
		String admin = "Administrator Details:\n" + "Name: " + getName() + "\nAge: " + getAge() + "\nSalary: " + salary;
		return admin;
	}
}