package Arrays.MultiArray.threeDArray;

public class threeD {
    public static void main(String[] args) {

        // Array created and initialized
        int[][][] arr = {{{10, 20}, {30, 40}}, {{50, 60}, {70, 80}}};

        // defining the n, m, o multi dimensional array
        int n = arr.length;
        int m = arr[0].length;
        int o = arr[0][0].length;

        // printing array
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                for(int k = 0; k < o; k++) {
                    System.out.println("arr [" + i + "][" + j + "][" + k + "] = " + arr[i][j][k]);
                }
            }
        }
    }
}
