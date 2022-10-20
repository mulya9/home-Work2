package lesonns4.dataTypes.game_fieldOfDreams;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GameFunctionality gameFunctionality = new GameFunctionality();
        Scanner scanner = new Scanner(System.in);

        System.out.println("                          Guess the word");

        System.out.println("                           Enter a word ");

        while (true) {
            String wordVariant = scanner.next();
            if (gameFunctionality.compareWords(wordVariant)) {
                System.out.println("Congratulation you <<< WON >>>");
                return;
            }
            System.out.println(" <:(  Wrong  <:( ");
            System.out.println(" Guess symbols " + gameFunctionality.compareCharacters(wordVariant));
        }
    }

}
