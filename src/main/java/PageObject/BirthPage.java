package PageObject;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import javax.lang.model.element.Element;
import javax.lang.model.util.Elements;

import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class BirthPage {

    protected SelenideElement


    accept=$(byText("გავეცანი და ვეთანხმები")).waitUntil(Condition.visible, 3000),
    applicationType=$(byName("document_name")).waitUntil(Condition.visible,3000),
    childsFirstName=$(byName("participant_firstName_0")),
    childsLastName=$(byName("participant_lastName_0")),
    childsBirtDate=$(byName("participant_birthDate_0")),
    fathersFirstName=$(byName("participant_firstName_1")),
    fathersLastName=$(byName("participant_lastName_1")),
    fathersBirtDate=$(byName("participant_birthDate_1")),
    motherFirstName=$(byName("participant_firstName_2")),
    mothersLastName=$(byName("participant_lastName_2")),
    mothersBirtDate=$(byName("participant_birthDate_02")),

   startingRegistrationDate=$(byName("registration_date_from")),
    registrationDateInfoText=$(byText("მიუთითეთ სამოქალაქო აქტის ჩანაწერის რეგისტრაციის თარიღი. თუ კონკრეტული თარიღი უცნობია, მიუთითეთ 3 წლიანი ინტერვალი")), endRegistrationDate=$(byName("registration_date_to")),
    registrationPlace=$(byName("registration_place")),
    agreeActDocument=$(byName("agreeLastActiveDocument")),
    agreeActData=$(byName("agreeActData")),
    declarantType=$(byName("declarant_parent")),
    leavingCountry=$(byName("contact_leaving_country")),
    leavingCity=$(byName("contact_leaving_city")),
    leavingAddress=$(byName("contact_leaving_address")),
    phoneNumber=$(byName("contact_phone_number")),
    getEmail=$(byName("contact_email")),
    foreignCity=$(byName("contact_leaving_cityText")), //ქვეყანაში უცხო ქვეყნის არჩევის შემთხვევაში ქალაქის ხელით ჩაწერისას






    materialDocument=$(byName("agreeMaterial"));










}
