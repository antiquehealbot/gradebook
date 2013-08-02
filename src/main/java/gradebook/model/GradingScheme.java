package gradebook.model;

import java.util.Hashtable;
import java.util.List;

/**
  * Representing a GradingScheme object.
  * Extending this class provides more flexibility
  * in calculating scores and letter grades for Course,
  * Class, Section and Student objects.
  *
  */

public class GradingScheme {

    public GradingScheme() {

    }

    double reportCourseAverage(List<Class> classes) {
        double average = 0;
        for (Class clas: classes) {
            average += clas.reportClassAverage();
        }
        if (average > 0) {
            return average / classes.size();
        } else {
            return 0;
        }
    }

    char reportCourseLetterGrade(List<Class> classes, double pass) {
        double score = reportCourseAverage(classes);
        if (score >= pass) {
            return 'S';
        } else {
            return 'F';
        }
    }

    double reportClassAverage(List<Section> sections) {
        double average = 0;
        for (Section section: sections) {
            average += section.reportSectionAverage()
                * section.getSectionSize();
        }
        if (average > 0) {
            return average / sections.size();
        } else {
            return 0;
        }
    }

    char reportClassLetterGrade(List<Section> sections, double pass) {
        double score = reportClassAverage(sections);
        if (score >= pass) {
            return 'S';
        } else {
            return 'F';
        }
    }

    double reportSectionAverage(List<Student> students) {
        double average = 0;
        for (Student student: students) {
            average += student.reportScore();
        }
        if (average > 0) {
            return average / students.size();
        } else {
            return 0;
        }
    }

    char reportSectionLetterGrade(List<Student> students, double pass) {
        double score = reportSectionAverage(students);
        if (score >= pass) {
            return 'S';
        } else {
            return 'F';
        }
    }

    double reportStudentScore(
            Hashtable<GradebookCategory, List<GradebookItem>> gradebook) {
        double score = 0;
        for (GradebookCategory key: gradebook.keySet()) {
            double partialScore = 0;
            for (GradebookItem element: gradebook.get(key)) {
                partialScore += element.getScore();
            }
            score += partialScore * key.getWeight();
        }
        return score;
    }

    char reportStudentLetterGrade(
            Hashtable<GradebookCategory, List<GradebookItem>> gradebook,
            double pass) {
        double score = reportStudentScore(gradebook);
        if (score >= pass) {
            return 'S';
        } else {
            return 'F';
        }
    }
}