import java.util.*;

class starter {
	//Methods go here

	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> a = new ArrayList<Integer>(5);
		System.out.println("how many values would you like added to the ArrayList? ");
		addValuesArrayList(a, n);
		printArrayList(a);
		
		


	}
	public static void printArrayList(ArrayList<Integer>a){
		int c = a.size();
			for(int x = 0; x < c; x++){
			System.out.println(a.get(c));
			}
		}
	
	
	public static void addValuesArrayList(ArrayList<Integer>a, int n){
		Random r = new Random();
		for(int count = 0; count < n; count++){
			int num = r.nextInt(100)+1;
			a.add(num);
		}
		
		
	}
	
}
