package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;


public class WorkfrontToDoPage {

    WebDriver driver;

    public WorkfrontToDoPage(WebDriver driver) {

        this.driver = driver;
    }

    @FindBy(how=How.XPATH, using="/html/body/div[2]/div/div[2]/div/div[2]/div") WebElement successSignUpAlert;
    @FindBy(how=How.XPATH, using="/html/body/div[1]/div/div/div/a/i") WebElement dropDown;
    @FindBy(how=How.XPATH, using="/html/body/div[1]/div/div/div/ul/li[3]/a") WebElement signOutButton;
    @FindBy(how=How.XPATH, using="/html/body/div[2]/div/div[1]/div/ul/li[4]/a") WebElement createToDo;
    @FindBy(how=How.ID, using="title") WebElement titleField;
    @FindBy(how=How.ID, using="dueDate") WebElement dueDateField;
    @FindBy(how=How.XPATH, using="/html/body/div[3]/div[1]/table/thead/tr[1]/th[2]") WebElement selectMonthYear;
    @FindBy(how=How.XPATH, using="/html/body/div[3]/div[2]/table/thead/tr/th[2]") WebElement selectYear;
    @FindBy(how=How.XPATH, using="/html/body/div[3]/div[3]/table/tbody/tr/td/span[10]") WebElement chooseYear;
    @FindBy(how=How.XPATH, using="/html/body/div[3]/div[2]/table/tbody/tr/td/span[11]") WebElement chooseMonth;
    @FindBy(how=How.XPATH, using="/html/body/div[3]/div[1]/table/tbody/tr[5]/td[6]") WebElement chooseDay;
    @FindBy(how=How.ID, using="priority") WebElement selectPriority;
    //@FindBy(how=How., using="//*[@id=\"priority\"]/option[2]") WebElement chooseMedium;
    @FindBy(how=How.XPATH, using="//*[@id=\"createTodoForm\"]/fieldset/div[4]/button[1]") WebElement createButton;






    public void clickOndropDown(){

        dropDown.click();
    }

    public void clickOnsignOutButton(){

        signOutButton.click();
    }

    public void clickOncreateToDo(){

        createToDo.click();
    }

    public void setTitle(String strTitle){

        titleField.sendKeys(strTitle);
    }
    public void clickOndueDateField(){

        dueDateField.click();
    }
    public void clickOnselectMonthYear(){

        selectMonthYear.click();
    }
    public void clickOnselectYear(){

        selectYear.click();
    }
    public void clickOnchooseYear(){

        chooseYear.click();
    }

    public void clickOnchooseMonth(){

        chooseMonth.click();
    }

    public void clickOnchooseDay(){

        chooseDay.click();
    }

    public void clickselectPriority(){

        selectPriority.isSelected();
    }

    public void setProperty(String strProperty){

        selectPriority.sendKeys(strProperty);
    }

    public void clickOncreateButton(){

        createButton.click();
    }

}
