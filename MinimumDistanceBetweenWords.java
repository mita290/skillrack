// A string S is passed as the input. Two words W1 and W2 which are present in the string S are also passed as the input. The program must find the minimum distance D between W1 and W2 in S (in forward or reverse order) and print D as the output.

// Input Format:
// The first line will contain S.
// The second line will contain W1.
// The third line will contain W2.

// Output Format:
// The first line will contain D - the minimum distance between W1 and W2 in S.

// Boundary Conditions:
// Length of S is from 5 to 200.

// Example Input/Output 1:
// Input:
// the brown quick frog quick the
// the
// quick

// Output:
// 1

// Explanation:
// quick and the are adjacent as the last two words. Hence distance between them is 1.

// Example Input/Output 2:
// Input:
// the quick the brown quick brown the frog
// quick
// frog

// Output:
// 3

import java.util.*;

public class MinimumDistanceBetweenWords {
    static int distance(String[] words, String w1, String w2) {
 
        if (w1.equals(w2)) {
            return 0;
        }
 
       // get individual words in a list
        
        int n = words.length;
 
        // assume total length of the string as
        // minimum distance
        int min_dist = n + 1;
 
        // Find the first occurrence of any of the two 
        // numbers (w1 or w2) and store the index of
        // this occurrence in prev 
        int prev = 0, i = 0;
        for (i = 0; i < n; i++) {
 
            if (words[i].equals(w1) || words[i].equals(w2)) {
                prev = i;
                break;
            }
        }
        // Traverse after the first occurrence 
        while (i < n) {
            if (words[i].equals(w1) || words[i].equals(w2)) {
 
                // If the current element matches with
                // any of the two then check if current 
                // element and prev element are different 
                // Also check if this value is smaller than
                // minimum distance so far 
                if ((!words[prev].equals(words[i])) && (i - prev) < min_dist) {
                    min_dist = i - prev - 1;
                    prev = i;
                } else {
                    prev = i;
                }
 
            }
            i += 1;
 
        }
        return min_dist + 1;
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");
        String word1 = sc.nextLine();
        String word2 = sc.nextLine();
        System.out.println(distance(str, word1, word2));
        sc.close();
    }
}
