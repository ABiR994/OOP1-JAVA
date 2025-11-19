public class Employee {
	private String name;
	private double salary;
	private int age;
	
	Employee(String name, double salary, int age) {
		this.name = name;
		this.salary = salary;
		this.age = age;
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	String getName() {
		return name;
	}
	
	void setSalary(double salary) {
		this.salary = salary;
	}
	
	double getSalary() {
		return salary;
	}
	
	void setAge(int age) {
		this.age = age;
	}
	
	int getAge() {
		return age;
	}
	
	void displayEmp() {
		System.out.println("Name: " + this.name);
		System.out.println("Salary: " + this.salary);
		System.out.println("Age: " + this.age);
	}
	
}