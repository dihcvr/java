package cours;

import java.io.Serializable;

public class Game implements Serializable {
	private String nom , style ;
	private double prix;
	
  

	public Game(String nom , String style ,double prix) {
		this.nom=nom;
		this.style=style;
		this.prix=prix;
		
		
	}


	public String toString() {
		return " nom du jeu :" + this.nom + "\n Style  de jeu : " 
			   + this.style + " \n Prix du jeu : " + this.prix + "\n" ;	
	}

}
