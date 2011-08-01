package com.octo.jeuvideo.mud.positions;

import com.octo.jeuvideo.mud.CommandeInvalideException;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PositionTest {
    private Position position;

    @Before
    public void setUp() {
        position = new Position() {

            @Override
            public String decrire() {
                return "Test Position";
            }

        };
        position.ajouterVoisins(position, null);
    }

    @Test
    public void donneMoiLaPositionNord() throws CommandeInvalideException {
        assertEquals(position.donneMoiLaPosition(Direction.NORD), position);
    }

    @Test(expected = CommandeInvalideException.class)
    public void donneMoiLaPositionSud() throws CommandeInvalideException {
        position.donneMoiLaPosition(Direction.SUD);
    }
}
