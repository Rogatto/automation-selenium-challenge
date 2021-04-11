package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.PropertiesUtils;

public class WorldMetersPage {

    public WebDriver driver;

    @FindBy(className = "rts-counter")
    public WebElement currentWorldPopulation;

    @FindBy(css = "[rel='births_today']")
    public WebElement totalBirthsToday;

    @FindBy(css = "[rel='dth1s_today']")
    public WebElement totalDeathsToday;

    @FindBy(css = "[rel='absolute_growth']")
    public WebElement totalAbsoluteGrowthToday;

    @FindBy(css = "[rel='births_this_year']")
    public WebElement totalBirthsThisYear;

    @FindBy(css = "[rel='dth1s_this_year']")
    public WebElement totalDeathsThisYear;

    @FindBy(css = "[rel='absolute_growth_year']")
    public WebElement totalAbsoluteGrowthThisYear;


    public WorldMetersPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        driver.get(PropertiesUtils.extractApplicationUrl());
    }

    public String currentWorldPopulationSize(){
        return currentWorldPopulation.getText();
    }

    public String birthsToday(){
        return totalBirthsToday.getText();
    }

    public String deathsToday(){
        return totalDeathsToday.getText();
    }

    public String populationGrowthToday(){
        return totalAbsoluteGrowthToday.getText();
    }

    public String birthsThisYear(){
        return totalBirthsThisYear.getText();
    }

    public String deathsThisYear(){
        return totalDeathsThisYear.getText();
    }

    public String populationGrowthThisYear(){
        return totalAbsoluteGrowthThisYear.getText();
    }
}
