package exercises.leetcode;

import java.sql.SQLOutput;
import java.util.*;

public class FindAllAnagramsInAString {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new LinkedList();
        Map<Character, Integer> prefix = new HashMap<>();
        for (char c : p.toCharArray()) {
            int count = prefix.getOrDefault(c, 0);
            prefix.put(c, count + 1);
        }

        Map<Character, Integer> anagram = new HashMap();
        for (int i = 0; i <= s.length() - p.length(); i++) {
            String window = s.substring(i, i + p.length());
            if (i == 0) {
                for (char c : window.toCharArray()) {
                    int count = anagram.getOrDefault(c, 0);
                    anagram.put(c, count + 1);
                }
            } else {
                char charToRemove = s.charAt(i - 1);
                char charToAdd = s.charAt(i + p.length() - 1);
                anagram.put(charToRemove, anagram.getOrDefault(charToRemove, 0) - 1);
                if(anagram.get(charToRemove) == 0) {
                    anagram.remove(charToRemove);
                }
                anagram.put(charToAdd, anagram.getOrDefault(charToAdd, 0) + 1);
            }

            if (prefix.equals(anagram)) {
                ans.add(i);
            }
        }
        return ans;
    }
}
