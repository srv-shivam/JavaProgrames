package CodeChef;

import java.util.Scanner;
public class covidProblemCode {

	public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc = new Scanner(System.in);
        
        String str;
        sc.useDelimiter("\\t");
        while(true) {
            str = sc.next();
            break;
        }
        
        int count = 0, countC = 0, countO = 0, countV = 0, countI = 0, countD = 0;

        for(int i=0; i<str.length(); i++) {
            
            if(str.charAt(i) == 'c') {
                countC++;
            } else if(str.charAt(i) == 'o') {
                countO++;
            } else if(str.charAt(i) == 'v') {
                countV++;
            } else if(str.charAt(i) == 'i') {
                countI++;
            } else if(str.charAt(i) == 'd') {
                countD++;
            }
        }
        
        
        while(countC != 0 && countO != 0 && countV != 0 && countI != 0 && countD != 0) {
            count++;
            countC--; countO--; countV--; countI--; countD--;
        }
        
        System.out.println(count);
        
        }

}
