package Internatinal_local;

import java.util.Locale;
import java.util.ResourceBundle;

public class lang_chang {
    public static void main(String[] args) {

int l=2;
        Locale lo;
        if (l==1){
            System.out.println("English");
            lo=new Locale("en","US");

        }

        else {
             System.out.println("Russia");
            lo=new Locale("ru","RU");
        }
        ResourceBundle ban=ResourceBundle.getBundle("Resource",lo);
        System.out.println(ban.getString("great"));
        System.out.println();


    }
}
