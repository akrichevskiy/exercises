package exercises.ctci.ch1;

import java.util.HashMap;
import java.util.Map;

public class PalindromePermutations {
    public boolean isPalindrome(String s) {
        String lowerCase = s.toLowerCase();
        Map<Character, Integer> map = new java.util.HashMap<Character, Integer>();
        for(int i = 0; i < s.length(); i++) {
            char c = lowerCase.charAt(i);
            if( 'a' <= c && c <= 'z') {
                //char found
                if(map.containsKey(c)) {
                    int count = map.get(c);
                    map.put(c, ++count);
                } else {
                    map.put(c, 1);
                }
            }
        }

        int oddCounter = 0;
        for(HashMap.Entry<Character, Integer> pair : map.entrySet()) {
            if(pair.getValue() % 2 != 0) {
                oddCounter++;
            }
        }
        return oddCounter <= 1;
    }

}
