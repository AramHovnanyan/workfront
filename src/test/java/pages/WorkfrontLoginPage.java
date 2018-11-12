package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class WorkfrontLoginPage {

    WebDriver driver;

    public WorkfrontLoginPage(WebDriver driver){

        this.driver=driver;
    }

    //Using FindBy for locating elements
    @FindBy(how=How.ID, using="email") WebElement emailTextBox;
    @FindBy(how=How.ID, using="password") WebElement passwordTextBox;
    @FindBy(how=How.XPATH, using="//*[@id=\"loginForm\"]/fieldset/div[3]/button") WebElement signinButton;

    // Defining all the user actions (Methods) that can be performed in the Facebook home page

    // This method is to set Email in the email text box
    public void setEmail(String strEmail){

        emailTextBox.sendKeys(strEmail);
    }
    // This method is to set Password in the password text box
    public void setPassword(String strPassword){

        passwordTextBox.sendKeys(strPassword);
    }
    // This method is to click on Login Button
    public void clickOnLoginButton(){

        signinButton.click();
    }
}