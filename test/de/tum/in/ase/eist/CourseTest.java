package de.tum.in.ase.eist;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;

class CourseTest {

	// TODO 1: Test getCourseTitle()
    @Test
    public void testGetCourseTitle(){
            var course = new Course("Title");
            var expected = "Title";
            var actual = course.getTitle();
            assertEquals(expected,actual);
        }

	// TODO 2: Test getNumberOfAttendees()
    @Test
    public void testNoAttendees(){
        var course = new Course("no attendees here ");
        var expected = 0;
        var actual = course.getNumberOfAttendees();
        assertEquals(expected,actual);

    }

    @Test
    public void testThreeAttendees(){
        var course = new Course("3 attendees");
        Student s1 = new Student("m","f","1.1.1", "winfo", "omak");
        Student s2 = new Student("a","b","1.1.1", "winfo", "omak");
        Student s3 = new Student("c","d","1.1.1", "winfo", "omak");

        course.addAttendee(s1);
        course.addAttendee(s2);
        course.addAttendee(s3);

        var expected = 3;
        var actual = course.getNumberOfAttendees();

        assertEquals(expected, actual);
    }

}
