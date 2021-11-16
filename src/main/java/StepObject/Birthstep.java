package StepObject;

import PageObject.BirthPage;
import io.qameta.allure.Step;


public class Birthstep extends BirthPage {

    @Step("click on accept checkbox")

    public  Birthstep acceptCheckbox(){

        accept.click();
        return this;

    }

    @Step("choose type of application")

    public  Birthstep chooseTypeOfAct(){

       applicationType.selectOptionByValue("20");
        return this;

    }









}
