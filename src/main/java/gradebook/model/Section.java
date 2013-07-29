import java.util.List;

public class Section{

    private List<Student> students;
    private char sectionLetterGrade;
    private double sectionAverage;
    private int sectionSize;
    
    public Section(List<Student> students){
        this.students = students;
        this.sectionAverage = sectionAverage(students);
        this.sectionLetterGrade = sectionLetterGrade(sectionAverage);
        this.sectionSize = students.size();
    }

    private double sectionAverage(List<Student> students){
        double sum = 0;
        double average = 0;
        if(students.size() > 0){
            for(Student student:students){
                sum += student.getScore();
            }
            average = sum/students.size();
        }
        return average;
    }

    private char sectionLetterGrade(double sectionAverage){
        int gradeInterval = ((Double)sectionAverage).intValue() % 10;
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

    public double getSectionAverage(){
        return sectionAverage;
    }

    public int getSectionSize(){
        return sectionSize;
    }

}