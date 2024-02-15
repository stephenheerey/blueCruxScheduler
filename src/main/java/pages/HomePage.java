package main.java.pages;

import main.java.base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseTest {
    @FindBy(xpath = "//button[@id=\"addJob\"]")
    private WebElement addJobButton;

    @FindBy(xpath = "//button[@id=\"addResources\"]")
    private WebElement addResourcesButton;

    @FindBy(xpath = "//button[@id=\"addConstraints\"]")
    private WebElement addConstraintsButton;

    @FindBy(xpath = "//button[@id=\"runAlgorithm\"]")
    private WebElement runAlgorithmButton;


    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    public void addJobToSchedule(){
        addJobButton.click();
    }

    public void addResourceForSchedule(){
        addResourcesButton.click();
    }

    public void addScheduleWindow(){
        addConstraintsButton.click();
    }

    public void clickRunAlgorithm(){
        runAlgorithmButton.click();
    }
}
