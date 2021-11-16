import StepObject.Birthstep;
import Utils.ChromeRunner;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.Test;
import DataObject.ComonData;
import StepObject.Birthstep;
public class BirthCertificate extends ChromeRunner {

    @Test


    public void child(){


        Selenide.open("/index#/secondaryActs/editor");

        Birthstep steps=new Birthstep();
        steps
                .acceptCheckbox()
                .chooseTypeOfAct();










    }




}
