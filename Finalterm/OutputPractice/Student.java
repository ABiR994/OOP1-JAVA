class Student {
    private String name;
    private int id;

    Student(String name, int id) {
        this.name = name;
        this.id = id;
        System.out.println("Student created: " + name);
    }

    void display() {
        System.out.println(name + " (ID: " + id + ") enrolled");
    }

    String getName() { return name; }
    void setId(int id) { this.id = id; }
}




