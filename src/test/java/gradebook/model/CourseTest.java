package gradebook.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CourseTest{
	
	Course course;
	List<Course> prereqs;
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
	Class clas1 = new Class(sections, new GradingScheme());
	Class clas2 = new Class(sections, new GradingScheme());
	classes.add(clas1);
	classes.add(clas2);
	prereqs = new ArrayList<Course>();
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
}