package com.octo.jeuvideo.mud;

import org.junit.Before;
import org.junit.Test;

import static com.octo.jeuvideo.mud.positions.Direction.NORD;
import static com.octo.jeuvideo.mud.positions.Direction.SUD;
import static org.junit.Assert.assertEquals;

public class JeuTest {

    private static final String JE_SUIS_DANS_UNE_PIÈCE_SOMBRE = "Je suis dans une pièce sombre.";
    private Jeu jeu;

    @Before
    public void setUp() {
        jeu = new Jeu();
    }

    @Test
    public void regardePositionDepart() {
        assertEquals(JE_SUIS_DANS_UNE_PIÈCE_SOMBRE, jeu.regarde());
    }


    @Test
    public void jeMeDeplaceVersLeNord() {
        assertEquals("Je passe sous une porte.", jeu.deplace(NORD));
    }

    @Test
    public void jeMeDeplaceVersLeNordPuisJeRegarde() {
        jeu.deplace(NORD);
        assertEquals("Je suis dans la forêt.", jeu.regarde());
    }

    @Test
    public void jeMeDeplaceVersLeNordPuisVersLeNord() {
        jeu.deplace(NORD);
        assertEquals("Commande invalide.", jeu.deplace(NORD));
    }

    @Test
    public void jeMeDeplaceVersLeSud() {
        assertEquals("Commande invalide.", jeu.deplace(SUD));
    }

    @Test
    public void jeMeDeplaceVersLeNordEtVersLeSud() {
        jeu.deplace(NORD);
        jeu.deplace(SUD);
        assertEquals(JE_SUIS_DANS_UNE_PIÈCE_SOMBRE, jeu.regarde());
    }

}
