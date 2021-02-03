import java.util.*;// import package

public class elevenfour {
	
	public static void main (String[] args) {
		int E = 5; // value of partition
		Integer num[] = {15, 1, 6, 12, -3, 4, 8, 21, 2, 30, -1, 9}; //array of integers
		
		List <Integer> list = new LinkedList <> (Arrays.asList(num));//creates a list of integers and converts the array to a list
		System.out.println(partition(list, E));//calls method with parameter
		
	}
	public static List<Integer> partition(List<Integer>list, int E) {
	List <Integer> newList = new LinkedList<Integer> (); //creates a new list
		for(Integer nums:list)// checks and adds any element that is less than E
			if(nums.compareTo(E)<0)
				newList.add(nums);
				
		for(Integer nums:list) // checks and adds any element that is greater than E
			if(nums.compareTo(E)>0)
				newList.add(nums);
				
	
		return newList; //return the new list 
				
	}
}
