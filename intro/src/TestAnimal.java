import animal.Animal;
import animal.Chat;

public class TestAnimal {

	public TestAnimal() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Animal a1 = new Animal(12 , "cat");
		Animal a2 = new Chat();
		Animal a3 = new Chat();


		
		System.out.println(a1);
		System.out.println(a2);
		
		System.out.println(Animal.nbrAnimal);



	}

}
