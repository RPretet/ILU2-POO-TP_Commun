package model;

public class FormulaireRestaurant extends Formulaire {
	private int nbPers;
	private int nbService;

	public FormulaireRestaurant(int jour, int mois, int nbPers, int nbService) {
		super(jour, mois);
		this.nbPers = nbPers;
		this.nbService = nbService;
	}

	public int getNbPers() {
		return nbPers;
	}

	public int getNbService() {
		return nbService;
	}
	
	
	
}
