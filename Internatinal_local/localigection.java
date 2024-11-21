package Internatinal_local;

import java.util.Locale;

public class localigection {
    public static void main(String[] args) {
        Locale eng=new Locale("en","US");
        Locale fr=new Locale("fr","Fr");
        Locale spi=new Locale("es","ES");

        System.out.println("English Detail "+ eng.getDisplayLanguage());
        System.out.println("French Detail "+ eng.getDisplayLanguage(fr));
        System.out.println("Spain Detail "+ eng.getDisplayLanguage(spi));
    }
}
