package lesonns4.dataTypes.tasx_strings_voids;

public class Str {
    public static int findSymbolOccurance(String s, char c) {
        int numberIdenticalCharacter = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) numberIdenticalCharacter++;

        }
        return numberIdenticalCharacter;
    }

    public static int findWordPosition(String source, String target) {
        return source.indexOf(target);
    }

    public static String stringReverse(String string) {
        return new StringBuilder(string).reverse().toString();
    }

    public static boolean isPalindrome(String string) {
        string = string.replaceAll("\\W", " ");
        StringBuilder stringBuilder = new StringBuilder(string);
        stringBuilder.reverse();
        String invertedString = stringBuilder.toString();
        return string.equalsIgnoreCase(invertedString);
    }
}
