package uk.co.library.testsuite;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import resources.testdata.TestData;
import uk.co.library.customlisteners.CustomListeners;
import uk.co.library.pages.HomePage;
import uk.co.library.pages.ResultPage;
import uk.co.library.testbase.BaseTest;

@Listeners(CustomListeners.class)
public class JobSearchTest extends BaseTest {

    HomePage homePage;
    ResultPage resultPage;

    @BeforeMethod(alwaysRun = true)
    public void init(){
        homePage = new HomePage();
        resultPage = new ResultPage();
    }


    @Test(dataProvider = "data",dataProviderClass = TestData.class,groups = {"sanity","regression"})
 public void verifyJobSearchResultUsingDifferentDataSet(String jobTitle,String location,String distance,String salaryMin
            ,String salaryMax,String salaryType,String jobType,String result){
        //Accept cookies
        homePage.acceptCookies();

        SoftAssert softAssert = new SoftAssert();
        // enter job title 'jobTitle'
        homePage.typeOnJobTitle(jobTitle);
        // enter Location 'location'
        homePage.typeOnLocation(location);
        //select distance 'distance'
        homePage.clickOnSelectList(distance);
        //click on moreSearchOptionsLink
        homePage.clickOnMoreButton();
        //enter salaryMin 'salaryMin'
        homePage.typeOnMinimumSalary(salaryMin);
        //  enter salaryMax 'salaryMax'
        homePage.typeOnMaximumSalary(salaryMax);
        //select salaryType 'salaryType'
        homePage.selectOnSalaryType(salaryType);
        //select jobType 'jobType'
        homePage.selectJobType(jobType);
        //click on 'Find Jobs' button
        homePage.clickByFindJobs();
        //verify the result 'result'
        Assert.assertEquals("Permanent Tester jobs in Harrow",resultPage.verifyMessage(),"Message not displayed");
        softAssert.assertAll();



//        String expectedText1 = "Permanent Tester jobs in Harrow";
//        String actualText1 =homePage.verifyMassage();
//        Assert.assertEquals(actualText1, expectedText1, "Message not displayed");

}
}
