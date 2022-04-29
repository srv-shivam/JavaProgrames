package Java8;

/**
 * Default Method | Virtual Extension Method | Defender Method
 * <p>
 * Without effecting implementation classes if you want to add a new method then we should go for ==> Default Method
 */

interface MyInterface2 {
    default void display() {
        System.out.println("Default Implementation");
    }
}

interface Left {
    default void m1() {
        System.out.println("Left Interface m1 method");
    }
}

interface Right {
    default void m1() {
        System.out.println("Right Interface m1 method");
    }
}

interface MyInterface3 {
    static void sayHello() {
        System.out.println("Hello!, from sayHello method");
    }
}

public class Test1 implements MyInterface2, Left, Right, MyInterface3 {

    @Override
    public void m1() {
        Left.super.m1(); //==> If wanted to use Left Interface implementation
//        Right.super.m1();  //==> If wanted to use Right Interface implementation
//        System.out.println("Our own m1 method implementation");  //==> If we want to give our own implementation
    }

    /**
     * Two interfaces have same method name and both interfaces are implemented by Test1 class
     * so to remove the unrelated method error we can override and give our own implementation
     * or by using super we can use the definition of m1 method of respective parent interface
     */
    public void display() {
        System.out.println("Overriding Implementation of Default Method");
    }

    public static void main(String[] args) {
        MyInterface2 myInterface2 = new Test1();
        myInterface2.display();

        Test1 obj1 = new Test1();
        obj1.m1();

        // Ways to access the static method in Interface
        MyInterface3.sayHello(); // Valid
        // sayHello(); ==> Invalid
        // Test1.sayHello(); ==> Invalid
        // Test1 t = new Text1();
        // t.sayHello() ==> Invalid
    }

}

