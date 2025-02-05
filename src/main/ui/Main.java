package ui;
import model.Enigma;

public class Main {
    public static void main(String[] args) throws Exception {
        Enigma socialSecurtiyNum = new Enigma();

        socialSecurtiyNum.addSetting4();
        socialSecurtiyNum.addSetting1();
        socialSecurtiyNum.addSetting3();
        socialSecurtiyNum.addSetting3();

        System.out.println(socialSecurtiyNum.cipher("my social security number is 1234567890."));
        System.out.println(socialSecurtiyNum.cipher("3g49buhs1,xnbp1b4faixh6j.fyv8ptkw8,q3n37"));
    }
}
