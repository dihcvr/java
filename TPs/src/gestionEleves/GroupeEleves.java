package gestionEleves;
import java.util.ArrayList;
import java.util.Iterator;


public class GroupeEleves {
	
	private ArrayList<Eleve> listeEleves=new ArrayList<Eleve>();
	
	public void ajoputerEleve(Eleve e) {
		this.listeEleves.add(e);
	}
	public int nombre() {
		return this.listeEleves.size();
	}
	
	
}
