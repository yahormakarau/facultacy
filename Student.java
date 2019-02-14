import java.util.ArrayList;
import java.util.List;

public class Student {
    private Grade mark;
    private String firstName;
    private String lastName;
    private List<Course> enrolledCourses = new ArrayList<Course>();

    public Student (String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public Grade getMark() {
        return mark;
    }
    public List<Course> getEnrolledCourses(){
        return enrolledCourses;
    }

    public void setEnrolledCourses(List<Course> enrolledCourses) {
        this.enrolledCourses = enrolledCourses;
    }
    public void enrollToCourse(Course course){
        enrolledCourses.add(course);
    }

}
