public class MainDemo {
    public static void main(String[] args) {
        Student student = new Student("Alice", 101, "Java Programming");
        Course course = new Course("Java Programming", "Dr. Smith");

        System.out.println("=== Student Information ===");
        student.displayStudent();

        System.out.println("\n=== Course Information ===");
        course.displayCourse();
    }
}
