package gradebook.model;

import java.util.Collection;

/**
  * Representing a Student object
  *
  * Implements the Composite Design Pattern.
  * In the part-whole hierarchies, it plays role of "part".
  */

public class Student {

    private String name;
    private GradingScheme gradingScheme;
    private Collection<GradebookItem> gradebookItems;

    public Student(String name, Collection<GradebookItem> gradebookItems,
            GradingScheme gradingScheme) {
        this.name = name;
        this.gradebookItems = gradebookItems;
        this.gradingScheme = gradingScheme;
    }

    public double reportScore() {
        return gradingScheme.reportStudentScore(gradebookItems);
    }

    public char reportLetterGrade(double pass) {
        return gradingScheme.reportStudentLetterGrade(gradebookItems, pass);
    }

}
