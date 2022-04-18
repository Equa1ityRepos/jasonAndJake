package SoberSideKickAndroid.Tools;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class BuildAppiumDriver {


    public static AndroidDriver fuckYou(DesiredCapabilities capabilities){
        AndroidDriver driver;
        capabilities.setCapability("deviceName", "Android");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("device", "Android");
        capabilities.setCapability("autoGrantPermissions", true);
        capabilities.setCapability("automationName", "UiAutomator2");
        capabilities.setCapability("appPackage", "com.sidekick.app.sobersidekick");
        capabilities.setCapability("appActivity", "com.sidekick.app.sobersidekick.MainActivity");
        capabilities.setCapability("adbExecTimeout", 50000);
        try {
            driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        return driver;
    }
}
