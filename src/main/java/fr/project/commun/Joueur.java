package fr.project.commun;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Joueur {
    String pseudo;
    List<CarteChrono> cartes;
    int nbPenaliteTotal; // gardé d'une partie sur l'autre

    public Joueur(){
        this.cartes = new ArrayList<>();
    }

    public boolean addCarte(CarteChrono carte){
        if (!this.getCartes().contains(carte)){
            this.getCartes().add(carte);
            return true;
        }
        return false;
    }

    public boolean removeCarte(CarteChrono carte){
        if (this.getCartes().contains(carte)){
            this.getCartes().remove(carte);
            return true;
        }
        return false;
    }

}
