package tp3Pendu;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Tp3Pendu {
	
	public static void main(String[] args) {
        // Liste de mots français possibles
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
            "rivière", 
            "fromage", 
            "pluie",
            "amour", 
            "musique", 
            "hiver", 
            "ete", 
            "mer"
        };

        String chooseWord;
        Random random = new Random();

        int index = random.nextInt(Words.length);
        chooseWord = Words[index];

        System.out.println(chooseWord);
        
        String tiret = "";
        List<Character> characters = new ArrayList<>();
        for (char c : chooseWord.toCharArray()) {
        	characters.add(c);
            tiret += "_ ";
        }
        
        System.out.println("Mot Mystère : " + tiret);
        
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Proposez une lettre : ");
        String letter_choose = scan.next();
        System.out.println(letter_choose);

        }
    }
