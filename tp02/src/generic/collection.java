package generic;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.HashMap;
import java.util.Iterator;

public class collection {

	public static void main(String[] args) {
		Map<Integer,String> map= new HashMap<>();
		
		map.put(1,"un");
		map.put(2,"deux");
		map.put(3,"trois");
		map.put(4,"quatre");
		map.put(5,"cinq");
		System.out.println(map.get(1));
		
	    Set<Integer> setInt = map.keySet();
	    Iterator<Integer> it = setInt.iterator();
	    
	    System.out.println("Parcours d'une Map avec keySet: ");
	    while(it.hasNext()){
	    	int key=it.next();
	        System.out.println("Valeur de la clé "+key+" = "+map.get(key));
	    }
		
	}

}
