package exercises.leetcode;

public class AddBinary {
    public String addBinary(String a, String b) {
        if (a.isEmpty() && b.isEmpty()) {
            return "";
        } else {
            StringBuilder result = new StringBuilder();
            int i = 0;
            int transfer = 0;
            int totalLen = Math.max(a.length(), b.length());
            while (i < totalLen) {
                int c1;
                if (i < a.length()) {
                    c1 = Character.getNumericValue(a.charAt(a.length() - i - 1));
                } else {
                    c1 = 0;
                }

                int c2;
                if (i < b.length()) {
                    c2 = Character.getNumericValue(b.charAt(b.length() - i - 1));
                } else {
                    c2 = 0;
                }

                int res = c1 + c2 + transfer;
                if (res == 3) {
                    transfer = 1;
                    result.append('1');
                } else if (res == 2) {
                    transfer = 1;
                    result.append('0');

                } else if (res == 1) {
                    transfer = 0;
                    result.append('1');
                } else {
                    transfer = 0;
                    result.append('0');
                }
                i++;
            }
            if (transfer == 1) {
                result.append('1');
            }
            return result.reverse().toString();
        }

    }
}
