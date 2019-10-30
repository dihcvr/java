package generic;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
;
public class Trie {

	public static void main(String[] args) {
		
		Set<String> tree = new TreeSet<String>();
		tree.add("Yassir");
		tree.add("Yassir");
		
		tree.add("Ali");
		tree.add("Nadia");
		tree.add("Med");
		tree.add("Said");
		tree.add("Rachid");
		
		
		Iterator<String> it = tree.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
