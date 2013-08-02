package gradebook.model;

import java.util.List;

/**
  * Representing a Class object
  *
  * Implements the Composite Design Pattern.
  * In the part-whole hierarchies, it plays role of "part".
  */
public class Class {

    private List<Section> sections;
    private GradingScheme gradingScheme;

    public Class(List<Section> sections, GradingScheme gradingScheme) {
        this.sections = sections;
        this.gradingScheme = gradingScheme;
    }

    public double reportClassAverage() {
         return gradingScheme.reportClassAverage(sections);
    }

    public char reportClassLetterGrade(double pass) {
        return gradingScheme.reportClassLetterGrade(sections, pass);
    }
}
