package com.octo.jeuvideo.mud;

import com.octo.jeuvideo.mud.positions.Foret;
import com.octo.jeuvideo.mud.positions.PieceSombre;
import com.octo.jeuvideo.mud.positions.Position;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CarteTest {

    Carte carte;

    @Before
    public void setUp() {
        carte = new Carte();
    }

    @Test
    public void donneLaPositionDeDepart() {
        Position positionObtenue = carte.donneLaPositionDeDepart();
        assertNotNull(positionObtenue);
        assertTrue(positionObtenue instanceof PieceSombre);
    }

    @Test
    public void donneLaPositionNordDeLaPositionDeDepart() {
        Position depart = carte.donneLaPositionDeDepart();
        Position nordDeDepart = carte.donneLaPositionNordDe(depart);
        assertNotNull(nordDeDepart);
        assertTrue(nordDeDepart instanceof Foret);
    }

    @Test
    public void donneLaPositionSudDeLaPositionNordDeLaPositionDeDepart() {
        Position depart = carte.donneLaPositionDeDepart();
        Position nordDeDepart = carte.donneLaPositionNordDe(depart);
        Position auSudDuNordDuDepart = carte.donneLaPositionSudDe(nordDeDepart);

        assertNotNull(auSudDuNordDuDepart);
        assertEquals(depart, auSudDuNordDuDepart);
    }

}
