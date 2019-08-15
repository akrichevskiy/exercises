package exercises.leetcode;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0 || strs[0].isEmpty()) return "";
        else if (strs.length == 1) return strs[0];
        else {
            int shortestString = Integer.MAX_VALUE;
            for (String s : strs) {
                if (s.length() < shortestString) {
                    shortestString = s.length();
                }
            }
            String prefix = "";
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < shortestString; i++) {
                sb.append(strs[0].charAt(i));

                for (String s : strs) {
                    if (!s.startsWith(sb.toString())) {
                        return prefix;
                    }

                }
                prefix = sb.toString();
            }
            return prefix;
        }

    }
}
