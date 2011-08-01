package com.octo.jeuvideo.mud;

import com.octo.jeuvideo.mud.positions.Foret;
import com.octo.jeuvideo.mud.positions.PieceSombre;
import com.octo.jeuvideo.mud.positions.Position;

public class Carte {
    Position depart = new PieceSombre();
    Position foret = new Foret();

    public Carte() {
        depart.ajouterVoisins(foret,null);
        foret.ajouterVoisins(null,depart);
    }

    public Position donneLaPositionDeDepart() {
        return depart;
    }

    public Position donneLaPositionNordDe(Position depart) {
        return foret;
    }

    public Position donneLaPositionSudDe(Position nordDeDepart) {
        return depart;
    }
}
