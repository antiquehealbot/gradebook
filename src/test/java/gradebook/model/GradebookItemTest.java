package gradebook.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class GradebookItemTest{

    GradebookCategory gradebookCategory = new GradebookCategory("Final", 0.20);
    GradebookItem gradebookItem = new GradebookItem("FinalExam", new Double(100), gradebookCategory);

    @Test
    public void testGetName(){
        assertEquals("expected 'FinalExam' ", "FinalExam", gradebookItem.getName());
    }

    @Test
    public void testGetScore(){
        assertEquals("expected 100", new Double(100), gradebookItem.getScore(), 0.00001);
    }

    @Test
    public void testGetGradebookCategory(){
        GradebookCategory expectedValue = new GradebookCategory("Final", 0.20);
        assertEquals("expected 'Final' ", expectedValue.getName(), gradebookItem.getGradebookCategory().getName());
        assertEquals("expected 0.20' ", expectedValue.getWeight(), gradebookItem.getGradebookCategory().getWeight(), 0.00001);
    }
 
}