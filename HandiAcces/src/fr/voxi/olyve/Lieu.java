package fr.voxi.olyve;

public class Lieu {
	
	String nom ; 
	String adresse ;
	String avis ; 
    boolean toilettesAdap ; 
    boolean rampeAcces ; 
    boolean parkingAcces ; 
    boolean entreeObstcl ; 
    boolean frequenterEnfants ;
   
	public Lieu(String nom, String adresse, String avis, boolean toilettesAdap, boolean rampeAcces,
			boolean parkingAcces, boolean entreeObstcl, boolean frequenterEnfants) {
		super();
		this.nom = nom;
		this.adresse = adresse;
		this.avis = avis;
		this.toilettesAdap = toilettesAdap;
		this.rampeAcces = rampeAcces;
		this.parkingAcces = parkingAcces;
		this.entreeObstcl = entreeObstcl;
		this.frequenterEnfants = frequenterEnfants;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public boolean isToilettesAdap() {
		return toilettesAdap;
	}

	public void setToilettesAdap(boolean toilettesAdap) {
		this.toilettesAdap = toilettesAdap;
	}


	public boolean isRampeAcces() {
		return rampeAcces;
	}


	public void setRampeAcces(boolean rampeAcces) {
		this.rampeAcces = rampeAcces;
	}


	public boolean isParkingAcces() {
		return parkingAcces;
	}


	public void setParkingAcces(boolean parkingAcces) {
		this.parkingAcces = parkingAcces;
	}


	public boolean isEntreeObstcl() {
		return entreeObstcl;
	}


	public void setEntreeObstcl(boolean entreeObstcl) {
		this.entreeObstcl = entreeObstcl;
	}


	public boolean isFrequenterEnfants() {
		return frequenterEnfants;
	}


	public void setFrequenterEnfants(boolean frequenterEnfants) {
		this.frequenterEnfants = frequenterEnfants;
		
	}

	public String getAvis() {
		return avis;
	}

	public void setAvis(String avis) {
		this.avis = avis;
	}

	@Override
	public String toString() {
		return "Lieu [nom=" + nom + ", adresse=" + adresse + ", avis=" + avis + ", toilettesAdap=" + toilettesAdap
				+ ", rampeAcces=" + rampeAcces + ", parkingAcces=" + parkingAcces + ", entreeObstcl=" + entreeObstcl
				+ ", frequenterEnfants=" + frequenterEnfants + "]";
	}


	
    
    

}
