package ui;
import model.Enigma;

public class Main {
    public static void main(String[] args) throws Exception {
        Enigma kaviET = new Enigma();

        kaviET.addSetting3();
        kaviET.addSetting2();
        kaviET.addSetting3();

        System.out.println(kaviET.cipher("yo man, the password for my et is ilikedogs123"));
        System.out.println(kaviET.cipher("inil9yzsp f1lzuk90.0c,ouyow0gvmgq5w 7 s5paicag"));
    }
}
