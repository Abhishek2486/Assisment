package Map;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.Map.Entry;

public class hashMap {

	public static void main(String[] args) {
     //Hashmap Example
		System.out.println("Hashmap");
		System.out.println();
		HashMap<Integer, String> map = new HashMap<>();

		map.put(1, "suresh");
		map.put(3, "ramesh");
		map.put(2, "Jaysurya");


		Set<Entry<Integer, String>> data = map.entrySet();

		Iterator<Entry<Integer,String>> itr = data.iterator();

		while (itr.hasNext()) {
			Map.Entry<Integer,String> entry =  itr.next();
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		//Hashset Example
		System.out.println();
		System.out.println("Hashset");
		System.out.println();

		HashSet<String> set = new HashSet<>();
		set.add("dhoni");
		set.add("kohli");
		set.add("klRhaul");
		set.add("raina");


		for(String elem : set) {
			System.out.println(elem);
		}

		//linkedhash example
		System.out.println();
		System.out.println("LinkedHash");
		System.out.println();
			LinkedHashSet<String> set1 = new LinkedHashSet<>();

			set1.add("maxi");
			set1.add("Tony");
			set1.add("Abhishek");
			set1.add("Tony");
			set1.add(null);



			for(String elem : set) {
				System.out.println(elem);
			}
			
		//treeset Example
			System.out.println();
			System.out.println("TreeSet");
			System.out.println();
			TreeSet<String> set2 = new TreeSet<>();

			set2.add("Ravi");
			set2.add("Abhishek");
			set2.add("Nishchith");
			set2.add("Abhishek");


			for(String elem : set) {
				System.out.println(elem);
			}



		}


		}


	



