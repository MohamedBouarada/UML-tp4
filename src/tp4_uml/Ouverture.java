package tp4_uml;

public class Ouverture extends Etat {
public Ouverture(PorteGarage p) {
		super(p);
	}
public void nextState() {
	p.nextState(new Ouverte(p));
}
public void ouvrir() {
	System.out.println("la porte est ouverte");
	
}
public void fermer() {
	System.out.println("Fermeture de la porte ");
}

public void afficherEtat(){
	System.out.println("La porte est en ouverture");
}
}