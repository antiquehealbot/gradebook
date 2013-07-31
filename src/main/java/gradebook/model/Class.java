package gradebook.model;

import java.util.List;

/**
  * Representing a Class object
  *
  *
  */
public class Class {

    private List<Section> sections;
    private char classLetterGrade;
    private double classAverage;

    public Class(List<Section> sections) {
        this.sections = sections;
        classAverage = classAverage(sections);
    }

    private double classAverage(List<Section> sections) {
        double sum = 0;
        int numOfStudents = 0;
        double average = 0;
        if (sections.size() != 0) {
            for (Section section:sections) {
                sum += section.getSectionAverage() * section.getSectionSize();
                numOfStudents += section.getSectionSize();
            }
            average = sum / numOfStudents;
        }
        return average;
    }

    public double getClassAverage() {
        return classAverage;
    }

    public char getClassLetterGrade() {
        return classLetterGrade;
    }

}
