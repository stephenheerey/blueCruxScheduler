package main.java.pages;

import main.java.base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResultsPage extends BaseTest {

    @FindBy(id = "tableView")
    private WebElement tableView;

    public ResultsPage(){

        PageFactory.initElements(driver, this);
    }

    public void viewTableIsPresent(){
        tableView.isDisplayed();
    }
}
