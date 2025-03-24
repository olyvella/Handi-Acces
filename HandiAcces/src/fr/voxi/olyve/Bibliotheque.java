package fr.voxi.olyve;

public class Bibliotheque extends Lieu {
	
	private boolean livreAudio ; 
	private boolean livreBraille ; 

	public Bibliotheque(String nom, String adresse, String avis, boolean toilettesAdap, boolean rampeAcces,
			boolean parkingAcces, boolean entreeObstcl, boolean frequenterEnfants, boolean livreAudio,
			boolean livreBraille) {
		super(nom, adresse, avis, toilettesAdap, rampeAcces, parkingAcces, entreeObstcl, frequenterEnfants);
		this.livreAudio = livreAudio;
		this.livreBraille = livreBraille;
	}

	public boolean isLivreAudio() {
		return livreAudio;
	}

	public void setLivreAudio(boolean livreAudio) {
		this.livreAudio = livreAudio;
	}

	public boolean isLivreBraille() {
		return livreBraille;
	}

	public void setLivreBraille(boolean livreBraille) {
		this.livreBraille = livreBraille;
	}

	@Override
	public String toString() {
		return "Bibliotheque [livreAudio=" + livreAudio + ", livreBraille=" + livreBraille + "]";
	}
	
	

	
}
