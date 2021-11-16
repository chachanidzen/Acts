package DataObject;

import com.github.javafaker.Faker;

public interface ComonData {

Faker faker=new Faker();
    String
      FirstName=faker.name().firstName(),
      LastName=faker.name().lastName();

  /*  int
            childsBirthDate=faker.date().birthday();*/


}
