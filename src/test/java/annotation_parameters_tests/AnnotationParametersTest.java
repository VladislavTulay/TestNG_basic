package annotation_parameters_tests;

import org.testng.annotations.Test;

public class AnnotationParametersTest {

    @Test(priority = 2, expectedExceptions = {ArithmeticException.class})
    public void testDivisionWithException() {
        int i = 1/0;
    }

    @Test(description = "Just test")
    public void testWithPriority() {
        System.out.println(123);
    }

    @Test(enabled=false)
    public void testIgnored() {
        System.out.println("Method is not ready yet");
    }

    @Test(timeOut = 1000, priority = 1)
    public void runForever() {
        while (true);
    }



}
