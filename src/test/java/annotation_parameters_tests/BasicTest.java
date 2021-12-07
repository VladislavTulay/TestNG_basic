package annotation_parameters_tests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class BasicTest {

    static String a = "as";

    @Test
    public void testAssertTrueJavaInner() {
        assert 2 > 3;
    }

    @Test
    public void testAssertJavaInner() {
        assert 2 < 3;
    }

    @Test
    public void testAssertEqualsJavaInner() {
        assert "asd".equals("asd1") : "This method is now working";
    }

    @Test
    public void testAssertTrue() {
        assertTrue(2 > 3, "Some message assertTrue");
    }

    @Test
    public void testAssertFalse() {
        assertFalse(2 > 3, "Some message assertFalse");
    }

    @Test
    public void testAssertEquals() {
        assertEquals("2", "2", "Some message assertEquals");
    }

    @Test
    public void testAssertNotEquals() {
        assertNotEquals("2", "2", "Some message assertEquals");
    }

    @Test
    public void testAssertTrueJunit() {
        AssertJUnit.assertTrue("Error message Junit assertTrue", 2 > 3);
    }

    @Test
    public void testAssertEqualsJunit() {
        AssertJUnit.assertEquals("Error message Junit assertTrue", 2, 3);
    }

    @Test
    public void testAssertFalseJunit() {
        AssertJUnit.assertFalse("Error message Junit assertTrue", 2 > 3);
    }

    @Test
    public void testAssertJunit() {
        AssertJUnit.assertNotNull("Error message Junit assertTrue", a);
    }
}
