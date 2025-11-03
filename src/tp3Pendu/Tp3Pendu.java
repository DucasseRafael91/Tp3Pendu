package tp3Pendu;

import java.util.Random;
import java.util.Scanner;

public class Tp3Pendu {
    public static void main(String[] args) {

        StringBuilder indent = new StringBuilder();
        String[] Words = {
            "chat", 
            "chien", 
            "maison", 
            "voiture", 
            "soleil", 
            "lune",
            "arbre", 
            "livre", 
            "ordinateur", 
            "ecole", 
            "fleur", 
            "montagne",
            "riviere", 
            "fromage", 
            "pluie", 
            "amour", 
            "musique", 
            "hiver",
            "ete", 
            "mer"
        };

        String chooseWord = choose_mystery_word(Words);

        System.out.println("Mot choisi : " + chooseWord);


        for (int i = 0; i < chooseWord.length(); i++) {
            indent.append("_");
        }

        Scanner scan = new Scanner(System.in);

        find_word(chooseWord, indent, scan);

        scan.close();
    }

	private static String choose_mystery_word(String[] Words) {
		Random random = new Random();
        int index_choose_word = random.nextInt(Words.length);
        String chooseWord = Words[index_choose_word];
		return chooseWord;
	}

	private static void find_word(String chooseWord, StringBuilder indent, Scanner scan) {
		while (indent.toString().contains("_")) {
            System.out.println("Mot Mystère : " + indent);
            System.out.print("Entrez une lettre : ");
            
            char letter_choose = scan.next().charAt(0);

            if (chooseWord.indexOf(letter_choose) >= 0) { 
                for (int i = 0; i < chooseWord.length(); i++) {
                    if (chooseWord.charAt(i) == letter_choose) {
                        indent.setCharAt(i, letter_choose);
                    }
                }
            } else {
                System.out.println("Lettre "+ letter_choose + " incorrecte !");
            }
        }
	}
}
