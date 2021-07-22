package classK19SD;

import java.util.Scanner;
import java.lang.*;
import java.lang.Math;

public class Codechef{
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) throws java.lang.Exception{
    	int t = sc.nextInt();
    	
	    while(t > 0){
	    	
	    String[] s = new String[3];
		char[][] board = new char[3][3];
		String temp;
		
		for(int i = 0; i < 3; i++) {
		    s[i] = sc.next();
		    temp = s[i];
		    
		    for(int j = 0; j < 3; j++){
		        board[i][j] = temp.charAt(j);
		    }
		}

		boolean xWin = false, oWin = false;
		xWin = checkWiningCondition('X', board);
		oWin = checkWiningCondition('O', board);
	
		long x, o, empty;
		x = o = empty = 0;
		
		for(int i = 0; i < 3; i++) {
		    for(int j = 0; j < 3; j++){
		        if(board[i][j] == 'X'){
			    x++;
			}else if(board[i][j] == 'O'){
			    o++;
			}else{
			    empty++;
			}
		    }
		}

		if((xWin == true & oWin ==  false) & (x > 0)) System.out.println(1);
		else if((xWin == false & oWin == true) & (x == o)) System.out.println(1);
		else if((xWin == false & oWin == false) & (empty == 9 || empty > 0)) System.out.println(2);
		else System.out.println(3);  
		
	        t--;
	    }
    }

    static boolean checkWiningCondition(char symbol, char[][] board){
	if(board[0][0] == symbol & board[1][0] == symbol & board[2][0] == symbol) return true;
	else if(board[0][1] == symbol & board[1][1] == symbol & board[2][2] == symbol) return true;
	else if(board[0][2] == symbol & board[1][2] == symbol & board[2][2] == symbol) return true;
	else if(board[0][0] == symbol & board[0][1] == symbol & board[0][2] == symbol) return true;
	else if(board[1][0] == symbol & board[1][1] == symbol & board[1][2] == symbol) return true;
	else if(board[2][0] == symbol & board[2][1] == symbol & board[2][2] == symbol) return true;
	else if(board[0][0] == symbol & board[1][1] == symbol & board[2][2] == symbol) return true;
	else if(board[2][0] == symbol & board[1][1] == symbol & board[0][2] == symbol) return true;
	else return false;
    }
}