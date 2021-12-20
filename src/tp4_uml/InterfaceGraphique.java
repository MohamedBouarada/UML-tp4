package tp4_uml;

public class InterfaceGraphique implements Observer{
    public void actualiser(Etat s){
        System.out.println("L'interface affiche:");
        s.afficherEtat();
    }

}