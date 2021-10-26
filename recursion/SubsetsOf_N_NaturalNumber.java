package recursion;

public class SubsetsOf_N_NaturalNumber {

    // Ways1 to print all subsets of N natural numbers
    private static void printSubsets(int start, int n, String subsets) {

        if (start > n) {
            System.out.println(subsets);
            return;
        }

        //to be
        printSubsets(start + 1, n, subsets + start);

        //not to be
        printSubsets(start + 1, n, subsets);
    }

    //Ways2 to print all subsets of N natural numbers
    private static void subsetsComb(int n, String subsets) {

        if (n == 0) {
            System.out.println(subsets);
            return;
        }

        subsetsComb(n - 1, subsets + n);

        subsetsComb(n - 1, subsets);
    }

    public static void main(String[] args) {
//        printSubsets(1, 3, "");
        subsetsComb(3, "");
    }
}
