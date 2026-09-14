package Arrays.FinalArray;

public class modifyElements {
    public static void main(String[] args) {
        final int arr[] = {1, 2, 3};

        // Modify element od final array is allowed
        arr[2] = 6;

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
