package Lecture9.familyTree;

import java.time.LocalDate;

public class DeadPerson extends Person{
    private LocalDate dateOfDeath;


    public DeadPerson(String name, LocalDate dateOfBirth, LocalDate dateofDeath) {
        super(name, dateOfBirth);
        this.dateOfDeath = dateofDeath;
    }

    public LocalDate getDateOfDeath() { return dateOfDeath; }

    public boolean isAlive() { return false; }
}
