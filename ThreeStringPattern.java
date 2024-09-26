/* Given N string values, the program must print 3 string values as the output as described in the Example Input/Output section.

Input format:
The first line will contain N denoting the number of string values.
Next N lines will contain the N string values.

Output format:
Three lines containing string values as described in the Example Input/Output section.

Example Input/Output 1:

Input:
3
JOHN
JOHNY
JANARDHAN

Output:
JJOJAN
OHHARD
NNYHAN

Example Input/Output 2:

Input:
4
JOHN
JOHNY
JANARDHAN
MIKESPENCER

Output:
JJOJANMIKE
OHHARDSPE
NNYHANNCER

Example Input/Output 3:

Input:
6
aa
bbbb
cccccc
ddddzdddd
eeeeefffff
abcdefabcdef

Output:
abbcccddddeeeeeabcdef
z
abbcccddddfffffabcdef
 */

import java.util.*;

public class ThreeStringPattern {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        String str[] = new String[n];

        for (int i = 0; i < n; i++) {
            str[i] = sc.nextLine();
        }

        String firstPart = "";  // Stores concatenated first parts
        String middlePart = "";  // Stores concatenated middle parts
        String lastPart = "";    // Stores concatenated last parts

        for (int i = 0; i < n; i++) {
            int len = str[i].length();
            int currentCounter = i + 1; // Start from 1 for the first string
            int endIndexForMiddle = len - currentCounter;

            // Get parts based on calculated indices
            String firstSubstring = str[i].substring(0, currentCounter);
            String secondSubstring = str[i].substring(currentCounter, endIndexForMiddle);
            String thirdSubstring = str[i].substring(endIndexForMiddle, len);
            
            // Concatenate parts to respective outputs
            firstPart += firstSubstring;
            middlePart += secondSubstring;
            lastPart += thirdSubstring;
        }

        System.out.println(firstPart);
        System.out.println(middlePart);
        System.out.println(lastPart);

        sc.close();
    }
}