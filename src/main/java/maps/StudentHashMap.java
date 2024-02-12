package maps;

import java.util.HashMap;

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

public class StudentHashMap {
    public static void main(String[] args) {
        // Creating HashMap of Student objects with first name as key
        HashMap<String, Student> studentMap = new HashMap<>();
        studentMap.put("John", new Student("John", "Doe", 3.5));
        studentMap.put("Jane", new Student("Jane", "Smith", 2.9));
        studentMap.put("Alice", new Student("Alice", "Johnson", 3.8));
        studentMap.put("Bob", new Student("Bob", "Brown", 2.7));
        studentMap.put("Michael", new Student("Michael", "Davis", 3.2));
        studentMap.put("Emily", new Student("Emily", "Wilson", 3.9));
        studentMap.put("David", new Student("David", "Martinez", 2.5));
        studentMap.put("Sarah", new Student("Sarah", "Anderson", 3.4));

        // Retrieving a Student object based on first name
        String studentName = "Alice";
        Student student = getStudentByName(studentMap, studentName);
        if (student != null) {
            System.out.println("Student found: " + student);
        } else {
            System.out.println("Student not found with name: " + studentName);
        }
    }

    public static Student getStudentByName(HashMap<String, Student> studentMap, String firstName) {
        return studentMap.get(firstName);
    }
}

