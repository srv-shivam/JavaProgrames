package Java8;

/**
 * Default Method | Virtual Extension Method | Defender Method
 *
 * Without effecting implementation classes if you want to add a new method then we should go for ==> Default Method
 */

interface MyInterface2 {
    default void display() {
        System.out.println("Default Implementation");
    }
}

public class Test1 implements MyInterface2 {

    public void display() {
        System.out.println("Overriding Implementation of Default Method");
    }

    public static void main(String[] args) {
        MyInterface2 myInterface2 = new Test1();
        myInterface2.display();
    }

}
