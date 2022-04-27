package Java8;

import java.util.*;

/**
 * Functional Interface -> Interface which has only one abstract method
 */

@FunctionalInterface
interface MyInterface {
    int sum(int a, int b);
}

class Employee {
    String name;
    int eno;

    Employee(String name, int eno) {
        this.name = name;
        this.eno = eno;
    }

    public String toString() {
        return eno + ":" + name;
    }
}

public class Test {

    public static void main(String[] args) {

        ArrayList<Employee> e = new ArrayList<>();
        e.add(new Employee("Shivam", 101));
        e.add(new Employee("Shubham", 232));
        e.add(new Employee("Amit", 832));
        e.add(new Employee("Pooja", 111));
        e.add(new Employee("Vishal", 923));

        System.out.println(e);

        //TODO:: Sorting Employees on the basis of there Employee ID
//        Collections.sort(e, (e1, e2) -> e1.eno - e2.eno);
        e.sort(Comparator.comparingInt(emp -> emp.eno));
        System.out.println(e);

        //TODO:: Sorting Employees on the basis of there Name
//        e.sort((e1, e2) -> e1.name.compareTo(e2.name));
        e.sort(Comparator.comparing(e2 -> e2.name));
        System.out.println(e);

        /************************************************************************************************************/
        MyInterface myInterface = (a, b) -> a + b;

        System.out.printf("Sum of 4 and 8: " + myInterface.sum(4, 8));
    }
}
