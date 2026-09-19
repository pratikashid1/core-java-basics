package String.Methods;

public class indexof {
    static void main() {
        String str = "Hello, World!";

        // print starting index
        System.out.println(str.indexOf("World"));

        // to find exact letter index
        System.out.println(str.indexOf("l"));

        // to find index with from where to start
        System.out.println(str.indexOf("W", 5));

        // last string
        System.out.println(str.lastIndexOf("e"));
    }
}
