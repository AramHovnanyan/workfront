package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class WorkfrontIndexPage {

    WebDriver driver;

    public WorkfrontIndexPage(WebDriver driver){

        this.driver=driver;
    }

    @FindBy(how=How.XPATH, using="/html/body/div[2]/div/div/div/div[1]/p[3]/a[1]") WebElement indexPageSignIn;
    @FindBy(how=How.XPATH, using="/html/body/div[2]/div/div/div/div[1]/p[3]/a[2]") WebElement indexPageSignUp;

    public void clickOnindexPageSignIn(){

        indexPageSignIn.click();
    }

    public void clickOnindexPageSignUp(){

        indexPageSignUp.click();
    }

}
