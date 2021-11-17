package DataObject;

import com.github.javafaker.Faker;

import java.util.Date;

public interface ComonData {

Faker faker=new Faker();
    String
      FirstName=faker.name().firstName(),
      LastName=faker.name().lastName(),
      city="თბილისი",
            cityForeign="ვოშინგტონი",
      email="test@test.test",
    address="რუსთაველის ქ N 10",
    addressforeign="ვოლსტრიტი",
    mobilenumber="545565656";




    Date
     date=faker.date().birthday();

  /*  int
            childsBirthDate=faker.date().birthday();*/


}
