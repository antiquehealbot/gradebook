package gradebook.model;

import java.util.List;

/**
  * Representing a Section object
  */

public class Section {

    private List<Student> students;
    private char sectionLetterGrade;
    private double sectionAverage;
    private int sectionSize;

    public Section(List<Student> students) {
        this.students = students;
        this.sectionAverage = sectionAverage(students);
        this.sectionLetterGrade = sectionLetterGrade(sectionAverage);
        this.sectionSize = students.size();
    }

    private double sectionAverage(List<Student> students) {
        double sum = 0;
        double average = 0;
        if (students.size() > 0) {
            for (Student student:students) {
                sum += student.getScore();
            }
            average = sum / students.size();
        }
        return average;
    }

    public double getSectionAverage() {
        return sectionAverage;
    }

    public int getSectionSize() {
        return sectionSize;
    }

}