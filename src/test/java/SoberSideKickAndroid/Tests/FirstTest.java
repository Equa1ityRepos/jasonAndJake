package SoberSideKickAndroid.Tests;

import SoberSideKickAndroid.Tools.Selectors;
import io.appium.java_client.android.AndroidDriver;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.OrderWith;
import org.junit.runner.manipulation.Alphanumeric;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.IOException;
import java.net.URISyntaxException;

import static SoberSideKickAndroid.Tools.BuildAppiumDriver.fuckYou;

@OrderWith(Alphanumeric.class)
public class FirstTest extends Selectors {

    public static AndroidDriver driver;

    @BeforeClass
    public static void setupTest()  {
        DesiredCapabilities caps = new DesiredCapabilities();
         driver = fuckYou(caps);
    }

    @Test
    public void test1() throws InterruptedException {
        //Wait for pop up then click login button
        Thread.sleep(2000);
        driver.findElement(appOpenPopUp.chrisNamePopUp).isDisplayed();
        driver.findElement(appOpenPopUp.loginButton).click();
        //empty comment
    }

    @Test
    public void test2() throws InterruptedException {
        //fill out login page
        Thread.sleep(2000);
        driver.findElement(LoginPage.loginTitle).isDisplayed();
        driver.findElement(LoginPage.userName).sendKeys("equa1itype4ce");
        driver.findElement(LoginPage.userPassword).sendKeys("Qwer1234");
        driver.findElement(LoginPage.loginButton).click();
    }

    @Test
    public void test3() throws InterruptedException {
        //waitforLoginConfirmation
        Thread.sleep(1000);
        driver.findElement(WelcomeBackPopUp.wereInThisTogether).isDisplayed();
    }


}
