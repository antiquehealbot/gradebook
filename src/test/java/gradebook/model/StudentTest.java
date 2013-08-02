package gradebook.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class StudentTest{

	List<GradebookItems> items = new ArrayList<GradebookItems>();
	items.add(new GradebookItem("quiz1", 25, new GradebookCategory("quiz", 0.20)));
	items.add(new GradebookItem("quiz2", 30, new GradebookCategory("quiz", 0.20)));
	items.add(new GradebookItem("final", 25, new GradebookCategory("final", 0.60)));
    Student student = new Student();
    		
    
    @Test
    public void test(){
    
    }

}
