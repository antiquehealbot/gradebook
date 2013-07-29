import java.util.List;

public class Class{
    
    private List<Section> sections;
    private char classLetterGrade;
    private double classAverage;

    public Class(List<Section> sections){
        this.sections = sections;
        classAverage = classAverage(sections);
        classLetterGrade = classLetterGrade(classAverage);
    }

    private double classAverage(List<Section> sections){
        double sum = 0;
        int numOfStudents = 0;
        double average = 0;
        if(sections.size() != 0){
            for(Section section:sections){
                sum += section.getSectionAverage() * section.getSectionSize();
                numOfStudents += section.getSectionSize();
            }
            average = sum/numOfStudents;
        }
        return average;
    }

    private char classLetterGrade(double classAverage){
        int gradeInterval = ((Double)classAverage).intValue() % 10;
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

    public double getClassAverage(){
        return classAverage;
    }

    public char getClassLetterGrade(){
        return classLetterGrade;
    }

}