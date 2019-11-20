package exercises.ctci.ch1;

import java.util.ArrayList;
import java.util.List;

public class OneAway {
    public static boolean isOneEditDistance(String s1, String s2) {
        List<Character> l1 = new ArrayList<Character>();
        List<Character> l2 = new ArrayList<Character>();
        int i,j;
        if (s1 == null || s2 == null) {
            return  false;
        }
        for(char c : s1.toCharArray()) {
            l1.add(c);
        }
        for(char c : s2.toCharArray()) {
            l2.add(c);
        }

        for (char c: s1.toCharArray()) {
            if(l2.contains(c)) {
                l2.remove(l2.indexOf(c));
                l1.remove(l1.indexOf(c));
            }
        }
        int rest = l1.size() + l2.size();
        return rest <= 2;

    }

}
