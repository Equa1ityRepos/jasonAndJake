package SoberSideKickAndroid.Tools;

import org.openqa.selenium.By;
import io.appium.java_client.MobileBy;

public class Selectors {

    public static class appOpenPopUp {
        public static By chrisNamePopUp = By.xpath("//android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView");
        public static By loginButton = MobileBy.id("com.sidekick.app.sobersidekick:id/promptCancelButton");
    }

    public static class LoginPage{
        public static By loginTitle = MobileBy.id("com.sidekick.app.sobersidekick:id/authCtaText");
        public static By userName = MobileBy.id("com.sidekick.app.sobersidekick:id/tvUsernameAuth");
        public static By userPassword = MobileBy.id("com.sidekick.app.sobersidekick:id/tvAuthPassword");
        public static By loginButton = MobileBy.id("com.sidekick.app.sobersidekick:id/btnAuth");
    }

    public static  class WelcomeBackPopUp{
        public static By wereInThisTogether = MobileBy.id("com.sidekick.app.sobersidekick:id/tvSuccessMessage");
    }


}
