package model;

public class ReservationRestaurant extends Reservation {
	private int nbService;

	public ReservationRestaurant(int jour, int mois, int nbService, int nbId) {
		super(jour, mois, nbId);
		this.nbService = nbService;
	}
	
	public String toString() {
		StringBuilder chaine = new StringBuilder();
		chaine.append("Le " + getJour() + "/" + getMois() + " : Table " + getNbId() + " pour le ");
		System.out.println(nbService);
		if ((nbService==1)) {
			chaine.append("premier service.");
		} else {
			chaine.append("deuxième service.");
		}
		return chaine.toString();
	}
	
}
