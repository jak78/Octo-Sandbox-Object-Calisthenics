package com.octo.jeuvideo.mud;

import com.octo.jeuvideo.mud.positions.*;

public class Jeu {

	private Position positionDuJoueur;
    private Carte carte;

	public Jeu() {
        carte = new Carte();
		positionDuJoueur = carte.donneLaPositionDeDepart();
	}

	public String regarde() {
		return positionDuJoueur.decrire();
	}

    public String deplace(Direction direction) {
        Position destination;
		try {
			destination = positionDuJoueur.donneMoiLaPosition(direction);
		} catch (CommandeInvalideException e) {
			return e.getMessage();
		}

		positionDuJoueur = destination;
		return new SousPorte().decrire();
    }

}
