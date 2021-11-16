package PageObject;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import javax.lang.model.element.Element;
import javax.lang.model.util.Elements;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class BirthPage {

    protected SelenideElement


    accept=$(byText("გავეცანი და ვეთანხმები")).waitUntil(Condition.visible, 5000),
    applicationType=$(".form-control ng-pristine ng-invalid ng-invalid-required ng-touched").waitUntil(Condition.visible,3000);









}
