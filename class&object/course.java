public class Course {
    String courseName;
    String instructor;

    public Course(String courseName, String instructor) {
        this.courseName = courseName;
        this.instructor = instructor;
    }

    public void displayCourse() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Instructor: " + instructor);
    }
}
