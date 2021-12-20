package tp4_uml;

public class Test {

	public static void main(String[] args) {
		InterfaceGraphique obs= new InterfaceGraphique();
		PorteGarage p=new PorteGarage();
		Fermeture e = new Fermeture(p);
		p.addObserver(obs);
		p.setEtat(e);
		p.ouvrir();
		p.fermer();
	}

}