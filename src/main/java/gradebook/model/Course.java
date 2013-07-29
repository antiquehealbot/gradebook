import java.util.List;

public class Course{
    
    List<Class> classes;
    List<Course> prereqs;
    String subject;
    String courseName;
    int courseNumber;
    double courseAverage;
    char courseLetterGrade;

    public Course(List<Class> classes, List<Course> prereqs, String subject, String courseName, int courseNumber){
        this.classes = classes;
        this.prereqs = prereqs;
        this.subject = subject;
        this.courseName = courseName;
        this.courseNumber = courseNumber;
        this.courseAverage = setCourseAverage();
        this.courseLetterGrade = setCourseLetterGrade();
    } 
    
    private double setCourseAverage(){
        if(classes != null && classes.size() != 0){
            double sum = 0;
            for(Class singleClass:classes){
            	sum += singleClass.getClassAverage();
            }
            return sum/classes.size();
        }
    	return 0;	
    }
    
    private char setCourseLetterGrade(){
    	int gradeInterval = ((Double)courseAverage).intValue() % 10;
	    if(gradeInterval >= 9)
            return 'A';
        else if(gradeInterval >= 8)
            return 'B';
        else if(gradeInterval >= 7)
            return 'C';
        else if(gradeInterval >= 6)
            return 'D';
        else 
            return 'F';	
    }
    
    public double getCourseAverage(){
        return courseAverage;
    }
    
    public char getCourseLetterGrade(){
        return this.courseLetterGrade;
    }

}