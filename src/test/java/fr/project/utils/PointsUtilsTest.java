package fr.project.utils;

import fr.project.commun.CarteChrono;
import fr.project.commun.Joueur;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class PointsUtilsTest {

    @MethodSource("getJoueursScore")
    @ParameterizedTest
    void pointsMancheTest(Joueur joueur, boolean aExplose, int expectedValue){
        Assertions.assertEquals(PointsUtils.pointsManche(joueur, aExplose), expectedValue);
    }

    @MethodSource("getJoueursPerdu")
    @ParameterizedTest
    void pointsMancheTest(Joueur joueur, boolean expectedAPerdu){
        Assertions.assertEquals(PointsUtils.aJoueurPerdu(joueur), expectedAPerdu);
    }

    private static Stream<Arguments> getJoueursScore(){

        CarteChrono carteValue1 = new CarteChrono();
        carteValue1.setPenalite(1);
        CarteChrono carteValue2 = new CarteChrono();
        carteValue2.setPenalite(2);

       Joueur joueur1 = new Joueur();
       joueur1.addCarte(carteValue1);
       joueur1.addCarte(carteValue2);

       Joueur joueur2 = new Joueur();

        return Stream.of(
                Arguments.of(joueur1, true, 13),
                Arguments.of(joueur2, false, 0),
                Arguments.of(joueur2, true, 10)
        );
    }

    private static Stream<Arguments> getJoueursPerdu(){

        Joueur joueur1 = new Joueur();
        joueur1.setNbPenaliteTotal(59);

        Joueur joueur2 = new Joueur();
        joueur2.setNbPenaliteTotal(60);

        return Stream.of(
                Arguments.of(joueur1, false),
                Arguments.of(joueur2, true)
        );
    }

}
