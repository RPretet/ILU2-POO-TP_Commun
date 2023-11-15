package model;

public class CalendrierAnnuel {
	private Mois[] calendrier;
	
	public CalendrierAnnuel() {
		calendrier = new Mois[12];
		calendrier[0] = new Mois("Janvier",31);
		calendrier[1] = new Mois("Février",28);
		calendrier[2] = new Mois("Mars",31);
		calendrier[3] = new Mois("Avril",30);
		calendrier[4] = new Mois("Mai",31);
		calendrier[5] = new Mois("Juin",30);
		calendrier[6] = new Mois("Juillet",31);
		calendrier[7] = new Mois("Août",31);
		calendrier[8] = new Mois("Septembre",30);
		calendrier[9] = new Mois("Octrobre",31);
		calendrier[10] = new Mois("Novembre",30);
		calendrier[11] = new Mois("Décembre",31);
	}
	
	public boolean estLibre(int jour,int mois) {
		int id_mois = mois - 1;
		int id_jour = jour - 1;
		return calendrier[id_mois].estLibre(id_jour);
	}
	
	public boolean reserver(int jour, int mois) {
		if (estLibre(jour, mois)) {
			int id_mois = mois - 1;
			int id_jour = jour - 1;
			calendrier[id_mois].reserver(id_jour);
			return true;
		} else return false;
	}
	
	private static class Mois {
		private String nom;
		private boolean[] jours;
		
		private Mois(String nom, int nbJours) {
			this.nom=nom;
			jours = new boolean[nbJours];
		}
		
		private boolean estLibre(int jour) {
			return !jours[jour];
		}
		
		private void reserver(int jour) throws IllegalStateException {
			if (!estLibre(jour))
				throw new IllegalStateException("Ce jour est déjà réservé");
			else
				jours[jour] = true;
			
		}
		
	}
}
