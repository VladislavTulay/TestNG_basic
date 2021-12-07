package factory_tests;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class SimpleTestFactory {

    @Test
    public void simpleTest() {
        System.out.println("Simple Test Method.");
    }

    @Test
    public void anotherSimpleTest() {
        System.out.println("Another Simple Test Method.");
    }

}
