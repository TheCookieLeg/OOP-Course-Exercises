package Lecture3.PersonStack;

import java.util.ArrayList;
import Lecture3.PersonStack.Person;


public class PersonStack {
    public ArrayList<Person> personStack;

    public PersonStack() {
        personStack = new ArrayList<Person>();
    }

    public void push(Person p) {
        personStack.add(p);
    }

    public Person pop() {
        return personStack.removeLast();
    }
}
