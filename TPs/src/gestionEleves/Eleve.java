package gestionEleves;
import java.util.ArrayList;
import java.util.Iterator;
public class Eleve {
	private String nom;
	private ArrayList<Integer> notes=new ArrayList<Integer>();
	private double moyenne=0;
	
	public Eleve(String nom) {
		this.nom= nom;
	}
	public double getMoyenne() {
		return moyenne;
	}
	public void ajouterNote(int note) {
		this.notes.add(note);
		Iterator it=this.notes.iterator();
		int sum=0 ;
		while(it.hasNext()) {	
			sum=sum+ (int)it.next();
		}
		this.moyenne = sum / this.notes.size();
	}
	public String getNom() {
		return this.nom;
	}
	public ArrayList<Integer> getListNotes() {
		Iterator it=this.notes.iterator();
		while(it.hasNext()) { 	
			it.next(); 
		}
		return this.notes;
	}
	public String toString() {
		return "Nom = " + this.nom +"\nnotes = " 
				+ this.notes + "\nmoyenne = " 
					+ this.moyenne; 
		
	}
	
	
	
	

}
