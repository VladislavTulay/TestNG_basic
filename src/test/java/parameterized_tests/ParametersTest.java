package parameterized_tests;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersTest {

    @Parameters({ "test_parameter" })
    @Test
    public void test(String param1) {
        System.out.println(param1);
    }

    @Parameters({ "suite_parameter" })
    @Test
    public void test1(@Optional("should be suite, but optional") String param2) {
        System.out.println(param2);
    }

    @Test
    public void test2(@Optional("optional") String param3) {
        System.out.println(param3);
    }

}
