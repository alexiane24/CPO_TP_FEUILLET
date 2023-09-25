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
        System.out.println("\n Entrer le nombre :");
        operateur =sc.nextInt(); 
        System.out.println("Please enter the operator:\n" +
        "1) add \n" +
        "2) substract\n" +
        "3) multiply\n" +
        "4) divide\n" +
        "5) modulo\n");           
    }
    
}
