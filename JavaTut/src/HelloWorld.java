import java.util.*;
import java.util.stream.IntStream;

public class HelloWorld {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[]  args) {

        int smInt = 10;
        long smLong = smInt;

        double cDbl = 1.234;
        int cInt = (int) cDbl;
        System.out.println(cInt);

        long bigLong = 2147486470L;
        int bInt = (int) bigLong;
        System.out.println(bInt);

        String favNum = Double.toString(1.618);
        int strInt = Integer.parseInt("10");
        System.out.println(strInt);

    }
}
