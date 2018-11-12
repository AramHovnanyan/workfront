package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

import pages.*;


import java.util.Random;
import java.util.concurrent.TimeUnit;




public class TestScripts {

    Random rand = new Random();

    int  N =(rand.nextInt(9999) + 1);

    WebDriver driver;


    @BeforeSuite
    public void SetUp(){

        //System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/test/java/drivers/chromedriver");


        driver = new FirefoxDriver();
        //To maximize browser
        driver.manage().window().maximize();
        //Implicit wait
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //To open Workfront homepage
        driver.get("https://ancient-taiga-22967.herokuapp.com/index");

    }

    @Test
    public void SignUp(){

        WorkfrontIndexPage indexpage = PageFactory.initElements(driver, WorkfrontIndexPage.class);
        indexpage.clickOnindexPageSignUp();

        WorkfrontRegisterPage registerpage = PageFactory.initElements(driver, WorkfrontRegisterPage.class);
        registerpage.setName("Aram");
        registerpage.verifynameField();
        registerpage.setEmail("aramhovnanyan" + N + "@gmail.com");
        registerpage.verifyemailField();
        registerpage.setPass("123456");
        registerpage.verifypasswordField();
        registerpage.setConfPass("123456");
        registerpage.verifyconfirmPasswordField();
        registerpage.clickOnSignInButton();

        WorkfrontToDoPage todopage = PageFactory.initElements(driver,WorkfrontToDoPage.class);
        todopage.clickOndropDown();
        todopage.clickOnsignOutButton();


    }

    @Test(dependsOnMethods ={"SignUp"},alwaysRun = true)
    public void SignIn(){

        WorkfrontIndexPage indexpage = PageFactory.initElements(driver, WorkfrontIndexPage.class);
        indexpage.clickOnindexPageSignIn();

        WorkfrontLoginPage loginpage = PageFactory.initElements(driver, WorkfrontLoginPage.class);
        loginpage.setEmail("aramhovnanyan1@gmail.com");
        loginpage.setPassword("123456");
        loginpage.clickOnLoginButton();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


    }

    @Test(dependsOnMethods ={"SignIn"},alwaysRun = true)
    public void CreatTask(){


        WorkfrontToDoPage toDoPage = PageFactory.initElements(driver, WorkfrontToDoPage.class);
        toDoPage.clickOncreateToDo();
        toDoPage.setTitle("Test"+N);
        toDoPage.clickOndueDateField();
        toDoPage.clickOnselectMonthYear();
        toDoPage.clickOnselectYear();
        toDoPage.clickOnchooseYear();
        toDoPage.clickOnchooseMonth();
        toDoPage.clickOnchooseDay();
        toDoPage.clickselectPriority();
        toDoPage.setProperty("Low");
        toDoPage.clickOncreateButton();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


    }



}





