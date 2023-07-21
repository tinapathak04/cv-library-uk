package uk.co.library.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import uk.co.library.utilities.Utility;

public class HomePage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//iframe[@id='gdpr-consent-notice']")
    WebElement acceptIFrame;

    @CacheLookup
    @FindBy(xpath = "//input[@id='keywords']")
    WebElement typeJobTitle;

    @CacheLookup
    @FindBy(xpath = "//input[@id='location']")
    WebElement typeLocation;

    @CacheLookup
    @FindBy(xpath = "//select[@id='distance']")
    WebElement selectDistance;

    @CacheLookup
    @FindBy(xpath = "//button[@id='toggle-hp-search']" )
    WebElement searchOption;

    @CacheLookup
    @FindBy(xpath = "//input[@id='salarymin']")
    WebElement minimumSalary;

    @CacheLookup
    @FindBy(xpath ="//input[@id='salarymax']")
    WebElement maximumSalary;

    @CacheLookup
    @FindBy(xpath ="//select[@id='salarytype']")
    WebElement selectSalaryType;

    @CacheLookup
    @FindBy(xpath = "//select[@id='tempperm']")
    WebElement typeOfJob;

    @CacheLookup
    @FindBy(xpath = "//input[@id='hp-search-btn']")
    WebElement clickOnFindJobs;

    @CacheLookup
    @FindBy(xpath = "//span[text()='Accept All']")
    WebElement acceptCookies;



    public void acceptCookies() {
        driver.switchTo().frame(acceptIFrame);}




        public void typeOnJobTitle (String jobTitle){
            sendTextToElement(typeJobTitle, jobTitle);
        }
        public void typeOnLocation (String location){
            sendTextToElement(typeLocation, location);
        }
        public void clickOnSelectList (String miles){
            selectByValueFromDropDown(selectDistance, miles);
        }
        public void clickOnMoreButton () {
            clickOnElement(searchOption);
        }
        public void typeOnMinimumSalary (String salaryMin){
            sendTextToElement(minimumSalary, salaryMin);
        }
        public void typeOnMaximumSalary (String salaryMax){
            sendTextToElement(maximumSalary, salaryMax);
        }
        public void selectOnSalaryType (String salaryType){
            selectByValueFromDropDown(selectSalaryType, salaryType);
        }
        public void selectJobType (String jobType){
            selectByValueFromDropDown(typeOfJob, jobType);
        }

        public void clickByFindJobs () {
            clickOnElement(clickOnFindJobs);
        }


    }

