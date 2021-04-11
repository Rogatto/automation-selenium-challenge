package day1;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import pages.WorldMetersPage;
import utils.BaseDriver;
import java.net.MalformedURLException;

@Slf4j
public class TestVerifyAmountPopulation {

    public WebDriver driver;

    @BeforeEach
    public void setup() throws MalformedURLException {
        driver = BaseDriver.driverConfiguration();
    }

    @Test
    public void testVerifyAmountPopulation() throws InterruptedException {
        WorldMetersPage worldMetersPage = new WorldMetersPage(driver);

        log.info("Environment World Meters Page: " + driver.getCurrentUrl());

        int count = 1;

        do {

            log.info(" ---------------- " + "Interaction: " + count + "--------------------");
            String currentPopulationSize = worldMetersPage.currentWorldPopulationSize();
            String birthsToday = worldMetersPage.birthsToday();
            String deathToday = worldMetersPage.deathsToday();
            String populationGrowthToday = worldMetersPage.populationGrowthToday();

            String birthsThisYear = worldMetersPage.birthsThisYear();
            String deathThisYear = worldMetersPage.deathsThisYear();
            String populationGrowthThisYear = worldMetersPage.populationGrowthThisYear();

            log.info("Current population world size: " + currentPopulationSize);

            log.info("Today - Current of Births: " + birthsToday);
            log.info("Today - Current of Deaths: " + deathToday);
            log.info("Today - Current of Population Growth: " + populationGrowthToday);

            log.info("This Year - Current of Births: " + birthsThisYear);
            log.info("This Year - Current of Deaths: " + deathThisYear);
            log.info("This Year - Current of Population Growth: " + populationGrowthThisYear);


            Thread.sleep(1000);
            count++;
        } while(count <= 20);
    }

    @AfterEach
    public void tearOff(){
        driver.quit();
    }

}
