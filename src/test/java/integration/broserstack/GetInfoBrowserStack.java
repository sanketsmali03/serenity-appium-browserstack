package integration.broserstack;

import net.thucydides.core.util.EnvironmentVariables;
import net.thucydides.core.util.SystemEnvironmentVariables;

public class GetInfoBrowserStack {
    public static String getName() {
        String username = System.getenv("BROWSERSTACK_USERNAME");
        if (username == null) {
            username = getEnvironmentVariables().getProperty("browserstack.user");
        }
        return username;
    }

    public static String getKey() {
        String accessKey = System.getenv("BROWSERSTACK_ACCESS_KEY");
        if (accessKey == null) {
            accessKey = getEnvironmentVariables().getProperty("browserstack.key");
        }
        return accessKey;
    }

    public static EnvironmentVariables getEnvironmentVariables() {
        return SystemEnvironmentVariables.createEnvironmentVariables();
    }
}
