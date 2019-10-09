package generic;
import java.util.ArrayList;
import java.util.Iterator;

public class list {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		Iterator it=list.iterator();
		while(it.hasNext()) { 					// hasNext vérifie si le pointeur ne pointe sur NULL
			/*
			 String str = (String)it.next(); 	// next déplace le pointeur	 
			if(str.equals("4") || str.equals("2")) it.remove();
			*/
			it.next(); 
			it.remove();
			
		}
		System.out.println(list);

	}

}
