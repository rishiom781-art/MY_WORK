import java.util.*;

public class Count {
    public static void main(String[] args) {
        String str = "naman";
        int freq[] = new int[26];

        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (freq[i] == 2) {
                System.out.println((char) ('a' + i));
            }
        }
    }
}
