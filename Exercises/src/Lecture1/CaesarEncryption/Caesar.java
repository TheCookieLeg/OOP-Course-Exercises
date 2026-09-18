package Lecture1.CaesarEncryption;

public class Caesar {

    public static void main(String[] args) {
        String s = encrypt("What an amazing time we're having tonight", 4);
        System.out.println(s);
        s = decrypt(s, 4);
        System.out.println(s);
    }


    public static String encrypt(String text, int offset) {
        char[] textArray = text.toCharArray();
        char[] newTextArray = new char[textArray.length];

        for (int i = 0; i < textArray.length; i++) {
            int j = (int)textArray[i];
            j += offset;
            newTextArray[i] = (char)j;
        }
        return new String(newTextArray);
    }

    public static String decrypt(String text, int offset) {
        char[] textArray = text.toCharArray();
        char[] newTextArray = new char[textArray.length];

        for (int i = 0; i < textArray.length; i++) {
            int j = (int)textArray[i];
            j -= offset;
            newTextArray[i] = (char)j;
        }
        return new String(newTextArray);
    }
}
