package lists;

import java.util.ArrayList;

class Student {
    String firstName;
    String lastName;
    double GPA;

    public Student(String firstName, String lastName, double GPA) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", GPA=" + GPA +
                '}';
    }
}

public class RemoveLowGPAStudents {
    public static void main(String[] args) {
        // Creating ArrayList of Students
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("John", "Doe", 3.5));
        students.add(new Student("Jane", "Smith", 2.9));
        students.add(new Student("Alice", "Johnson", 3.8));
        students.add(new Student("Bob", "Brown", 2.7));

        // Calculating the average GPA
        double totalGPA = 0;
        for (Student student : students) {
            totalGPA += student.GPA;
        }
        double averageGPA = totalGPA / students.size();

        // Removing students with GPA less than the average GPA
        ArrayList<Student> remainingStudents = new ArrayList<>();
        for (Student student : students) {
            if (student.GPA >= averageGPA) {
                remainingStudents.add(student);
            }
        }

        // Printing the remaining students
        System.out.println("Remaining students with GPA greater than or equal to the average GPA:");
        for (Student student : remainingStudents) {
            System.out.println(student);
        }
    }
}
