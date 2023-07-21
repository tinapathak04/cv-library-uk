package resources.testdata;

import org.testng.annotations.DataProvider;

public class TestData {

    @DataProvider(name = "data")
    public Object[][] getData() {
        Object[][] data = new Object[][]{
                {"Tester","Harrow","up to 5 miles","30000","50000","Per annum","permanent"},
                {""},
                {""}
        };
        return data;
    }
}
