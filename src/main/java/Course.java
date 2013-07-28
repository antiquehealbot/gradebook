public class Course{
    
    List<Class> classes;
    List<Class> prereqs;
    String subject;
    String courseName;
    int courseNumber;

    public Course(List<Class> classes, List<Class> prereqs, String subject, String courseName, int courseNumber){
        this.classes = classes;
        this.prereqs = prereqs;
        this.subject = subject;
        this.courseName = courseName;
        this.courseNumber = courseNumber;
    } 

}