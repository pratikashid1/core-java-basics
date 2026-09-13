package Arrays.ArrayClassMethods;

import java.util.Arrays;

public class binarySearch {
    public static void main(String[] args) {
        int arr[] = {10, 20, 2, 30, 22, 40, 50};

        Arrays.sort(arr);

        int key =22;

        System.out.println(key + " found at index: " + Arrays.binarySearch(arr, key));
    }
}
