import java.util.*;
public class StudentManagement {
    static ArrayList<Student> studentList = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n--- Student Record Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: addStudent(); break;
                case 2: viewStudents(); break;
                case 3: updateStudent(); break;
                case 4: deleteStudent(); break;
                case 5: System.out.println("Exiting..."); break;
                default: System.out.println("Invalid choice.");
            }
        } while (choice != 5);
    }

    static void addStudent() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Marks: ");
        int marks = sc.nextInt();
        studentList.add(new Student(id, name, marks));
        System.out.println("Student added.");
    }

    static void viewStudents() {
        if (studentList.isEmpty()) {
            System.out.println("No records found.");
        } else {
            for (Student s : studentList) {
                System.out.println(s);
            }
        }
    }

    static void updateStudent() {
        System.out.print("Enter ID to update: ");
        int id = sc.nextInt();
        boolean found = false;
        for (Student s : studentList) {
            if (s.getId() == id) {
                sc.nextLine(); // consume newline
                System.out.print("Enter new Name: ");
                s.setName(sc.nextLine());
                System.out.print("Enter new Marks: ");
                s.setMarks(sc.nextInt());
                System.out.println("Student updated.");
                found = true;
                break;
            }
        }
        if (!found) System.out.println("Student not found.");
    }

    static void deleteStudent() {
        System.out.print("Enter ID to delete: ");
        int id = sc.nextInt();
        Iterator<Student> iterator = studentList.iterator();
        boolean found = false;
        while (iterator.hasNext()) {
            if (iterator.next().getId() == id) {
                iterator.remove();
                System.out.println("Student deleted.");
                found = true;
                break;
            }
        }
        if (!found) System.out.println("Student not found.");
    }
}


