package encapsulation;

public class javaswitch {
    public static void main(String[] args) {
        int[] num={12,23,12,34,12,34,12,12,15};
       int[] aap=new int[9];
       int a=0;
       int num1 = num.length;
        for (int i = num1-1; i >=0 ; i--) {

            aap[a]=num[i];
            a++;
        }
        for (int i = 0; i < 9; i++) {
            System.out.print(aap[i]+" ");
        }

    }
}
