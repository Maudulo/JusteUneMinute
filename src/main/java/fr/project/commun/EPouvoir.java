package fr.project.commun;

import lombok.Getter;

@Getter
public enum EPouvoir {
    AUCUN(0, "Aucun pouvoir"),
    TEMPS(1, "Le joueur suivant doit jouer une carte temps"),
    CAPACITE(2, "Le joueur suivant doit jouer une carte capacité"),
    DIZAINE(3, "Permet de remonter le temps jusqu'à une dizaine supérieure"),
    VISION(4, "Permet d'observer une carte face cachée"),
    PIOCHE(5, "Le joueur de votre choix doit piocher deux cartes"),
    MELANGE(6, "Permet de mélanger deux cartes face cachée"),
    CHANGEMENT_SENS(7, "Permet de changer le sens de jeu");

    private final int id;
    private final String description;

    EPouvoir(int id, String desc) {
        this.id = id;
        this.description = desc;
    }
}
