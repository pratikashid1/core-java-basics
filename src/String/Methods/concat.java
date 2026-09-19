package String.Methods;

public class concat {
    static void main() {
        String str = "Hello,";
        String str1 = " World!";

        // append another string
        System.out.println(str.concat(str1));
        System.out.println(str.concat(" world!"));
    }
}
