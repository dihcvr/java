package gestionEleves;

public class Test {

	public static void main(String[] args) {
		Eleve e1 = new Eleve("rachid");
		e1.ajouterNote(10);
		e1.ajouterNote(12);
		System.out.println(e1.toString());
		
		Eleve e2 = new Eleve("yassir");
		e2.ajouterNote(14);
		e2.ajouterNote(16);
		System.out.println(e2.toString());
		
		GroupeEleves gr = new GroupeEleves();
		gr.ajoputerEleve(e1);
		gr.ajoputerEleve(e2);
		System.out.println("Le nombre des eleves: "+gr.nombre());
	}

}
