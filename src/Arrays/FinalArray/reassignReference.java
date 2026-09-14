package Arrays.FinalArray;

public class reassignReference {

    int p = 20;

    public static void main(String[] args) {

        final reassignReference rr = new reassignReference();

        reassignReference rr1 = new reassignReference();

        // compilation error
        // rr = rr1;

        System.out.println(rr.p);
    }

}
