package parameterized_tests;

import data_providers.DataProviderEnum;
import enums.Months;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTests {

    @DataProvider
    public static Object[][] data1() {
        return new Object[][] {
                {1, 0 ,1},
                {2, 1, 2},
                {10, 20, 30},
                {-1, -2, 1}
        };
    }

    @DataProvider
    public static Object[][] data2() {
        return new Object[][] {
                {1, 1 ,1},
                {2, 0, 2},
                {10, 30, 30},
                {-1, 2, 1}
        };
    }

    @Test(dataProvider = "data1")
    public void test(int a, int b, int c) {
        Long id = Thread.currentThread().getId();
        System.out.println("Test method executing on thread with id: " + id);
        Assert.assertEquals(a + b, c, "Incorrect operation result");
    }

    @Test(dataProviderClass = DataProviderEnum.class, dataProvider = "dataEnum")
    public void test1(Months a, Months b) {
        Assert.assertEquals(a, b);
    }
}
