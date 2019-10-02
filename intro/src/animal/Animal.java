package animal;

public class Animal {
    public static int nbrAnimal = 0 ;
	private String nom;
	private int age;
	private double poid;
	private double speed;
	private int id ;
	
	public Animal() {
		this.nbrAnimal++;
	}
	public Animal(int age, String nom) {
		this.nom=nom;
		this.age=age;
		
	}
	
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public double getPoid() {
		return poid;
	}

	public void setPoid(double poid) {
		this.poid = (double)Math.random();
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public String toString() {
		return "Animal : " + this.nom + " "+ this.age ;
	}
	public void parle() {
		System.out.println("Test");
	}
	

	

	
	
}
