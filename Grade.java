public class Grade {
    private Course course;
    private Student student;
    private Grade mark;

    public Grade(Student student, Course course, Grade mark) {
        this.student = student;
        this.course = course;
        this.mark = mark;
    }
    public Grade getMark() {
        return mark;
    }

    public void setMark(Grade mark) {
        this.mark = mark;
    }
}
