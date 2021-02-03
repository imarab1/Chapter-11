import java.util.*;//import packages

public class elevennine {
	
	public static void main (String[] args) {
		Set<Integer>num = new HashSet<>(); // create new integer set
		num.add(8);//add integer values
		num.add(4);
		num.add(6);
		num.add(8);
		num.add(9);
		num.add(9);
		System.out.println(hasOdd(num)); //calls our method
	}
	public static boolean hasOdd(Set<Integer> set) { //method with set parameter
    for(int odd : set) {
        if(odd % 2 == 1) // goes thriugh the intetgers, to find odd number
            return true;
    }

    return false; // if empty or without odd number return false
}
}
