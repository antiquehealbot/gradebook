package gradebook.model;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;


public class GradingSchemeTest {

	Class clas1;
	Class clas2;
	Course course;
	Section section1;
	Section section2;
	Student student1;
	Student student2;
	@Before
	public void init(){
	List<Student> students;
	List<Section> sections;
	List<Class> classes = new ArrayList<Class>();
	

	GradebookCategory category1 = new GradebookCategory("category1", 0.125);
    GradebookCategory category2 = new GradebookCategory("category2", 0.75);
	List<GradebookItem> items1 = new ArrayList<GradebookItem>();
	GradebookItem item2 = new GradebookItem("quiz1", 90.0, category1);
    GradebookItem item3 = new GradebookItem("quiz2", 90.0, category1);
    GradebookItem finalExam1 = new GradebookItem("final", 100.0, category2);
    items1.add(item2);
    items1.add(item3);
    items1.add(finalExam1);
    student1 = new Student("stu1", items1, new GradingScheme());
    
	List<GradebookItem> items2 = new ArrayList<GradebookItem>();
	GradebookItem item5 = new GradebookItem("quiz1", 90.0, category1);
    GradebookItem item6 = new GradebookItem("quiz2", 90.0, category1);
    GradebookItem finalExam2 = new GradebookItem("final", 90.0, category2);
    items2.add(item5);
    items2.add(item6);
    items2.add(finalExam2);
    student2 = new Student("stu2", items2, new GradingScheme());
	students = new ArrayList<Student>();
	students.add(student1);
	students.add(student2);
	section1 = new Section(students, new GradingScheme());
	section2 = new Section(students, new GradingScheme());
	sections = new ArrayList<Section>();
	sections.add(section1);
	sections.add(section2);
	clas1 = new Class(sections, new GradingScheme());
	clas2 = new Class(sections, new GradingScheme());
	classes.add(clas1);
	classes.add(clas2);
	List<Course> prereqs = new ArrayList<Course>();
	course = new Course(classes, prereqs, "CS","Object Design", 2340,new GradingScheme());
	}
	
	@Test
    public void testReportCourseAverage1(){
    	assertEquals(93.75, course.reportCourseAverage(), 0.000001);
    }

    @Test
    public void testReportCourseAverage2(){
    	assertFalse(95 == course.reportCourseAverage());
    }
    @Test
    public void testReportCourseLetterGrade1(){
    	assertEquals('S', course.reportCourseLetterGrade(90), 0.000001);
    }
    @Test
    public void testReportCourseLetterGrade2(){
    	assertTrue('S' == course.reportCourseLetterGrade(90));
    }
    @Test
    public void testReportCourseLetterGrade3(){
    	assertFalse('S' == course.reportCourseLetterGrade(99));
    }
    
    @Test
    public void testReportClassAverage1(){
    	assertEquals(93.75, clas1.reportClassAverage(), 0.0000001);
    }

    @Test
    public void testReportClassAverage2(){
    	assertFalse(95 == clas1.reportClassAverage());
    }
    
    @Test
    public void testReportClassLetterGrade1(){
    	assertEquals('S', clas1.reportClassLetterGrade(0));
    }
    
    @Test
    public void testReportClassLetterGrade2(){
    	assertTrue('S' == clas1.reportClassLetterGrade(90));
    }
    
    @Test
    public void testReportClassLetterGrade3(){
    	assertFalse('S' == clas1.reportClassLetterGrade(99));
    }
    
    @Test
    public void testReportClassAverage3(){
    	assertEquals(93.75, clas2.reportClassAverage(), 0.0000001);
    }

    @Test
    public void testReportClassAverage4(){
    	assertFalse(95 == clas2.reportClassAverage());
    }
    
    @Test
    public void testReportClassLetterGrade4(){
    	assertEquals('S', clas2.reportClassLetterGrade(0));
    }
    
    @Test
    public void testReportClassLetterGrade5(){
    	assertTrue('S' == clas2.reportClassLetterGrade(90));
    }
    
    @Test
    public void testReportClassLetterGrade6(){
    	assertFalse('S' == clas2.reportClassLetterGrade(99));
    }
    
    @Test
    public void testReportSecitonAverage1(){
    	assertEquals(93.75, section1.reportSectionAverage(), 0.0000001);
    }
    
    @Test
    public void testReportSectionAverage2(){
    	assertFalse(95 == section1.reportSectionAverage());
    }
    
    @Test
    public void testReportSecitonAverage3(){
    	assertEquals(93.75, section2.reportSectionAverage(), 0.0000001);
    }
    
    @Test
    public void testReportSectionAverage4(){
    	assertFalse(95 == section2.reportSectionAverage());
    }

    @Test
    public void testReportSectionLetterGrade1(){
    	assertEquals('S', section1.reportSectionLetterGrade(90));
    }
    
    @Test
    public void testReportSectionLetterGrade2(){
    	assertEquals('F', section1.reportSectionLetterGrade(99));
    }
    
    @Test
    public void testReportSectionLetterGrade3(){
    	assertEquals('S', section2.reportSectionLetterGrade(90));
    }
    
    @Test
    public void testReportSectionLetterGrade4(){
    	assertEquals('F', section2.reportSectionLetterGrade(99));
    }
    
    @Test
    public void testGetSectionSize1(){
    	assertTrue(2 == section1.getSectionSize());
    }
    
    @Test
    public void testGetSectionSize2(){
    	assertFalse(3 == section1.getSectionSize());
    }

    @Test
    public void testGetSectionSize3(){
    	assertTrue(2 == section2.getSectionSize());
    }
    
    @Test
    public void testGetSectionSize4(){
    	assertFalse(3 == section2.getSectionSize());
    }
    
    @Test
    public void testReportScore1(){
    	assertEquals(97.5 ,student1.reportScore(), 0.000000001);
    }
    
    @Test
    public void testReportScore2(){
    	assertFalse(95 == student1.reportScore());
    }
    
    @Test
    public void testReportScore3(){
    	assertEquals(90 ,student2.reportScore(), 0.000000001);
    }
    
    @Test
    public void testReportScore4(){
    	assertFalse(95 == student2.reportScore());
    }

    @Test
    public void testReportLetterGrade1(){
    	assertEquals('S', student1.reportLetterGrade(90));
    }
    
    @Test
    public void testReportLetterGrade2(){
    	assertEquals('F', student1.reportLetterGrade(99));
    }
    
    @Test
    public void testReportLetterGrade3(){
    	assertEquals('S', student2.reportLetterGrade(90));
    }
    
    @Test
    public void testReportLetterGrade4(){
    	assertEquals('F', student2.reportLetterGrade(99));
    }
}
