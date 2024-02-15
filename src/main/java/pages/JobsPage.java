package main.java.pages;

import main.java.base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class JobsPage extends BaseTest {

    @FindBy(id = "submit")
    private WebElement submitButton;

    @FindBy(id = "jobName")
    private WebElement jobNameInput;

    @FindBy(id = "prepareTestDurationInput")
    private WebElement prepareTestDurationInput;

    @FindBy(id = "executeTestDurationInput")
    private WebElement executeTestDurationInput;

    @FindBy(id = "reviewTestDurationInput")
    private WebElement reviewTestDurationInput;

    @FindBy(id = "priorityInput")
    private WebElement priorityInput;

    @FindBy(id = "earliestStartDateInput")
    private WebElement earliestStartDateInput;

    @FindBy(id = "dueDateInput")
    private WebElement dueDateInput;

    private String jobName;
    private String prepareTestDuration;
    private String executeTestDuration;
    private String reviewTestDuration;
    private String priority;
    private String earliestStartDate;
    private String dueDate;

    public JobsPage(){
        String jobName = "JOB_ONE";
        String prepareDuration = "2";
        String executeDuration = "4";
        String reviewDuration = "2";
        String priority = "50";
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        String earlyStartDate = sdf.format(new Date());
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, 2);
        String dueDate = sdf.format(calendar.getTime());
        new JobsPage(jobName,prepareDuration,executeDuration,reviewDuration,priority,earlyStartDate,dueDate);
    }

    public JobsPage(String jobName,String prepareTestDuration, String executeTestDuration,String reviewTestDuration,String priority,String earliestStartDate,String dueDate) {
        this.jobName = jobName;
        this.prepareTestDuration = prepareTestDuration;
        this.executeTestDuration = executeTestDuration;
        this.reviewTestDuration = reviewTestDuration;
        this.priority = priority;
        this.earliestStartDate = earliestStartDate;
        this.dueDate = dueDate;
        PageFactory.initElements(driver, this);
    }


    public void fillOutNewJobForm(){
        addJobName();
        addPrepareTestDuration();
        addExecuteTestDuration();
        addReviewTestDuration();
        addJobPriority();
        addEarliestStartDate();
        addDueDate();
        submitForm();
    }

    private void addJobName(){
        jobNameInput.click();
        jobNameInput.sendKeys(jobName);
    }

    private void addPrepareTestDuration(){
        prepareTestDurationInput.click();
        prepareTestDurationInput.sendKeys(prepareTestDuration);
    }

    private void addExecuteTestDuration(){
        executeTestDurationInput.click();
        executeTestDurationInput.sendKeys(executeTestDuration);
    }

    private void addReviewTestDuration(){
        reviewTestDurationInput.click();
        reviewTestDurationInput.sendKeys(reviewTestDuration);
    }

    private void addJobPriority(){
        priorityInput.click();
        priorityInput.sendKeys(priority);
    }

    private void addEarliestStartDate(){
        earliestStartDateInput.click();
        earliestStartDateInput.sendKeys(earliestStartDate);
    }

    private void addDueDate(){
        dueDateInput.click();
        dueDateInput.sendKeys(dueDate);
    }

    private void submitForm(){
        submitButton.click();
    }
}
