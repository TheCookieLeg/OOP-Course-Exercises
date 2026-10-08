package Lecture3.crypto;

public class CaesarDecrypter extends DefaultDecrypter {
    private byte key;
    public CaesarDecrypter(byte key) {this.key = key;}

    @Override
    public byte[] decrypt (byte[] inp) {
        for (byte bit : inp) {
            bit -= key;
        }
        return inp;
    }
}
