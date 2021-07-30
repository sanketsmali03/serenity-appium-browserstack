package integration.broserstack;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import net.thucydides.core.util.EnvironmentVariables;
import net.thucydides.core.util.SystemEnvironmentVariables;
import net.thucydides.core.webdriver.DriverSource;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;
import java.util.Iterator;

public class BrowserStackSerenityDriver implements DriverSource {

    @Override
    public AndroidDriver newDriver() {
        EnvironmentVariables environmentVariables = SystemEnvironmentVariables.createEnvironmentVariables();


      //  String username = GetInfoBrowserStack.getName();

       // String accessKey = GetInfoBrowserStack.getKey();
        String environment = System.getProperty("environment");
        System.out.println("environment is " + environment);
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("app", "bs://e324e0ffe83b2936cd072d75e565c4666767157c");

        Iterator it = environmentVariables.getKeys().iterator();
        while (it.hasNext()) {
            String key = (String) it.next();

            if (key.equals("browserstack.user") || key.equals("browserstack.key")
                    || key.equals("browserstack.server")) {
                continue;
            } else if (key.startsWith("bstack_")) {
                capabilities.setCapability(key.replace("bstack_", ""), environmentVariables.getProperty(key));
                if (key.equals("bstack_browserstack.local")
                        && environmentVariables.getProperty(key).equalsIgnoreCase("true")) {
                    System.setProperty("browserstack.local", "true");
                }
            } else if (environment != null && key.startsWith("environment." + environment)) {

//                System.out.println("----------->>>>>>>>>>>>> key environment is " + key);


                capabilities.setCapability(key.replace("environment." + environment + ".", ""),
                        environmentVariables.getProperty(key));
                if (key.equals("environment." + environment + ".browserstack.local")
                        && environmentVariables.getProperty(key).equalsIgnoreCase("true")) {
                    System.setProperty("browserstack.local", "true");
                }
            }
        }
        capabilities.setCapability("app", "bs://e324e0ffe83b2936cd072d75e565c4666767157c");
        try {
            AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("https://" + "sanketmali4" + ":" + "XaqpcHttuyFzXSzC3uNM" + "@hub-cloud.browserstack.com/wd/hub"), capabilities);
            return driver;

        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

    public boolean takesScreenshots() {
        return true;
    }

}
