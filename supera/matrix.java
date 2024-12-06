 package supera;

public class matrix {




    public static void main(String[] args) {
        int[][] array = {{1, 2, 3}, {4, 2, 5}, {5, 3, 7}};
        int[][] array1 = {{5, 6, 7}, {5, 7, 3}, {9, 5, 2}};
        int[][] array4 = new int[array.length][array.length];
        int[][] array5 = new int[array.length][array.length];


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array1[i][j] + " ");
            }
            System.out.println();
        }


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array4[i][j] = array[i][j] * array1[j][i];
                array5[i][j] = array4[i][j];
            }
            System.out.println();
            {
                i = 0;
                while (i < array.length) {
                    for (int j = 0; j < array.length; j++) {
                        System.out.print(array4[i][j] + " ");
                    }
                    System.out.println();
                    i++;
                }
            }
        }
    }
}


