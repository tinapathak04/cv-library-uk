package uk.co.library.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import uk.co.library.utilities.Utility;

public class ResultPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Permanent Tester jobs in Harrow')]")
    WebElement textByVerify;

    public String verifyMessage(){
        return getTextFromElement(textByVerify);
    }

}
