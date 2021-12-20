package tp4_uml;

import java.util.Vector;

public class Sujet {
    public Etat s;
	public Vector<Observer> vect =new Vector<Observer>();
	public void addObserver(Observer o) {
		vect.add(o);
	}
	public void removeObserver(Observer o) {
		int i= vect.indexOf(o);
		vect.remove(i);
	}
	public void notifier(){
		for (Observer obs : vect) {
			obs.actualiser(s);
		}
	}
}