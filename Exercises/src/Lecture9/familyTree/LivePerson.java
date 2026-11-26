package Lecture9.familyTree;

import java.time.LocalDate;

public class LivePerson extends Person {

    public LivePerson(String name, LocalDate dateOfBirth) {
        super(name, dateOfBirth);
    }

    public boolean isAlive() { return true; }
}
