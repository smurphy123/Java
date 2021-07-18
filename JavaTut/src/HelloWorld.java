import java.util.*;
import java.util.stream.IntStream;

public class HelloWorld {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[]  args) {

        StringBuilder sb = new StringBuilder("I'm a string builder");
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        sb.append(" Yeah");
        System.out.println(sb.insert(6, "Big "));
        
    }
}
