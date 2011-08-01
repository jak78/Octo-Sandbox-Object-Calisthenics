package com.octo.jeuvideo.mud;

import com.octo.jeuvideo.mud.positions.Direction;
import com.octo.jeuvideo.mud.positions.Position;

import java.util.HashMap;
import java.util.Map;

public class Voisins {
    private Map<Direction, Position> voisins;

    public Voisins() {
        voisins = new HashMap<Direction, Position>(2);
    }

    public Position quelVoisin(Direction direction) {
        return voisins.get(direction);
    }

    public void ajouterVoisin(Direction direction, Position voisin) {
        voisins.put(direction, voisin);
    }
}
