/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_feuillet_version_console;

import java.util.Scanner;

/**
 *
 * @author alexi
 */
public class Partie {
    private GrilleDeCellule grille;
    private int nbCoups;

    /**
     * Constructeur de la classe Partie. Permet de créer une nouvelle instance de la grille
     * avec le nombre de lignes et de colonnes spécifié, puis il va initialiser le compteur de coups à zéro.
     */
    public Partie() {
        grille = new GrilleDeCellule(3, 3); // grille de 3x3 pour le niveau tranquille
        nbCoups = 0;
    }

    /**
     * Le coeur de la classe Partie. Permet de jouer en interaction au jeu lightOff.
     * Il va afficher l'état initial de la grille, puis il va entrer dans une boucle de jeu en continue jusqu'a ce que
     * toutes les cellules sooient éteintes.
     */
    public void lancerPartie() {
        initialiserPartie();
        afficherGrille();

        Scanner scanner = new Scanner(System.in);

        while (!grille.cellulesToutesEteintes() && !grille.cellulesToutesAllumees()) {
            System.out.println("Veuillez entrer un coup (pas une droite ou quoi hein, vous devez juste écrire soit ligne, soit colonne, soit diagonale, selon si vous voulez échanger l'éclairage sur une ligne, une colonne ou une diagonale,  ou bien vous pouvez quitter en écrivant ciao) : ");
            String coup = scanner.nextLine();

            if (coup.equals("ligne")) {
                System.out.print("Veuillez entrer le numéro de la ligne souhaitée : ");
                int ligne = scanner.nextInt();
                grille.activerLigneDeCellules(ligne - 1); // il faut soustraire 1 afin de correspondre à l'index 0-based
            } else if (coup.equals("colonne")) {
                System.out.print("Veuillez entrer le numéro de la colonne por favor: ");
                int colonne = scanner.nextInt();
                grille.activerColonneDeCellules(colonne - 1); // il faut la aussi soustraire de 1 pour la meme raison que le num de lignes
            } else if (coup.equals("diagonale")) {
                grille.activerDiagonaleDescendante();
            } else if (coup.equals("ciao")) {
                System.out.println("Oh dommage que vous nous quittiez si tôt ! On espère vite vous revoir! (si tu reviens pas vite un pigeon va bientôt te chier dessus.");
                break;
            } else {
                System.out.println("Fais un effort de syntaxe poto abuse pas, écris sois ligne sois colonne sois diagonale , sois ciao si tu veux rage quitte");
            }

            nbCoups++;
            afficherGrille();
            scanner.nextLine();
        }

        if (grille.cellulesToutesEteintes()) {
            System.out.println("Bsahtek ! Vous avez dead ça en seulement " + nbCoups + " coups.");
        } else if (grille.cellulesToutesAllumees()) {
            System.out.println("Bsahtek ! Vous avez dead ça en seulement " + nbCoups + " coups.");
        }
    }

    /**
     * permet d'afficher l'état actuel de la grille.
     */
    public void afficherGrille() {
        System.out.println(grille);
    }

    /**
     * Permet au joueur de choisir un niveau de difficulté : Facile, Normal ou Difficile.
     * Le niveau choisi va faire varier la taille de la grille.
     */
    public void choisirNiveau() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bonjour et bienvenue sur le jeu LIGHTOFF la zoooone !");
        System.out.println("Le principe est super easy, vous devez éteindre toutes les lumières (les X sur la grille)");
        System.out.println("Tout d'abord nous vous prions de choisir un niveau de difficulté :");
        System.out.println("1. TRANQUILLE(3x3)");
        System.out.println("2. UN PEU MOINS TRANQUILLE (6x6)");
        System.out.println("3. LA GALEEERE (8x8)");
        int choix = scanner.nextInt();

        switch (choix) {
            case 1:
                grille = new GrilleDeCellule(3, 3);
                break;
            case 2:
                grille = new GrilleDeCellule(6, 6);
                break;
            case 3:
                grille = new GrilleDeCellule(8, 8);
                break;
            default:
                System.out.println("Orh tu ne sais pas écrire bordel. Tant pis pour toi le niveau TRAAANQUILLE (6x6) a été choisi par défaut du coup.");
                break;
        }
    }

    /**
     * permet d'initialiser une nouvelle partie en choisissant le niveau de difficulté et en mélangeant la grille.
     */
    public void initialiserPartie() {
        choisirNiveau();
        grille.melangerMatriceAleatoirement(10); // Mélanger la grille
    }
}

