package exercises.ctci.ch1;

public class StringCompression {
    public String compress(String in) {
        if(in.length() < 3) {
            return in;
        }
        int start,end,len;
        StringBuffer stringBuffer = new StringBuffer();

        start = 0;
        end = 1;
        len = 1;
        while(end < in.length()) {
            if(in.charAt(start) != in.charAt(end)) {
                stringBuffer.append(in.charAt(start)).append(len);
                len=1;
                start = end;
            } else {
                len++;
            }
            end++;
        }
        stringBuffer.append(in.charAt(end-1)).append(len);
        if(stringBuffer.toString().length() >= in.length()) {
            return in;
        } else {
            return stringBuffer.toString();
        }
    }

}
