package Internatinal_local;

import java.util.Locale;

public class language {
    public static void main(String[] args) {
//        Locale ll=new Locale("mr","IN");
//        System.out.println(ll.getCountry());
//        System.out.println(ll.getDisplayCountry());
//        System.out.println(ll.getDisplayLanguage());

        Locale loc[]=Locale.getAvailableLocales();
        System.out.println("all local");
        for (Locale l:loc){
            System.out.println(l.getDisplayLanguage()+"  "+l.getCountry());
            System.out.println("Lang: "+ l.getLanguage());
        }

    }
}
