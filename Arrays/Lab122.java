package Arrays;

public class Lab122 {
    public static void main(String[] args) {
        //2D array

        int arr [][] = new int[2][3];

        arr [0][0]= 45;
        arr [0][1] = 36;
        arr [0][2] = 80;

        arr [1][0]= 40;
        arr [1][1] = 32;
        arr [1][2] = 70;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr [i][j] + "\t");

            }
            System.out.println(" ");
        }
    }
}
