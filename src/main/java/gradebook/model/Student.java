package gradebook.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Hashtable;
import java.util.List;

/**
  * Representing a Student object
  */

public class Student {

    private String name;
    private GradingScheme gradingScheme;
    private Hashtable<GradebookCategory, List<GradebookItem>>
            gradebookCategories;
    private Collection<GradebookItem> gradebookItems;
    private double score;
    private char letterGrade;

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, GradingScheme gradingScheme) {
        this(name);
        this.gradingScheme = gradingScheme;
    }

    public Student(String name, Collection<GradebookItem> gradebookItems) {
        this(name);
        this.gradebookItems = gradebookItems;
        setGradebookCategories(gradebookItems);
    }

    public void setGradingScheme(GradingScheme gradingScheme) {
        this.gradingScheme = gradingScheme;
    }

    public void setGradebookItems(Collection<GradebookItem> gradebookItems) {
        this.gradebookItems = gradebookItems;
        setGradebookCategories(gradebookItems);
    }

    public double getScore() {
        return score;
    }

    private void setGradebookCategories(Collection<GradebookItem>
                gradebookItems) {
        this.gradebookCategories =
                new Hashtable<GradebookCategory, List<GradebookItem>>();
        for (GradebookItem item:gradebookItems) {
            GradebookCategory category = item.getGradebookCategory();
            if (!gradebookCategories.keySet().contains(category)) {
                List<GradebookItem> value = new ArrayList<GradebookItem>();
                value.add(item);
                gradebookCategories.put(item.getGradebookCategory(), value);
            } else {
                List<GradebookItem> value = gradebookCategories.get(item);
                value.add(item);
                gradebookCategories.put(item.getGradebookCategory(), value);
            }
        }
    }

}