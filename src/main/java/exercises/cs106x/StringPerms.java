package exercises.cs106x;


import java.util.HashSet;
import java.util.Set;

public class StringPerms {
    public void perms(String s) {
        perms("", s);
    }

    private void perms(String s, String rem) {
        if (rem.length() == 0) {
            System.out.println(s);
        } else {
            String rest = rem.substring(1);
            for (int i = 0; i < s.length() + 1; i++) {
                perms(s.substring(0, i) + rem.charAt(0) + s.substring(i), rest);
            }
        }
    }

    public Set<String> perms2(String s) {
        Set<String> result = new HashSet<>();
        if (s.equals("")) {
            result.add("");
            return result;
        } else {
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                String rem = s.substring(0, i) + s.substring(i + 1);
                for (String s1 : perms2(rem)) {
                    result.add(c + s1);
                }
            }
            return result;
        }
    }
}
