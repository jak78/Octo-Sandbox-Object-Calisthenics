package com.octo.jeuvideo.mud.positions;

import com.octo.jeuvideo.mud.CommandeInvalideException;
import com.octo.jeuvideo.mud.Voisins;

public abstract class Position {
	protected Voisins voisins = new Voisins();

    public Position() {
        
    }
    public void ajouterVoisins(Position nord,Position sud) {
        voisins.ajouterVoisin(Direction.NORD,nord);
        voisins.ajouterVoisin(Direction.SUD,sud);

    }
	public abstract String decrire();

	public Position donneMoiLaPosition(Direction direction)
			throws CommandeInvalideException {
        Position voisin = voisins.quelVoisin(direction);
		if (voisin == null) {
			throw new CommandeInvalideException();
		}
		return voisin;
	}

}
