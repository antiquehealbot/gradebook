public class GradebookItem{

    String name;
    Double score;
    GradebookCategory gradebookCategory;

    public GradebookItem(String name, Double score, GradebookCategory gradebookCategory){
        this.name = name;
        this.score = score;
        this.gradebookCategory = gradebookCategory;
    }

    public GradebookCategory getGradebookCategory(){
        return gradebookCategory;
    }
}