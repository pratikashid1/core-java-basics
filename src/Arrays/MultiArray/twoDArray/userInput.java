package Arrays.MultiArray.twoDArray;

import java.util.Scanner;

public class userInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking Number of rows and columns from user
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int col = sc.nextInt();

        int[][] arr = new int[rows][col];

        System.out.println("Enter elements of array: ");

        // Taking input from user for each element
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Element of array are: ");
        // printing array element
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }

        sc.close();
    }
}
