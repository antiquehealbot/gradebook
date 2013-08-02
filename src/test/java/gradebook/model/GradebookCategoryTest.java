package gradebook.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class GradebookCategoryTest{

    GradebookCategory gradebookCategory = new GradebookCategory("Final", 0.20);

    @Test
    public void testGetName1(){
        assertEquals("expected 'Final' ", "Final", gradebookCategory.getName());
    }
    
    @Test
    public void testGetName2(){
        assertFalse("final" == gradebookCategory.getName());
    }

    @Test
    public void testGetWeight1(){
        assertEquals("expected 0.20", 0.20, gradebookCategory.getWeight(), 0.00001);
    }

    @Test
    public void testGetWeight2(){
        assertFalse(0.25 == gradebookCategory.getWeight());
    }
}