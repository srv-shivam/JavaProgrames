package recursion;

public class PlaceTiles {

    private static int countPlacements(int n, int m) {

        if (n == m) {
            return 2;
        }
        if (n < m) {
            return 1;
        }

        // vertically placement
        int verPlacements = countPlacements(n - m, m);

        // horizontally placement
        int horPlacements = countPlacements(n - 1, m);

        return verPlacements + horPlacements;
    }

    public static void main(String[] args) {
        int n = 4, m = 2;
        System.out.println(countPlacements(n, m));
    }
}
