package gradebook.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class GradebookCategoryTest{

    GradebookCategory gradebookCategory = new GradebookCategory("Final", 0.20);

    @Test
    public void testGetName(){
        assertEquals("expected 'Final' ", "Final", gradebookCategory.getName());
    }

    @Test
    public void testGetWeight(){
        assertEquals("expected 0.20", 0.20, gradebookCategory.getWeight(), 0.00001);
    }

}