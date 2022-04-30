package Java8;

/*
 * package:- java.util.function;
 * <p>
 * <p>
 * Predefined Functional Interface:
 * 1) Predicate -> test method
 * 2) Function
 * 3) Consumer
 * 4) Supplier
 * ....
 * <p>
 * Two arguments Functional Interfaces:
 * 1) BiPredicate
 * 2) BiFunction
 * 3) BiConsumer
 * ....
 * <p>
 * Primitive Functional Interfaces:
 * 1) IntPredicate
 * 2) IntFunction
 * 3) IntConsumer
 * ....
 */

import java.util.Arrays;
import java.util.function.*;

public class Test2 {

    public static void main(String[] args) {

        // Use of Predicate Function Interface
        Predicate<Integer> p = i -> i % 2 == 0;
        System.out.println(p.test(10));
        System.out.println(p.test(15));

        String[] str = {"Nag", "Shivam", "RatanTata", "Modi", "Bhagwaan Krishna"};
        Arrays.stream(str)
                .filter(s -> s.length() > 5)
                .forEach(System.out::println);

    }


}
