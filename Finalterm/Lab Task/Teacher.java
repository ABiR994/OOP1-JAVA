public class Teacher extends Staff implements ExamEvaluator  {
	private double salary;

	Teacher(String name, int age, double salary) {
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
		System.out.println("Teacher Salary: " + this.salary);
	}

	@Override
	public String toString() {
		String teacher = "Teacher Details:\n" + "Name: " + getName() + "\nAge: " + getAge() + "\nSalary: " + salary;
		return teacher;
	}

	@Override
	public void evaluateExam(Student s) {
		System.out.println("Teacher " + getName() + " Evaluating Student:");
		System.out.println("Student Name: " + s.getName());
		System.out.println("Student Roll No: " + s.getRollNo());
		System.out.println("Marks given: " + s.getMarks());
	}
}