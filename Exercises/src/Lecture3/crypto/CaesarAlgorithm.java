package Lecture3.crypto;

public class  CaesarAlgorithm extends EncryptionAlgorithm {
    public CaesarAlgorithm (byte key) {
	super(key);
    }
    
    public IDecrypter getDecrypter () {return new CaesarDecrypter(getKey());}
    
    public IEncrypter getEncrypter () {return new CaesarEncrypter(getKey());}


}
