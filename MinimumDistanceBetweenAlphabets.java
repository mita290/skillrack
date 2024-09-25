import java.util.*;

public class MinimumDistanceBetweenAlphabets {
    public static int find(String str, char a, char b) {
        int ch1 = str.lastIndexOf(a);
        int ch2 = str.lastIndexOf(b);
        if (ch1 == ch2) {
            for (int i = ch1 - 1; i >= 0; i--) {
                if (a == str.charAt(i)) {
                    return Math.abs(ch1 - i) - 1;
                }
            }
        }
        int aind = -1, bind = -1,min = 101;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == a) {
                aind = i;
                if (bind != -1) {
                    int dis = Math.abs(i - bind);
                    min = Math.min(dis, min);
                }
            }
            if (str.charAt(i) == b) {
                bind = i;
                if (aind != -1) {
                    int dis = Math.abs(i - aind);
                    min = Math.min(dis, min);
                }
            }
        }
        return min - 1;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch1 = sc.next().charAt(0);
        char ch2 = sc.next().charAt(0);
        System.out.print(find(str, ch1, ch2));
        sc.close();
    }
}
