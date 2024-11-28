package Variblr_Tipe.P1;

public class types {
int a=1;
public int b=10;
private int c=12;
protected int d=12;
public types(){
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.println(d);
}


    public static void main(String[] args) {

    types t=new types();
        System.out.println(t.a);
        System.out.println(t.b);
        System.out.println(t.c);
        System.out.println(t.d);

    }
}
