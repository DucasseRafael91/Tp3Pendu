package tp3Pendu;

import java.util.Random;

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
            "école", 
            "fleur", 
            "montagne", 
            "rivière", 
            "fromage", 
            "pluie",
            "amour", 
            "musique", 
            "hiver", 
            "été", 
            "mer"
        };

        int tailleTableau = 10; // nombre de mots à générer
        String chooseWord;
        Random random = new Random();

        int index = random.nextInt(Words.length);
        chooseWord = Words[index];

        System.out.println(chooseWord);
        }
    }
