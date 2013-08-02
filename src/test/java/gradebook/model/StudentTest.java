package gradebook.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import java.util.List;
import java.util.ArrayList;	

public class StudentTest{

    GradebookCategory category1 = new GradebookCategory("category1", 0.125);
    GradebookCategory category2 = new GradebookCategory("category2", 0.75);
	List<GradebookItem> items = new ArrayList<GradebookItem>();
	GradebookItem item1 = new GradebookItem("quiz1", 90.0, category1);
    GradebookItem item2 = new GradebookItem("quiz2", 90.0, category1);
    GradebookItem finalExam = new GradebookItem("final", 100.0, category2);
    Student student = new Student("stu1", items, new GradingScheme());
    		
    @Before
    public void put(){
    	items.add(item1);
    	items.add(item2);
    	items.add(finalExam);
    }
    
    @Test
    public void testReportScore1(){
    	assertEquals(97.5 ,student.reportScore(), 0.000000001);
    }
    
    @Test
    public void testReportScore2(){
    	assertFalse(95 == student.reportScore());
    }

    @Test
    public void testReportLetterGrade1(){
    	assertEquals('S', student.reportLetterGrade(90));
    }
    
    @Test
    public void testReportLetterGrade2(){
    	assertEquals('F', student.reportLetterGrade(99));
    }
}
