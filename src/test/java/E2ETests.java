package test.java;


import main.java.base.BaseTest;
import main.java.pages.*;
import org.testng.annotations.Test;

public class E2ETests extends BaseTest {

    @Test()
    public void testNewUserRegisterAndLogin() {
        HomePage homePage = new HomePage();
        homePage.addScheduleWindow();

        ScheduleWindowPage scheduleWindowPage = new ScheduleWindowPage();
        scheduleWindowPage.fillOutScheduleWindowForm();

        homePage.addJobToSchedule();
        JobsPage jobsPage = new JobsPage();
        jobsPage.fillOutNewJobForm();

        homePage.addResourceForSchedule();
        ResourcesPage resourcesPageHuman = new ResourcesPage(true);
        ResourcesPage resourcesPageEquipment = new ResourcesPage(false);
        resourcesPageEquipment.addResource();

        homePage.addResourceForSchedule();
        resourcesPageHuman.addResource();

        homePage.clickRunAlgorithm();

        ResultsPage resultsPage = new ResultsPage();
        resultsPage.viewTableIsPresent();

    }
}
