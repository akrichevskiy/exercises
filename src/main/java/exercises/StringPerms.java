package exercises;


public class StringPerms {
    public void perms(String s) {
        perms("", s);
    }

    private void perms(String s, String rem) {
        if(rem.length() == 0) {
            System.out.println(s);
        } else {
            String rest = rem.substring(1);
            for(int i = 0; i < s.length() +1; i++) {
                perms(s.substring(0,i) + rem.charAt(0) + s.substring(i), rest);
            }
        }
    }
}
