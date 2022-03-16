package tcsCodeVita;
import java.util.Scanner;

public class CircularTracks {

    static final double PI = 3.141592653589793;
    static void solution(int r1, int r2, int s1, int s2, int t, int d) {

        if ((r1+r2) == d) {
            int result = (int) (2 * PI * r1);
            result = result / t;
            System.out.println(result + " E&F");
            return;
        }

        int m1 = ((int) (2 * PI * r1)) / t;
        int m2 = ((int) (2 * PI * r2)) / t;

        int result = 0;

        while (r1 < 60 && r2 < 60) {

            if (m1 == m2) {

            }
        }

    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int r1 = sc.nextInt();
        int r2 = sc.nextInt();

        int s1 = sc.nextInt();
        int s2 = sc.nextInt();

        int t = sc.nextInt();
        int d = sc.nextInt();

        solution(r1, r2, s1, s2, t, d);
    }
}
