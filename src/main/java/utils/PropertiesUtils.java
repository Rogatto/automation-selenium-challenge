package utils;

import lombok.NonNull;
import lombok.SneakyThrows;
import org.apache.commons.configuration.Configuration;
import org.apache.commons.configuration.PropertiesConfiguration;

public class PropertiesUtils {

    private static final Configuration configuration = loadConfiguration();

    private PropertiesUtils() {
        // Utils can not be initialized
    }

    @SneakyThrows
    private static Configuration loadConfiguration() {
        return new PropertiesConfiguration("src/test/resources/default-values.properties");
    }

    public static String getString(@NonNull String propertyName) {
        return configuration.getString(propertyName);
    }

    public static String extractApplicationUrl() {
        return getString("application_host");
    }

    public static String extractSeleniumGridUrl() {
        return getString("selenium_grid");
    }
}
