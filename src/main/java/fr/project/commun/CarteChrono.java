package fr.project.commun;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CarteChrono {

    private ECouleur couleur;
    private EPouvoir pouvoir;
    private int penalite;
    private int tempsRestant;

}
