package Lecture8.Person;

import java.util.ArrayList;
import java.util.List;

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

        return new ArrayList<Person>();
    }
}
