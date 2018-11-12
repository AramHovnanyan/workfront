package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class WorkfrontRegisterPage {

    WebDriver driver;

    public WorkfrontRegisterPage(WebDriver driver) {

        this.driver = driver;
    }

    @FindBy(how=How.ID, using="name") WebElement nameField;
    @FindBy(how=How.ID, using="email") WebElement emailField;
    @FindBy(how=How.ID, using="password") WebElement passwordField;
    @FindBy(how=How.ID, using="confirmationPassword") WebElement confirmPasswordField;
    @FindBy(how=How.XPATH, using="//*[@id=\"registrationForm\"]/fieldset/div[5]/button") WebElement signupButton;


    public void setName(String strName){

        nameField.sendKeys(strName);
    }

    public String verifynameField(){
        String userName = nameField.getText();
        return userName;
    }

    public void setEmail(String strEmail){

        emailField.sendKeys(strEmail);
    }

    public String verifyemailField(){
        String useremail = emailField.getText();
        return useremail;
    }

    public void setPass(String strPass){

        passwordField.sendKeys(strPass);
    }

    public String verifypasswordField(){
        String userPass = passwordField.getText();
        return userPass;
    }

    public void setConfPass(String strConfPass){

        confirmPasswordField.sendKeys(strConfPass);
    }

    public String verifyconfirmPasswordField(){
        String userConfPass = confirmPasswordField.getText();
        return userConfPass;
    }

    public void clickOnSignInButton(){

        signupButton.click();
    }


}
