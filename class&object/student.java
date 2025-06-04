public class Student {
    String name;
    int rollNumber;
    String courseName;

    public Student(String name, int rollNumber, String courseName) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.courseName = courseName;
    }

    public void displayStudent() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Course: " + courseName);
    }
}
