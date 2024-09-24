// An odd length string S of length L is passed as the input. The program must print the string S as two diagonals as shown in the example Input/Output below.

// Input Format:
// The first line will contain S.

// Output Format:
// L lines will contain the pattern as shown in the example Input/Output below.

// Boundary Conditions:
// Length of S is from 3 to 51.

// Example Input/Output 1:
// Input:
// cry

// Output:
// c y
//  r
// c y

// Example Input/Output 2:
// Input:
// tiger

// Output:
// t   r
//  i e
//   g
//  i e
// t   r

import java.util.*;

public class OddLengthStringDiagonalPattern {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int len = str.length(); 
        for (int i = 0; i < len; i++) {
            int temp = len - i - 1;
            for (int j = 0; j < len; j++) {
                if (i == j) {
                    System.out.print(str.charAt(j));
                } else if (j == temp) {
                    System.out.print(str.charAt(j));
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}