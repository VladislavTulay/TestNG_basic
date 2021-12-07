package data_providers;

import org.testng.annotations.DataProvider;
import enums.Months;

public class DataProviderEnum {

    @DataProvider
    public static Object[][] dataEnum() {
        return new Object[][] {
                {Months.APRIL, Months.APRIL},
                {Months.APRIL, Months.JANUARY},
                {Months.APRIL, null},
                {Months.APRIL, Months.JULY}
        };
    }

}
