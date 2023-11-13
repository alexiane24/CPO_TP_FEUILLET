/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_feuillet_version_console;

import java.util.Random;

/**
 *
 * @author alexi
 */
public class GrilleDeCellule { 
    private CelluleLumineuse[][] matriceCellules;
    private int nbLignes;
    private int nbColonnes;

    /**
     * Constructeur de la classe GrilleDeCellules.
     *
     * @param nbLignes    nombre de lignes de la grille.
     * @param nbColonnes  nombre de colonnes de la grille.
     */
    public GrilleDeCellule(int nbLignes, int nbColonnes) {
        this.nbLignes = nbLignes;
        this.nbColonnes = nbColonnes;
        matriceCellules = new CelluleLumineuse[nbLignes][nbColonnes];

        for (int i = 0; i < nbLignes; i++) { // Initialisation de la matrice de cellules
            for (int j = 0; j < nbColonnes; j++) {
                matriceCellules[i][j] = new CelluleLumineuse();
            }
        }
    }

    /**
     * va activer la totalité des cellules d'une ligne de la grille.
     *
     * @param idLigne  c'est l'indice de la ligne spécifique à activer.
     */
    public void activerLigneDeCellules(int idLigne) {
        for (int j = 0; j < nbColonnes; j++) {
            matriceCellules[idLigne][j].activerCellule();
        }
    }

    /**
     * va activer ici la totalité des cellules d'une COLONNE.
     *
     * @param idColonne  L'indice de la colonne spécifique à activer.
     */
    public void activerColonneDeCellules(int idColonne) {
        for (int i = 0; i < nbLignes; i++) {
            matriceCellules[i][idColonne].activerCellule();
        }
    }

    /**
     * va activer la diagonale descendante de la grille en allumant les cellules correspondantes.
     */
    public void activerDiagonaleDescendante() {
        for (int i = 0; i < Math.min(nbLignes, nbColonnes); i++) {
            matriceCellules[i][i].activerCellule();
        }
    }

    /**
     * permet de vérifier si toutes les cellules sont ALLUMEES.
     *
     * @return true si la totalité des cellules sont allumées, sinon false.
     */
    public boolean cellulesToutesAllumees() {
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                if (!matriceCellules[i][j].getEtat()) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * permet de vérifier si toutes les cellules sont ETEINTES.
     *
     * @return true si elles sont bien toutes éteintes, sinon false.
     */
    public boolean cellulesToutesEteintes() {
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                if (matriceCellules[i][j].getEtat()) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * va mélanger ALEATOIREMENT la grille en effectuant un certain nombre de tours.
     *
     * @param nbTours  Le nombre de tours de mélange à effectuer.
     */
    public void melangerMatriceAleatoirement(int nbTours) {
        Random random = new Random();

        for (int tour = 0; tour < nbTours; tour++) {
            int choix = random.nextInt(3);

            if (choix == 0) {
                int ligne = random.nextInt(nbLignes);
                activerLigneDeCellules(ligne);
            } else if (choix == 1) {
                int colonne = random.nextInt(nbColonnes);
                activerColonneDeCellules(colonne);
            } else {
                activerDiagonaleDescendante();
            }
        }
    }

    /**
     * Redéfinition de la méthode toString pour afficher l'état de la grille sous forme 
d'une représentation visuelle organisée.
     *
     * @return La représentation visuelle de l'état de la grille ( les  caractères "X" et "O")
     */
    @Override
    public String toString() {
        StringBuilder grilleStr = new StringBuilder();

        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                grilleStr.append(matriceCellules[i][j]);
                grilleStr.append(" ");
            }
            grilleStr.append("\n");
        }

        return grilleStr.toString();
    }
}

