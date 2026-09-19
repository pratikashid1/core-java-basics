package String.Methods;

public class equals {
    static void main() {
        String str = "Hello, World";

        // considering letter case
        System.out.println(str.equals("Hello, World"));

        // without considering letter case
        System.out.println(str.equalsIgnoreCase("hello, world"));
    }
}
