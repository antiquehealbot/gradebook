package gradebook.model;

import java.util.List;

/**
  * Representing a Course object
  *
  */

public class Course {

    private List<Class> classes;
    private List<Course> prereqs;
    private String subject;
    private String courseName;
    private int courseNumber;
    private double courseAverage;
    private char courseLetterGrade;

    public Course(List<Class> classes, List<Course> prereqs,
                String subject, String courseName, int courseNumber) {
        this.classes = classes;
        this.prereqs = prereqs;
        this.subject = subject;
        this.courseName = courseName;
        this.courseNumber = courseNumber;
        this.courseAverage = setCourseAverage();
        this.courseLetterGrade = setCourseLetterGrade();
    }

    private double setCourseAverage() {
        if (classes != null && classes.size() != 0) {
            double sum = 0;
            for (Class singleClass:classes) {
                sum += singleClass.getClassAverage();
            }
            return sum / classes.size();
        }
        return 0;
    }

    public double getCourseAverage() {
        return courseAverage;
    }

    public char getCourseLetterGrade() {
        return this.courseLetterGrade;
    }

}