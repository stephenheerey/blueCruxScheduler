package main.java.pages;

import main.java.base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ScheduleWindowPage extends BaseTest {

    @FindBy(id = "scheduleStart")
    private WebElement scheduleStartInput;

    @FindBy(id = "scheduleEnd")
    private WebElement scheduleEndInput;

    @FindBy(id = "submit")
    private WebElement submitButton;

    private String startDate,endDate;


    public ScheduleWindowPage(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        String startDate = sdf.format(new Date());
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, 7);
        String endDate = sdf.format(calendar.getTime());
        new ScheduleWindowPage(startDate,endDate);

    }
    public ScheduleWindowPage(String startDate, String endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
        PageFactory.initElements(driver, this);
    }

    public void fillOutScheduleWindowForm(){
        addStartDate();
        addEndDate();
        submitForm();
    }

    public void addStartDate(){
        scheduleStartInput.click();
        scheduleStartInput.sendKeys(startDate);
    }

    public void addEndDate(){
        scheduleEndInput.click();
        scheduleEndInput.sendKeys(endDate);
    }

    public void submitForm(){
        submitButton.click();
    }

}
