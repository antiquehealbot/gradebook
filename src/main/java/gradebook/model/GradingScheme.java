package gradebook.model;

import java.util.Collection;
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
            average += section.reportSectionAverage();
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

    double reportStudentScore(Collection<GradebookItem>
            gradebookItems) {
        double score = 0;
        for (GradebookItem item:gradebookItems) {
            score += item.getScore()
                * (item.getGradebookCategory()).getWeight();
        }
        return score;
    }

    char reportStudentLetterGrade(
            Collection<GradebookItem> gradebookItems,
            double pass) {
        double score = reportStudentScore(gradebookItems);
        if (score >= pass) {
            return 'S';
        } else {
            return 'F';
        }
    }
}
