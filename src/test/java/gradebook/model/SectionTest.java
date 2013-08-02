package gradebook.model;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.util.List;
import java.util.ArrayList;

public class SectionTest{

    List<Student> students;
    Section section;
    @Before
    public void put(){
students = new ArrayList<Student>();
    	
    	GradebookCategory category1 = new GradebookCategory("category1", 0.125);
        GradebookCategory category2 = new GradebookCategory("category2", 0.75);
    	List<GradebookItem> items1 = new ArrayList<GradebookItem>();
    	GradebookItem item2 = new GradebookItem("quiz1", 90.0, category1);
        GradebookItem item3 = new GradebookItem("quiz2", 90.0, category1);
        GradebookItem finalExam1 = new GradebookItem("final", 100.0, category2);
        items1.add(item2);
        items1.add(item3);
        items1.add(finalExam1);
        Student student1 = new Student("stu1", items1, new GradingScheme());
        
    	List<GradebookItem> items2 = new ArrayList<GradebookItem>();
    	GradebookItem item5 = new GradebookItem("quiz1", 90.0, category1);
        GradebookItem item6 = new GradebookItem("quiz2", 90.0, category1);
        GradebookItem finalExam2 = new GradebookItem("final", 90.0, category2);
        items2.add(item5);
        items2.add(item6);
        items2.add(finalExam2);
        Student student2 = new Student("stu2", items2, new GradingScheme());
    	
    	students.add(student1);
    	students.add(student2);
    	section = new Section(students, new GradingScheme());
    	
    }
    
    @Test
    public void testReportSecitonAverage1(){
    	assertEquals(93.75, section.reportSectionAverage(), 0.0000001);
    }
    
    @Test
    public void testReportSectionAverage2(){
    	assertFalse(95 == section.reportSectionAverage());
    }

    @Test
    public void testReportSectionLetterGrade1(){
    	assertEquals('S', section.reportSectionLetterGrade(90));
    }
    
    @Test
    public void testReportSectionLetterGrade2(){
    	assertEquals('F', section.reportSectionLetterGrade(99));
    }
    
    @Test
    public void testGetSectionSize1(){
    	assertTrue(2 == section.getSectionSize());
    }
    
    @Test
    public void testGetSectionSize2(){
    	assertFalse(3 == section.getSectionSize());
    }
}
