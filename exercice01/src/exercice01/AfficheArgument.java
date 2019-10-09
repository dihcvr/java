package exercice01;

public class AfficheArgument {

	public AfficheArgument() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length==0) System.out.println("No Arguments!");
		else 
			for (String s: args) System.out.println(s);
		
	}

}
