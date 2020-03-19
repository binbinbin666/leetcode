package leetcode;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class 最长回文串19 {
    public int longestPalindrome(String s) {
        Map<Character, Integer> m = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            m.put(s.charAt(i), m.getOrDefault(s.charAt(i), 0) + 1);
        }
        int ans = 0;
        for (Character c : m.keySet()) {
            ans += m.get(c) / 2 * 2;
            if (m.get(c) % 2 == 1 && ans % 2 == 0) {
                ans++;
            }
        }
        return ans;
    }

    //方法二，此方法用的数组效率更高
    public int longestPalindrome2(String s) {
        int[] count = new int[128];
        for (char c : s.toCharArray())
            count[c]++;

        int ans = 0;
        for (int v : count) {
            ans += v / 2 * 2;
            if (v % 2 == 1 && ans % 2 == 0)
                ans++;
        }
        return ans;
    }

    @Test
    public void test() {
        System.out.println(longestPalindrome2("dd"));
    }
}
