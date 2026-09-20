package String.StringClass;

public class constructor {
    static void main() {

        // Creating constructor using new keyword
        String str1 = new String("Hello, world!");
        System.out.println("String using new: " + str1);

        // Creating string from array
        char[] charArray = {'J', 'A', 'V', 'A'};
        String str2 = new String(charArray);
        System.out.println("String form array: " + str2);

        // Creating string from byte array
        byte[] bytearray = {72, 101, 108, 108, 111};
        String str3 = new String(bytearray);
        System.out.println("String from byte array: " + str3);
    }
}
