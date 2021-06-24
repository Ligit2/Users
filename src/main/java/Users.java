import com.github.javafaker.Faker;
import com.github.javafaker.service.FakeValuesService;
import com.github.javafaker.service.RandomService;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.*;
import java.util.stream.Stream;

public class Users {
    private static final Faker instance = new Faker();
    private static final Random random = new Random();

    public static Person makePerson() {
        int randomAge = 10 + random.nextInt(60);
        String age = Integer.toString(randomAge);
        Person person = new Person(instance.name().firstName(), instance.name().lastName(),
                instance.phoneNumber().phoneNumber(), instance.internet().emailAddress(), instance.address().fullAddress(), age);
        return person;
    }
    public static ArrayList<Person> getUsersList(){
        ArrayList<Person> people = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            people.add(makePerson());
        }
        return people;
    }
}
