import java.util.Arrays;
import java.util.Hashtable;

public class C1E1 {

    public static boolean check_if_unique(String s) {

        Hashtable<Character, Character> charTable = new Hashtable<Character, Character>();
        for (char c : s.toCharArray()) {
            if(charTable.containsKey(c)) {
                return false;
            }
            charTable.put(c, c);
        }
        return true;
    }

    public static boolean check_if_unique_in_place(String s) {

        //sort
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        String sorted = new String(chars);
        for (int i = 0; i < sorted.length() -1; ++i) {
            if(sorted.charAt(i) == sorted.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main (String[] args) {
        System.out.println(check_if_unique("abcdergg"));
        System.out.println(check_if_unique_in_place("abcdergg"));
    }
}
