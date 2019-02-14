import java.lang.reflect.Array;

public class Course {
    private String courseName;
    private Teacher teacher;

    public Course(String courseName){
        this.courseName = courseName;
    }

    public String getName() {
        return courseName;
    }
    public void setName (String a){
        courseName = a;
    }
    public Teacher getTeacher() {
        return teacher;
    }
    public void setTeacher (Teacher b){
        teacher = b;
    }
}
