package Lecture3.PersonStack;

public class Main {

    public static void main(String[] args) {
        PersonStack stack = new PersonStack();
        stack.push(new Person("heini", 29));
        stack.push(new Person("Mikkel", 21));
        stack.push(new Person("Sure mikkel", 22));
        stack.push(new Person("Sassy mikkel", 23));

        printList(stack);

        stack.pop();
        printList(stack);
    }

    private
    static void printList(PersonStack stack) {
        for (Person p : stack.personStack) {
            System.out.println("name: " + p.getName() + " age: " + p.getAge());
        }
    }
}
