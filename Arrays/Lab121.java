package Arrays;

public class Lab121 {
    public static void main(String[] args) {
        //2D array
        //print the result in matrix format

        int [][] arr = new int[3][3];


        //Rows --> 0to2
        arr [0][0]= 10;
        arr [0][1]= 20;
        arr [0][2]= 15;

        arr [1][0]= 11;
        arr [1][1]= 22;
        arr [1][2]= 13;

        arr [2][0]= 13;
        arr [2][1]= 23;
        arr [2][2]= 14;



        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length ; j++) {
                System.out.print(arr[i][j] + "\t");

            }
            System.out.println("");
        }
    }
}
