/*
    A string S is passed as the input. The program must generate the set (all unique) of all the substrings of S in the reverse order and then sort that set lexicographically. Now the program must print the rank of the reverse of the string S in the new set formed.

    Note:
    – String S contains only lowercase English letters.
    – Time complexity matters, optimize your algorithm

    Boundary Condition(s):
    1 <= Length of S <= 100

    Input Format:
    The first line contains S.

    Output Format:
    The first line contains the integer value denoting the rank.

    Example Input/Output 1:
    Input:
    eren

    Output:
    7

    Explanation:
    Reverse of eren is nere
    Lexicograhically sorted set of unique substrings of nere is
    e
    er
    ere
    n
    ne
    ner
    nere
    r
    re

    In this nere appears in the 7th position.
 */


import java.util.*;

public class ReverseStringRankAmongSubstrings {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);    
        StringBuilder sb1 = new StringBuilder(sc.nextLine());
        StringBuilder sb2 = sb1.reverse();
        
        Set<String> ts = new TreeSet<>();

        for (int i = 0; i < sb2.length(); i++) {
            for (int j = i + 1; j <= sb2.length(); j++) {
                ts.add(sb2.substring(i, j));
            }
        }
        ArrayList<String> al = new ArrayList<>(ts);
        System.out.print(al.indexOf(sb2.toString()) + 1);
        sc.close();
    }
}
