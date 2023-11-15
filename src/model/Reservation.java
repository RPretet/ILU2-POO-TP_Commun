package model;

public abstract class Reservation {
	private int jour;
	private int mois;
	private int nbId;
	
	public Reservation(int jour, int mois, int nbId) {
		super();
		this.jour = jour;
		this.mois = mois;
		this.nbId = nbId;
	}

	public int getJour() {
		return jour;
	}

	public int getMois() {
		return mois;
	}

	public int getNbId() {
		return nbId;
	}
	
	
	
}
