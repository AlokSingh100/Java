package encapsulation;

public class sw2aqp {
    public static void main(String[] args) {
        int[] asp={12,13,14,15};
        int a=asp[0];
        asp[0]=asp[asp.length-1];
        asp[asp.length-1]=a;
        for (int i = 0; i < asp.length; i++) {
            System.out.print(asp[i]+" ");
        }
    }
}
