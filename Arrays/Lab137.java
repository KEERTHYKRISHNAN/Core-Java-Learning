package Arrays;

public class Lab137 {
    public static void main(String[] args) {
        //Print the diagonal elements for an array

        int [][] array_2d = new int [3][3];
        array_2d [0][0] = 56;
        array_2d [0][1] = 45;
        array_2d [0][2] = 78;
        array_2d [1][0] = 79;
        array_2d [1][1] = 47;
        array_2d [1][2] = 72;
        array_2d [2][0] = 12;
        array_2d [2][1] = 32;
        array_2d [2][2] = 80;

        for (int i = 0; i < array_2d.length; i++) {
            System.out.println(array_2d[i][i]);

        }
    }
}
