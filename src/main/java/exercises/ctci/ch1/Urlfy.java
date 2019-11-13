package exercises.ctci.ch1;

public class Urlfy {
    public String replaceSpaces(String s, int trueLength) {
        int spaces = symbolsCount(s, ' ', trueLength);
        int newIndex = trueLength - 1 + spaces * 2;
        char [] chars = s.toCharArray();

        for(int oldIndex = trueLength - 1; oldIndex >= 0; oldIndex--) {
            if(s.charAt(oldIndex) == ' ') { //insert %20
                chars[newIndex] = '0';
                chars[newIndex - 1] = '2';
                chars[newIndex - 2] = '%';
                newIndex -= 3;
            } else {
                chars[newIndex] = chars[oldIndex];
                newIndex--;
            }
        }
        return new String(chars);
    }

    private int symbolsCount(String s, char target, int trueLength ) {
        int count = 0;
        for(int i = 0; i < trueLength; i++) {
            if(s.charAt(i) == target) {
                count++;
            }
        }
        return count;
    }

}
