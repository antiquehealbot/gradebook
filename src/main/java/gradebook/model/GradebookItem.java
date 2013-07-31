package gradebook.model;

/**
  * Representing a GradebookItem
  */

public class GradebookItem {

    private String name;
    private Double score;
    private GradebookCategory gradebookCategory;

    public GradebookItem(String name, Double score,
            GradebookCategory gradebookCategory) {
        this.name = name;
        this.score = score;
        this.gradebookCategory = gradebookCategory;
    }

    public String getName() {
        return name;
    }

    public Double getScore() {
        return score;
    }

    public GradebookCategory getGradebookCategory() {
        return gradebookCategory;
    }

}