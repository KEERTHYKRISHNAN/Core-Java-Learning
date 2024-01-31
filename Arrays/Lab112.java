package Arrays;

public class Lab112 {
    public static void main(String[] args) {
        //find are they equal

        int [] arr1 = {90,50,80,60};
        int [] arr2 = {90,70,80,60};
        System.out.println(arr1 == arr2);

       // ans is false becoz the index value is equal
        // but references are different and stored in different location

        int [] arr3 = arr1;
        System.out.println(arr3 == arr1);
        // ans will be true, since the arr1 is assigned to arr3
        //also stroed in same location

        System.out.println(arr1.equals(arr2));
        System.out.println(arr1.equals(arr3));

        //if its string, compare the values
        //if its arr, comapre the references

        arr3 [0]= 70;
        System.out.println(arr3 [0]);
        System.out.println(arr1 [0]);
        System.out.println(arr1 [1]);
        System.out.println(arr1 [2]);

    }
}
