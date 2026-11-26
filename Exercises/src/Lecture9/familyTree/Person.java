package Lecture9.familyTree;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Person {
    private String name;
    private LocalDate dateOfBirth;
    private ArrayList<Person> parents;

    Person (String name, LocalDate dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.parents = new ArrayList<Person>();
    }

    public int countPeople() {
        int sum = 1;
        for (var p : parents) {
            sum += countPeople();
        }
        return sum;
    }

    public int countLivingPeople() {
        int sum = 0;
        if (this.isAlive()) {
            sum = 1;
        }
        for (var p : parents) {
            sum += p.countLivingPeople();
        }
        return sum;
    }

    public abstract boolean isAlive();

    public String getName() { return name; }
    public LocalDate getDateOfBirth() { return dateOfBirth; }
    public ArrayList<Person> getParents() { return parents; }
}
