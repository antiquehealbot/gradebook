package gradebook.model;

import java.util.List;

/**
  * Representing a Course object
  *
  * Implements the Composite Design Pattern.
  * In the part-whole hierarchies, it plays role of "whole".
  */

public class Course {

    private List<Class> classes;
    private List<Course> prereqs;
    private String subject;
    private String courseName;
    private int courseNumber;
    private GradingScheme gradingScheme;

    public Course(List<Class> classes, List<Course> prereqs,
            String subject, String courseName,
            int courseNumber, GradingScheme gradingScheme) {
        this.classes = classes;
        this.prereqs = prereqs;
        this.subject = subject;
        this.courseName = courseName;
        this.courseNumber = courseNumber;
        this.gradingScheme = gradingScheme;
    }

    public double reportCourseAverage() {
        return gradingScheme.reportCourseAverage(classes);
    }

    public char reportCourseLetterGrade(double pass) {
        return gradingScheme.reportCourseLetterGrade(classes, pass);
    }
}
