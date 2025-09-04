import java.util.*;

class Solutionup {
    public boolean isAnagram(String s, String t) {

        return isAnagramup(s, t);
    }

    public boolean isAnagramup(String s, String t) {
        StringBuffer ch = new StringBuffer(t);
        if (s.length() != t.length())
            return false;
        boolean pass = false;
        for (int i = 0; i < s.length(); i++) {
            pass = false;
            for (int j = 0; j < ch.length(); j++) {
                if (s.charAt(i) == ch.charAt(j)) {
                    pass = true;
                    ch.deleteCharAt(j);
                    break;
                }
            }
            if (pass == false)
                return pass;
        }
        return pass;
    }
}