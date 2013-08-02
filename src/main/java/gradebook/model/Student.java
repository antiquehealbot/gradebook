package gradebook.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Hashtable;
import java.util.List;

/**
  * Representing a Student object
  *
  * Implements the Composite Design Pattern.
  * In the part-whole hierarchies, it plays role of "part".
  */

public class Student {

    private String name;
    private GradingScheme gradingScheme;
    private Hashtable<GradebookCategory, List<GradebookItem>>
            gradebook;
    private Collection<GradebookItem> gradebookItems;

    public Student(String name, Collection<GradebookItem> gradebookItems,
            GradingScheme gradingScheme) {
        this.name = name;
        this.gradebookItems = gradebookItems;
        this.gradingScheme = gradingScheme;
        setGradebookCategories(gradebookItems);
    }

    public double reportScore() {
        return gradingScheme.reportStudentScore(gradebook);
    }

    public char reportLetterGrade(int pass) {
        return gradingScheme.reportStudentLetterGrade(gradebook, pass);
    }

    public Hashtable<GradebookCategory, List<GradebookItem>> getGradebook() {
        return this.gradebook;
    }

    private void setGradebookCategories(Collection<GradebookItem>
                gradebookItems) {
        this.gradebook =
                new Hashtable<GradebookCategory, List<GradebookItem>>();
        for (GradebookItem item:gradebookItems) {
            GradebookCategory category = item.getGradebookCategory();
            if (!gradebook.keySet().contains(category)) {
                List<GradebookItem> value = new ArrayList<GradebookItem>();
                value.add(item);
                gradebook.put(item.getGradebookCategory(), value);
            } else {
                List<GradebookItem> value = gradebook.get(item);
                value.add(item);
                gradebook.put(item.getGradebookCategory(), value);
            }
        }
    }
}
