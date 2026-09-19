package String.Methods;

public class compareTo {
    static void main() {
        String str = "Hello, World!";

        // If you get difference characters then print difference in Unicode
        System.out.println(str.compareTo("Hello, Java!"));

        // ignore case
        System.out.print(str.compareToIgnoreCase("Hello, java!"));
    }
}
