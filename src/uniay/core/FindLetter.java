package uniay.core;

public class FindLetter {
    public static char findLetter(char letter, String field) {
        char l= 'z';
        char[] c = field.toCharArray();
        for (char value : c) {
            if (value == letter) {
                l = letter;
                return l;
            }
        }
        return l;
    }

}
