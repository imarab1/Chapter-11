import java.util.*; //import packages

public class elevenfive {
	
	public static void main (String[] args) {
		Set<Integer>list = new HashSet<> (); // create new integer set
		list.add(7); //add values to the set
		list.add(4);
		list.add(-9);
		list.add(4);
		list.add(15);
		list.add(8);
		list.add(27);
		list.add(7);
		list.add(11);
		list.add(-5);
		list.add(32);
		list.add(-9);
		list.add(-9);
	
			System.out.println(sortAndRemoveDuplicates(list));//call method
	}
	public static Set<Integer>sortAndRemoveDuplicates(Set<Integer>list) { //method with integer list as parameter
		Set<Integer> sort = new TreeSet<>(list);//new set with elements, specifically treeset
		return sort; //return the sorted elements
		
		
				
	}
}

