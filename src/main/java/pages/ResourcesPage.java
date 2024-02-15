package main.java.pages;

import main.java.base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResourcesPage extends BaseTest {

    @FindBy(id = "submitButton")
    private WebElement submitButton;

    @FindBy(id = "resourceName")
    private WebElement resourceNameInput;

    @FindBy(id = "humanRadio")
    private WebElement humanRadio;

    @FindBy(id = "equipmentRadio")
    private WebElement equipmentRadio;

    @FindBy(id = "availabilityInput")
    private WebElement availabilityInput;

    private String name,availability;
    private boolean human;



    public ResourcesPage(boolean isHuman){
        String name;
        String availability;
        if(isHuman){
            name = "Employee_one";
        } else {
            name = "equipment_one";
        }
        availability = "8";
        new ResourcesPage(name,isHuman,availability);
    }

    public ResourcesPage(String name, boolean isHuman,String availability){
        this.name = name;
        this.human = isHuman;
        this.availability = availability;

        PageFactory.initElements(driver, this);
    }


    public void addResource(){
        addNameToResource();
        if (human) clickEquipmentRadio();
        else clickHumanRadio();
        addAvailability();
        submitForm();
    }

    private void addNameToResource(){
        resourceNameInput.click();
        resourceNameInput.sendKeys(name);
    }

    private void clickHumanRadio(){
        humanRadio.click();
    }

    private void clickEquipmentRadio(){
        equipmentRadio.click();
    }

    private void addAvailability(){
        availabilityInput.click();
        availabilityInput.sendKeys(availability);
    }

    private void submitForm(){
        submitButton.click();
    }
}
