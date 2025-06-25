
public class Student {
    private int id;
    private String name;
    private int marks;

    // Constructor
    public Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    // Getters
    public int getId() { return id; }
    public String getName() { return name; }
    public int getMarks() { return marks; }

    // Setters
    public void setName(String name) { this.name = name; }
    public void setMarks(int marks) { this.marks = marks; }

    // toString() for printing
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Marks: " + marks;
    }
}
