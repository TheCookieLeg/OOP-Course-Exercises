package Lecture8.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PersonFactory implements IPersonFactory {

    String[] firstNames = {
            "John", "Jane", "Michael", "Sarah", "David",
            "Emily", "James", "Olivia", "Daniel", "Sophia",
            "Liam", "Emma", "Noah", "Isabella", "Lucas",
            "Mia", "Alexander", "Charlotte", "Benjamin", "Amelia"
    };

    String[] lastNames = {
            "Smith", "Johnson", "Brown", "Taylor", "Anderson",
            "Wilson", "Davis", "Miller", "Moore", "Thomas",
            "Jackson", "White", "Harris", "Martin", "Thompson",
            "Garcia", "Robinson", "Clark", "Lewis", "Walker"
    };

    @Override
    public List<Person> generatePeople(int n) {
        Random rand = new Random();
        List<Person> people = new ArrayList<Person>();
        for (int i = 0; i < n; i++) {
            String firstName = firstNames[rand.nextInt(firstNames.length)];
            String lastName = lastNames[rand.nextInt(lastNames.length)];
            int age = rand.nextInt(80);
            people.add(new Person(firstName, lastName, age));
        }

        return people;
    }
}
