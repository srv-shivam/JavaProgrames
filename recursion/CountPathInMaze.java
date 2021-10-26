package recursion;

/**
 * Count the number of paths in maze (size = (n, m)) when we are at (0, 0) and we have to reach ending cell(n-1, m-1)
 * In this we can only take downwards move or rightwards move to reach end cell




 * Lets take for maze size (3, 3)
 *    --- --- ---
 *   | * |   |   |
 *   --- --- ---
 *  |  |   |   |
 *  --- --- ---
 * |  |   | ? |
 * total 6 moves to reach end cell
 */

public class CountPathInMaze {

    private static int countPaths(int i, int j, int n, int m) {

        if (i == n || j == m) {
            return 0;
        }

        //when reached end cell
        if (i == n-1 || j == m-1) {
            return 1;
        }

        //moving downwards
        int downPaths = countPaths(i + 1, j, n, m);

        //moving rightwards
        int rightPaths = countPaths(i, j + 1, n, m);

        return downPaths + rightPaths;
    }

    public static void main(String[] args) {
        int totalPaths = countPaths(0, 0, 3, 3);
        System.out.print(totalPaths);
    }
}
