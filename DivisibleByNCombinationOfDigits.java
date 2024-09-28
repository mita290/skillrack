/*
    The program must accept an integer N and print the count of combinations C and the related values of X and Y where X/Y = N. 
    X and Y are four digit numbers and contain all digits from 1 to 8. The combinations must be sorted by X in descending order.

    Boundary Condition(s): 1 <= N < 10

    Input Format: The first line contains N.

    Output Format:

    The first line contains C.
    The next C lines contain the combinations of X and Y separated by space.  

    Example Input/Output 1:

    Input
    5
    Output: 
    2 
    6435 1287 
    8235 1647

    Explanation:
    6435/1287 is 5 and they contain all the digits from 1 to 8.
    8235/1647 is 5 and they contain all the digits from 1 to 8.

    Example Input/Output 2:

    Input:
    4
    Output:
    2
    5472 1368
    7452 1863
 */


import java.util.*;

public class DivisibleByNCombinationOfDigits {
    public static boolean unique(String s1, String s2) {
        Set<Character> ts = new TreeSet<>();
        for (int i = 0; i < s1.length(); i++) {
            if (!(s1.charAt(i) == '0' || s1.charAt(i) == '9' || s2.charAt(i) == '0' || s2.charAt(i) == '9')) {
                ts.add(s1.charAt(i));
                ts.add(s2.charAt(i));
            }
        }
        if (ts.size() == 8) {
            return true;
        }
        return false;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        ArrayList<String> al = new ArrayList<>();
        for (int i = 1000; i <= 9999; i++) {
            if (i % n == 0) {
                String s1 = "" + i;
                String s2 = "" + (i / n);
                if (s2.length() == 4) {
                    if (unique(s1, s2)) {
                        count++;
                        al.add(s1 + " " + s2);
                    }
                }
            }
        }
        System.out.println(count);
        for (String s : al) {
            System.out.println(s);
        }
        sc.close();
    }
}