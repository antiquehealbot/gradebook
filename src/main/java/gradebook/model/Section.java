package gradebook.model;

import java.util.List;

/**
  * Representing a Section object
  *
  * Implements the Composite Design Pattern.
  * In the part-whole hierarchies, it plays role of "part".
  */

public class Section {

    private List<Student> students;
    private char sectionLetterGrade;
    private double sectionAverage;
    private int sectionSize;

    public Section(List<Student> students) {
        this.students = students;
        this.sectionAverage = sectionAverage(students);
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
