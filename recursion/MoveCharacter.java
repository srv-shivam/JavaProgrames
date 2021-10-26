package recursion;

public class MoveCharacter {

    private static void moveAllX(String str, int idx, int count, String newString) {

        if (idx == str.length()) {
            for (int i=0; i<count; ++i) {
                newString += 'x';
            }
            System.out.print(newString );
            return;
        }

        if (str.charAt(idx) == 'x') {
            ++count;
        } else {
            newString += str.charAt(idx);
        }
        moveAllX(str, idx + 1, count, newString);
    }

    public static void main(String[] args) {
        String str = "axbxxcxd";
        moveAllX(str, 0, 0, "");
    }

}
