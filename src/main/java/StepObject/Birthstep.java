package StepObject;

import PageObject.BirthPage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.openqa.selenium.support.ui.Select;

import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.List;
import java.util.Random;

import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;


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

    @Step("fill child's firstname")

    public  Birthstep typeChildsFirstName(String firstname){

        childsFirstName.setValue(firstname);
        return this;

    }
    @Step("fill child's surname")

    public  Birthstep typeChildsLastName(String lastname){

       childsLastName.setValue(lastname);
        return this;

    }
    @Step("fill childs birthdate")

    public  Birthstep chooseChildsBirthday(){

        childsBirtDate.doubleClick();
        childsBirtDate.setValue("01-01-2000");
        return this;

    }

    @Step("fill father's firstname")

    public  Birthstep typefathersFirstName(String firstName){

        fathersFirstName.setValue(firstName);
        return this;

    }
    @Step("fill father's surname")

    public  Birthstep typefathersLastName(String lastName){

        fathersLastName.setValue(lastName);
        return this;

    }
    @Step("fill father's birthdate")

    public  Birthstep choosefathersBirthday(){

        fathersBirtDate.doubleClick();
        fathersBirtDate.setValue("01-01-2000");
        return this;

    }

    @Step("fill mother's firstname")

    public  Birthstep typemothersFirstName(String firstName){

        fathersFirstName.setValue(firstName);
        return this;

    }
    @Step("fill mother's surname")

    public  Birthstep typemothersLastName(String lastName){

        fathersLastName.setValue(lastName);
        return this;

    }
    @Step("fill mother's birthdate")

    public  Birthstep choosemothersBirthday(){

        fathersBirtDate.doubleClick();
        fathersBirtDate.setValue("01-01-2000");
        return this;

    }


    @Step("fill starting registration date")

    public  Birthstep chooseStartingRegistrationDate(Date n){

        startingRegistrationDate.doubleClick();
        startingRegistrationDate.setValue("01-01-2010");

        return this;

    }

    @Step("fill starting registration date")

    public  Birthstep chooseEndRegistrationDate(Date n){

        endRegistrationDate.doubleClick();
        endRegistrationDate.setValue("01-01-2013");

        return this;

    }

    @Step("fill starting registration date")

    public  Birthstep chooseRegistrationPlace(String city){

        registrationPlace.setValue(city);

        return this;

    }





    @Step("accept to get document in ")

    public  Birthstep agreeActDocument(){

        agreeActDocument.click();
        return this;

    }

    @Step("check if act agree document is checked")

    public  Birthstep isAgreeActDocumentchecked(){

        agreeActDocument.shouldBe(Condition.checked);
        return this;

    }

    @Step("agree to get document with current data ")

    public  Birthstep agreeActData(){

        agreeActData.click();
        return this;

    }

    @Step("choose applicant ")

    public  Birthstep chooseDeclarantType(){

        declarantType.selectOptionByValue("32");
        return this;

    }

    @Step("fill leaving country Georgia")

    public  Birthstep chooseLeavingCountryGeorgia(){

        leavingCountry.selectOptionByValue("1");
        return this;

    }

    @Step("fill random leaving country ")

    public  Birthstep chooseLeavingCountry(){
        Select country = new Select (leavingCountry);
        List countryList=  country.getOptions();
        int index=countryList.size();
        Random num=new Random();
        int iSelect=num.nextInt(index);
        country.selectByIndex(iSelect);


        leavingCountry.getAttribute("value");
        return this;



    }

    @Step("choose random city ")

    public  Birthstep chooseLeavingCity(){

        Select city=new Select(leavingCity);
        List cityList=city.getOptions();
        int cityNumber= cityList.size();
        Random num=new Random();
        int citySelect=num.nextInt(cityNumber);
        city.selectByIndex(citySelect);



        leavingCity.getAttribute("value");
        return this;

    }
    @Step("fill declarant address ")

    public  Birthstep getLeavingAddress(String street){

        leavingAddress.setValue(street);
        return this;

    }

    @Step("fill mobile number ")

    public  Birthstep getMobileNumber(String number){

       phoneNumber.setValue(number);
        return this;

    }

    @Step("fill declarant email address ")

    public  Birthstep getEmaiAddress(String email){

        getEmail.setValue(email);

        return this;

    }


    @Step("fill city, when you choose foreign country")

    public  Birthstep getforeignCityName(String city){

        foreignCity.setValue(city);

        return this;

    }




















}
