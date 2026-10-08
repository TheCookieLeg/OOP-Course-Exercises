package Lecture3.crypto;

public class CaesarEncrypter extends DefaultEncrypter {
    private byte key;
    public CaesarEncrypter(byte key) {this.key = key;}

    @Override
    public byte[] encrypt (byte[] inp) {
        for (byte bit : inp) {
            bit += key;
        }
        return inp;
    }
}
