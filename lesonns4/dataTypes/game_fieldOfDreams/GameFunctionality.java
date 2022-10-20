package lesonns4.dataTypes.game_fieldOfDreams;

public class GameFunctionality {
    private static final String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
            "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive",
            "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato" };

    String prompt = "###############";

    private final String hiddenWord;

    public GameFunctionality() {
        hiddenWord = words[(int) (Math.random() * words.length)];
    }

    public boolean compareWords(String wordVariant) {
        return wordVariant.equals(hiddenWord);
    }

    public String compareCharacters(String wordVariant) {
        char[] chars = prompt.toCharArray();

        for (int i = 0; i < hiddenWord.length() && i < wordVariant.length(); i++) {
            if (hiddenWord.charAt(i) == wordVariant.charAt(i)) {
                chars[i] = hiddenWord.charAt(i);
            }
        }
        prompt = String.valueOf(chars);
        return prompt;
    }

}
