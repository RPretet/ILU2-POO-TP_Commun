package model;

public abstract class EntiteReservable <F extends Formulaire> {
	private CalendrierAnnuel calendrier;
	private int numId;
	
	public int getNumId() {
		return numId;
	}
	public void setNumId(int numId) {
		this.numId = numId;
	}
	
	public boolean estLibre(F formulaire) {
		return calendrier.estLibre(formulaire.getJour(), formulaire.getMois());
	}
	
	public abstract boolean compatible(F formulaire);
	
	public abstract Reservation reserver(F formulaire);

}