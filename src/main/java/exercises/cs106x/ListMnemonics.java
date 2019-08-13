package exercises.cs106x;

import java.util.*;

public class ListMnemonics {
    // generate all possible letter combinations for given telephone number
    private Map<Character, String> map = new HashMap<>();

    public List<String> listMnemonics(String number) {
        map.put('2', "ABC");
        map.put('3', "DEF");
        map.put('4', "GHI");
        map.put('5', "JKL");
        map.put('6', "MNO");
        map.put('7', "PQRS");
        map.put('8', "TUV");
        map.put('9', "WXYZ");

        return go(number);
    }

    private List<String> go(String rest) {
        if (rest.isEmpty()) {
            return Collections.singletonList("");
        } else {
            List<String> result = new LinkedList<>();
            char c = rest.charAt(0);
            List<String> other = go(rest.substring(1));
            if (c == '1' || c == '9') {
                for (String s : other) {
                    result.add(c + s);
                }
            } else {
                String letters = map.get(c);
                if (other.isEmpty()) {
                    for (int j = 0; j < letters.length(); j++) {
                        result.add(letters.substring(j, j+1));
                    }
                } else {
                    for (String s : other) {
                        for (int j = 0; j < letters.length(); j++) {
                            result.add(letters.charAt(j) + s);
                        }
                    }
                }
            }
            return result;
        }
    }
}
