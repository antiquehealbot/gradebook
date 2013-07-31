package gradebook.model;

/**
  * Representing a GradebookCategory
  */

public class GradebookCategory {

    private String name;
    private double weight;

    public GradebookCategory(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

}
