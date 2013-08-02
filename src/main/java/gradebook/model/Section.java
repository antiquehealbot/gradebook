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
    private int sectionSize;
    private GradingScheme gradingScheme;

    public Section(List<Student> students, GradingScheme gradingScheme) {
        this.students = students;
        this.gradingScheme = gradingScheme;
        this.sectionSize = students.size();
    }

    public double reportSectionAverage() {
        return gradingScheme.reportSectionAverage(students);
    }

    public char reportSectionLetterGrade(double pass) {
        return gradingScheme.reportSectionLetterGrade(students, pass);
    }

    public int getSectionSize() {
        return sectionSize;
    }
}
