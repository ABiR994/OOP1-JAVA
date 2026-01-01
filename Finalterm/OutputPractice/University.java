class University {
    private Student[] students;

    University(Student[] students) {
        this.students = students;
        System.out.println("University created with " + students.length + " students");
    }

    void showStudents() {
    for (int i = 0; i < students.length; i++) {
        students[i].display();
    }
}
}