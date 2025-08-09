package de.tum.in.ase.eist;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.net.MalformedURLException;
import java.net.URL;

class OnlineCourseTest {

	// TODO 3: Test setOnlineCourseUrl()
    //MalformedURLException if url not correct

    @Test
    public void testSetOnlineCourseUrlWithValidUrl() throws MalformedURLException {
        var onlineCourse = new OnlineCourse("title");
        onlineCourse.setUrl("https://www.google.com");
        var expected = "https://www.google.com";
        var actual = onlineCourse.getUrl().toString();

        assertEquals(expected, actual);

    }

    @Test
    public void testSetOnlineCourseUrlWithInvalidUrl() throws MalformedURLException {
        var onlineCourse = new OnlineCourse("title");

        assertThrows(MalformedURLException.class, () -> onlineCourse.setUrl("ww.google.com"));
    }

}
