package Lecture1.Wordle;
import java.util.Random;
import java.util.Scanner;

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
    public static String word;
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        word = pickWord();
        System.out.println(word);
        System.out.println("Welcome to wordle!!");
        System.out.println("You have 6 tries to guess a 5 letter word");
        System.out.println("The game starts... NOW!");
        boolean playerWin = playerInput();

        if (playerWin) {
            System.out.println("Correct! The word was " + word);
        } else {
            System.out.println("Fucking loser");
        }
    }

    public static String pickWord() {
        Random rand = new Random();
        int n = rand.nextInt(words.length);
        return words[n];
    }

    public static boolean playerInput() {
        for (int i = 1; i <= 6; i++) {
            System.out.println("Give guess");
            String guess = sc.nextLine();
            boolean isRight = false;
            if (guess.length() == 5) {
                isRight = checkPlayerInput(guess);
            } else {
                System.out.println("Please only write a word with 5 letters");
                i--;
            }
            if (isRight) { return true; }
        }
        return false;
    }

    private static boolean checkPlayerInput(String guess) {
        // Check if the word is right
        if (guess.equalsIgnoreCase(word)) {
            return true;
        }
        // If not, check what letters are correct
        char[] guessChar = guess.toCharArray();
        char[] wordChar = word.toCharArray();
        char[] result = {'_', '_', '_', '_', '_'};

        for (int i = 0; i < 5; i++) {
            if (guessChar[i] == wordChar[i]) {
                result[i] = wordChar[i];
            }
            for (int j = 0; j < 5; j++) {
                if (i != j) {
                    if (guessChar[i] == wordChar[j]) {
                        result[i] = '/';
                        break;
                    }
                }
            }
        }

        // Print out the result
        for (char c : result) {
            System.out.print(c);
        }
        System.out.println(" ");
        return false;
    }

}
