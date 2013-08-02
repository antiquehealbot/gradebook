package gradebook.model;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.Before;

public class ClassTest{
	List<Student> students;
	List<Section> sections;
	Class clas;
	
	@Before
	public void put(){
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
    	students = new ArrayList<Student>();
    	students.add(student1);
    	students.add(student2);
    	Section section1 = new Section(students, new GradingScheme());
    	Section section2 = new Section(students, new GradingScheme());
    	sections = new ArrayList<Section>();
    	sections.add(section1);
    	sections.add(section2);
    	clas = new Class(sections, new GradingScheme());
	}
	
    @Test
    public void testReportClassAverage1(){
    	assertEquals(93.75, clas.reportClassAverage(), 0.0000001);
    }

    @Test
    public void testReportClassAverage2(){
    	assertFalse(95 == clas.reportClassAverage());
    }
    
    @Test
    public void testReportClassLetterGrade1(){
    	assertEquals('S', clas.reportClassLetterGrade(0));
    }
    
    @Test
    public void testReportClassLetterGrade2(){
    	assertTrue('S' == clas.reportClassLetterGrade(90));
    }
    
    @Test
    public void testReportClassLetterGrade3(){
    	assertFalse('S' == clas.reportClassLetterGrade(99));
    }

}