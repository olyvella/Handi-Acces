package fr.voxi.olyve;

public class AppHandiAcces {

	public static void main(String[] args) {
		
	       // Créer un lieu avec des toilettes adaptées
		
        Lieu restaurant1 = new Restaurant("Restaurant Le Gourmet", "123 Rue du Parc", null, true, true, true, true, false, false, false);
        
	    if (restaurant1.isToilettesAdap()) {
	        System.out.println("Bonne nouvelle ! " + restaurant1.getNom() + " a des toilettes adaptées.");
	    }else {
	        System.out.println("Je vous déconseille cet endroit, car le lieu indique qu'il n'y a pas de toilettes adaptées.");
	    }


}
