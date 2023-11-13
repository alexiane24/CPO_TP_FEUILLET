/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_feuillet_version_console;

/**
 *
 * @author alexi
 */
public class CelluleLumineuse {
    private boolean etat;

    /**
     * Constructeur de la classe CelluleLumineuse. Il initialise la cellule dans l'état "éteinte".
     */
    public CelluleLumineuse() {
        etat = false; // on a ici l'initialisation de la cellule en état éteint
    }

    /**
     * l'inversion de l'état actuel de la cellule permet de l'activer
     * Si la cellule est éteinte, elle s'allume, et inversément.
     */
    public void activerCellule() {
        etat = !etat; // le "!" marque l'inversion de l'état de la cellule
    }

    /**
     * la cellule est mise dans l'état "éteinte" (c'est le booléen "false").
     * Si jamais la cellule est déjà éteinte, cette méthode ne change rien.
     */
    public void eteindreCellule() {
        etat = false;
    }

    /**
     * Permet de vérifier si la cellule est actuellement éteinte.
     *
     * @return false si elle est allumée, true si la cellule est éteinte.
     */
    public boolean estEteint() {
        return !etat;
    }

    /**
     * Va renvoyer l'état actuel de la cellule.
     *
     * @return false si la cellule est éteinte, et inversément
     */
    public boolean getEtat() {
        return etat;
    }

    /**
     * Redéfinition de la méthode toString (va afficher l'état de la cellule de manière lisible)
     * Si la cellule est allumée, elle va afficher "X", mais si elle est éteinte, elle va afficher "O".
     *
     * @return Une représentation textuelle de l'état de la cellule lumineuse ("O" pour éteinte et "X" pour allumée).
     */
    @Override
    public String toString() {
        return etat ? "X" : "O";
    }
}
   
