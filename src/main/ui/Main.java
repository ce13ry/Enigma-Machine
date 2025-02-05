package ui;
import model.Enigma;

public class Main {
    public static void main(String[] args) throws Exception {
        Enigma brenden = new Enigma();

        brenden.addSetting1();
        brenden.addSetting3();
        brenden.addSetting2();

        System.out.println(brenden.cipher("aaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));
        System.out.println(brenden.cipher("k88jb,24vw2g3unb,6qjfce.i78 3"));
    }
}
