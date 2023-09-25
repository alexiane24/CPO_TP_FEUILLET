/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculator;

import java.util.Scanner;

/* TP0 Exercice 2
* FEUILLET Alexiane
* FGE2
* TP DE FAMILIARISATION AVEC NETBEANS
* 25.09.2023
*/

/**
 *
 * @author alexi
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int operateur;
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Entrez un nombre (Partie 2 du tp, inutile pour la suite)  :");
        operateur =sc.nextInt(); 
        System.out.println("Please enter the operator:\n" + 
        "1) add \n" +
        "2) substract\n" +
        "3) multiply\n" +
        "4) divide\n" +
        "5) modulo\n");     
        operateur = sc.nextInt(); // On demande a sc de donner le prochain entier
        if (operateur<1 || operateur>5) {
            System.out.println("Erreur, vous devez choisir un operateur entre 1 et 5 ");
            System.exit(0);
            
        }
        int operande1;
        int operande2;

        System.out.println("Veuillez entrer une premiere valeur");
        operande1 = sc.nextInt();
        System.out.println("Maintenant entrez une seconde valeur");
        operande2 = sc.nextInt();

        int result = 0;
        switch (operateur) {
            case 1:
                result = operande1 + operande2;
                break;
            case 2:
                result = operande1 - operande2;
                break;
            case 3:
                result = operande1 * operande2;
                break;
            case 4:
                result = operande1 / operande2;
                break;
            case 5:
                result = operande1 % operande2;
                break;
            default:
                System.out.println("Erreur, vous n'avez pas choisi un operateur entre 1 et 5!");
                break;
        }
        if (operateur >= 1 && operateur <= 5) {
            System.out.println("Le resultat est " + result);
        }
    }
    
}
