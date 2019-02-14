public class Feedback {
    private Course course;
    private Student student;
    private Feedback feedback;

    public Feedback(Student student, Course course, Feedback feedback) {
        this.student = student;
        this.course = course;
        this.feedback = feedback;
    }
    public Feedback getFeedback() {
        return feedback;
    }

    public void setFeedback(Feedback feedback) {
        this.feedback = feedback;
    }
}
