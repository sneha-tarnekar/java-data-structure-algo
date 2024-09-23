package Problems;

public class IntegerCaching {

    //    The Integer class keeps a cache of Integer instances in the range of -128 to 127, and all autoboxing,
    //    literals and uses of Integer.valueOf() will return instances from that cache for the range it covers.
    public static void main(String[] args) {
        Integer a = 128;
        Integer b = 128;
        System.out.println(a == b); // false

        Integer x = 1;
        Integer y = 1;
        System.out.println(x == y); // true

    }

}
