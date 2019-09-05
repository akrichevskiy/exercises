package exercises.leetcode;

//LC 3. Longest Substring Without Repeating Characters
public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int max = 1;
        if (s== null || s.isEmpty()) {
            return 0;
        }
        int i,j;

        for (i = 0; i < s.length() ; i++) {
            int cnt = 1;
            for(j = i + 1; j < s.length() ; j++) {
                if (!s.substring(i, j).contains(s.substring(j,j + 1))) {
                    cnt++;
                    max = Math.max(max, cnt);
                } else {
                    break;
                }
            }
        }

        return max;
    }
}
