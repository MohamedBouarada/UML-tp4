package tp4_uml;

public class Fermee extends Etat{
	public Fermee(PorteGarage p) {
		super(p);
	}
	public void nextState() {
		p.nextState(new Ouverture(p));
	}
	public void fermer() {
		System.out.println("la porte est deja fermee");
		
	}
	public void ouvrir() {
		System.out.println("Ouverture de la porte ");
	}
	public void afficherEtat(){
		System.out.println("La porte est fermee");
	}
}