/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exo2;

import java.util.Scanner;

/**
 *
 * @author alexi
 */

/* TP0 Exercice 2
* FEUILLET Alexiane
* FGE2
* TP DE FAMILIARISATION AVEC NETBEANS
* 25.09.2023
*/

public class Exo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Declaration des variables
        int nb; // nombre d'entiers à additionner
        int result; // resultat
        int ind; //indice
        nb=5;
        //nb=5;
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Entrer le nombre :");
        nb=sc.nextInt(); // On demande a sc de donner le prochain entier
            
        result=0;
        
        // Addition des nb premiers entiers
        ind=1;
        while (ind <= nb) {
           result=result+ind;
           ind=ind+1;
        }
        
        // Affichage du resultat
        System.out.println();
        System.out.println("La somme des "+ nb + " entiers est: "+result);       
    }
}

