package String.Methods;

public class charArray {
    static void main() {
        String str = "Hello, World!";

        // converts String into array
        char[] chars = str.toCharArray();

        for(char c : chars) {
            System.out.print(c + " ");
        }
    }
}
