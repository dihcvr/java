package generic;
import java.util.*;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class comp implements Comparable {
	private String auteur, titre;
	private double prix;
	
	
	public comp(String auteur, String titre, double prix) {
		this.auteur= auteur;
		this.titre=titre;
		this.prix=prix;
	}
	public String toString() {
		return "CD[auteur="+ auteur + ",titre="+titre+",prix= "+prix+"]";
	}
	public String getAuteur() {
		return auteur;
	}
	public String getTitre() {
		return titre;
	}
	public double getPrix() {
		return prix;
	}
	
	@Override
	public int compareTo(Object o) {
		if(o.getClass().equals(comp.class)) {
			comp c = (comp) o;
			return  this.auteur.compareTo(c.getAuteur());		
		}
		return -1;
	}

	public static void main(String[] args) {
		comp c1 = new comp("a","a",1);
		comp c2 = new comp("b","b",2);
		System.out.println(c2.compareTo(c1));
		
		ArrayList<comp> list=new ArrayList<comp>();
		list.add(new comp("c","c",15.30d));
		list.add(new comp("b","b",10.25d));
		list.add(new comp("a","a",7d));
		System.out.println("Avant le trie: ");
		Iterator<comp> it=list.iterator();
		while(it.hasNext()) { 					
			System.out.println(it.next());
		}
		Collections.sort(list);
		System.out.println("Apres le trie: ");
		it=list.iterator();
		while(it.hasNext()) { 					
			System.out.println(it.next());
		}
	}
}
