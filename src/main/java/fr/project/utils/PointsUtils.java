package fr.project.utils;

import fr.project.commun.CarteChrono;
import fr.project.commun.Joueur;

public class PointsUtils {

    private PointsUtils(){
        // classe utils
    }

    /**
     * Cette méthode retourne la pénalité totale à la fin d'une manche,
     * en prenant en compte le fait que le joueur a pioché ou non la carte explosion.
     * @param joueur Le joueur dont on veur la pénalité totale.
     * @param aPiocheExplosion Le joueur est celui qui a pioché la carte explosion sur cette manche.
     * @return le nombre de points pénalités du joueur à la fin de la manche.
     */
    public static int pointsManche(Joueur joueur, boolean aPiocheExplosion){
        return joueur.getCartes().stream().map(CarteChrono::getPenalite).reduce(joueur.getNbPenaliteTotal(), Integer::sum)
                 + (aPiocheExplosion ? 10 : 0);
    }

    /**
     * Cette méthode vérifie si un joueur a atteint le score pénalité de 60 ou non. Si c'est le cas, cette méthode retourne true.
     * @param joueur le joueur dont on vérifie le score.
     * @return Si le joueur a atteint un score de 60.
     */
    public static boolean aJoueurPerdu(Joueur joueur){
        return joueur.getNbPenaliteTotal() >= 60;
    }


}
