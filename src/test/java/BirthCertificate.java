import StepObject.Birthstep;
import Utils.ChromeRunner;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import io.qameta.allure.Description;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import DataObject.ComonData;
import StepObject.Birthstep;
import java.util.List;
import java.util.Random;
import static DataObject.ComonData.*;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class BirthCertificate extends ChromeRunner {

    @Test(priority = 1)
    @Description("დაბადების პირველადი მოწმობის განცხადებიე რეგისტრაციის პროცესი")


    public void child() {


        Selenide.open("/index#/secondaryActs/editor");
        $(byText("გავეცანი და ვეთანხმები")).waitUntil(Condition.visible, 3000).click();


        Birthstep steps = new Birthstep();


        steps
                .chooseTypeOfAct()
                .typeChildsFirstName(FirstName)
                .typeChildsLastName(LastName)
                .chooseChildsBirthday()
                .typefathersFirstName(FirstName)
                .typefathersLastName(LastName)
                .choosefathersBirthday()
                .typemothersFirstName(FirstName)
                .typemothersLastName(LastName)
                .choosemothersBirthday()
                .chooseStartingRegistrationDate(date)
                .chooseEndRegistrationDate(date)
                .chooseRegistrationPlace(city)
                .agreeActDocument()
                .isAgreeActDocumentchecked()
                .agreeActData()
                .chooseDeclarantType()
                .chooseLeavingCountryGeorgia()
                .chooseLeavingCity()
                .getLeavingAddress(address)
                .getLeavingAddress(address)
                .chooseLeavingCountry()
                .getforeignCityName(cityForeign)
                .getLeavingAddress(addressforeign)
                .getMobileNumber(mobilenumber)
                .getEmaiAddress(email);






        sleep(3000);


    }


    @Test(priority = 2)


    public void declarantContactDetails() {






        sleep(3000);


    }
}
