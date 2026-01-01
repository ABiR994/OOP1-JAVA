public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Alice", 101);
        Student s2 = new GraduateStudent("Bob", 201, "AI");
	    Student s3 = new GraduateStudent("John", 202, "CN");

        Student[] arr = { s1, s2, s3 };
        University u = new University(arr);
        u.showStudents();  
        
    }
}