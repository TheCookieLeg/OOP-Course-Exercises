package Lecture8.Person;

import java.util.ArrayList;
import java.util.List;

public class GenericPersonFactory implements IPersonFactory {

    @Override
    public List<Person> generatePeople(int n) {
        List<Person> people = new ArrayList<Person>();
        for (int i = 0; i < n; i++) {
            people.add(new Person("Palle", "Pallesen", 10));
        }
        return people;
    }
}
