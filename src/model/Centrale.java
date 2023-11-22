package model;

public class Centrale {
	private EntiteReservable[] entite;
	private int nbEntite = 0;
	
	public int ajouterEntite(EntiteReservable e) {
		entite[nbEntite] = e;
		nbEntite++;
		e.setNumId(nbEntite);
		return nbEntite;
	}
	
	public int[] donnerPossibilites(Formulaire formulaire) {
		int[] retour = new int[nbEntite];
		for (int i = 0; i < nbEntite; i++) {
			if (entite[i].compatible(formulaire) &&  entite[i].estLibre(formulaire))
				retour[i] = entite[i].getNumId();
			else
				retour[i] = 0;
		}
		return retour;
	}
	
	public Reservation reserver(int numEntite, Formulaire formulaire) {
		formulaire.setNumEntite(numEntite);
		return entite[numEntite].reserver(formulaire);
	}
}
