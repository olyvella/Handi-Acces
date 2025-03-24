package fr.voxi.olyve;

public class Restaurant extends Lieu {
	
	private boolean menuBraille ; 
	private boolean escaliers ; 
	
	

	public Restaurant(String nom, String adresse, String avis, boolean toilettesAdap, boolean rampeAcces,
			boolean parkingAcces, boolean entreeObstcl, boolean frequenterEnfants, boolean menuBraille,
			boolean escaliers) {
		super(nom, adresse, avis, toilettesAdap, rampeAcces, parkingAcces, entreeObstcl, frequenterEnfants);
		this.menuBraille = menuBraille;
		this.escaliers = escaliers;
	}

	public void setMenuBraille(boolean menuBraille) {
		this.menuBraille = menuBraille;
	}

	public void setEscaliers(boolean escaliers) {
		this.escaliers = escaliers;
	}

	public boolean isMenuBraille() {
		return menuBraille;
	}

	public boolean isEscaliers() {
		return escaliers;
	}

	@Override
	public String toString() {
		return "Restaurant [menuBraille=" + menuBraille + ", escaliers=" + escaliers + "]";
	}


	

}
