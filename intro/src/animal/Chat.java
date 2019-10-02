package animal;

public class Chat extends Animal{

	public Chat() {
		super();
	}
	public Chat(int age, String nom, double speed) {
		super(age,nom);
		this.setSpeed(speed);
	}
	public void setPoid() {
		this.setPoid((int) Math.random()+20);
	}

}
