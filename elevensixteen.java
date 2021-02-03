import java.util.*;//import packages

public class elevensixteen {
	public static void main(String[] args){
		Map <String, String> test = new TreeMap <>(); // create new map 
		test.put("Marty", "206-9024"); // add values
		test.put("Hawking", "123-4567");
		test.put("Smith", "949-0504");
		test.put("Newton", "123-4567");

		System.out.println(is1to1(test)); // call method 
		
		test.put("Marty", "206-9024"); //different values
		test.put("Hawking", "555-1234");
		test.put("Smith", "949-0504");
		test.put("Newton", "123-4567");
		
		System.out.println(is1to1(test)); // call method
	}
	public static boolean is1to1(Map<String, String> test){
		if(test.isEmpty()) { //if the test is empty then we get an output of true
			return true; 
		}
		
		HashSet<String> s = new HashSet<>(); //new empty set
		
		for(String key: test.keySet() ){ // find the keys of the elements
			String val = test.get(key);
			
			s.add(val); // add the keys of the elements to the set
		}
		boolean a = test.size() == s.size(); //compare set size 
		return a; //return boolean value
	}
}
