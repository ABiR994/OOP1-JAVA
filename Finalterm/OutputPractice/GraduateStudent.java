class GraduateStudent extends Student {
    private String researchTopic;

    GraduateStudent(String name, int id, String topic) {
        super(name, id);
        this.researchTopic = topic;
        System.out.println("GraduateStudent topic: " + topic);
    }

    void display() {
        System.out.println(getName() + " researching " + researchTopic);
    }
}