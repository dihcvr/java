package generic;

public class solo<T> {

	private T valeur;
	 
	public solo(T valeur) {
		this.valeur=valeur;
	}

	public String toString() {
		return ""+this.valeur;
	}
	
	
	public static void main(String[] args) {
		solo<Integer> s1 = new solo<Integer>(123);  
		solo<Double> s2 = new solo<Double>(12.69); 
		System.out.println(s1);
		System.out.println(s2);
	}

}
