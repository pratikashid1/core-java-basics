package String;

public class equalsDifference {
    public static void main(String[] args) {

        String str1 = "Hello";
        String str2 = "Hello";

        String str3 = new String("Hello");

        // Compare references (==)
        System.out.println(str1 == str2);
        System.out.println(str1 == str3);

        // Compare values (.equals)
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
    }
}
