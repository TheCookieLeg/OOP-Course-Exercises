package Lecture1.Wordle;
import java.util.Random;

public class Wordle {
    public static String[] words = {
            "adore",
            "beaut",
            "feast",
            "excel",
            "merry",
            "thank",
            "world",
            "youth",
            "proud",
            "shine"
    };

    public static void main(String[] args) {
        System.out.println(pickWord());
    }

    public static String pickWord() {
        Random rand = new Random();
        int n = rand.nextInt(words.length);
        return words[n];
    }

    



}
