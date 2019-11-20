package exercises.ctci.ch1;

public class StringCompression {
    public String compress(String in) {
        if(in.length() < 3) {
            return in;
        }
        int len;
        StringBuffer compressedString = new StringBuffer();

        len = 0;
        for (int i = 0; i < in.length(); i++){
            len++;
            if(i + 1 >= in.length() || in.charAt(i) != in.charAt(i+1) ) {
                compressedString.append(in.charAt(i)).append(len);
                len=0;
            }
        }
        return compressedString.toString().length() >= in.length() ? in : compressedString.toString();
    }

}
