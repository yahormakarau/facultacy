public class Teacher {
    private String teacherName;
    private Grade grade;
    private Feedback feedback;

    public Teacher(String teacherName) {
        this.teacherName = teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setCourse(Course course) {
    }


    public void markGrade(Student student, Course course, Grade grade) {
        grade.setMark(grade);
    }

    public void leaveFeedback(Student student, Course course) {
        feedback.setFeedback(feedback);
    }
}
