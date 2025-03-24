package fr.voxi.olyve;

public class Utilisateur {
	
	private String nom ; 
	private String prenom ; 
	private String age ; 
	private Handicap Handicap ;
	
	public Utilisateur(String nom, String prenom, String age, Handicap handicap) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		Handicap = handicap;
	}
	
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public Handicap getHandicap() {
		return Handicap;
	}

	public void setHandicap(Handicap handicap) {
		Handicap = handicap;
	}



	@Override
	public String toString() {
		return "Utilisateur [nom=" + nom + ", prenom=" + prenom + ", age=" + age + ", Handicap=" + Handicap + "]";
	} 
	
	
	
	
	
	
	

}
