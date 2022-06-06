
import java.util.*;

class starter {
	public static void main(String args[]) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int count = 0; count < 100; count++){
			arr.add(new Integer((int)(Math.random()*100)));
		}
		System.out.println("Normal array");
		printValuesInt(arr);
		System.out.println("");
		
		System.out.println("Bubble Sort");
		bubbleSort(arr);
		printValuesInt(arr);
		System.out.println("");
		
		System.out.println("Selection Sort");
		selectionSort(arr);
		printValuesInt(arr);
		System.out.println("");
		
		System.out.println("Insertion Sort");
		insertionSort(arr);
		printValuesInt(arr);
		System.out.println("");
	}

public static ArrayList<Integer> bubbleSort(ArrayList<Integer> arr){
		for(int x = 0; x < arr.size()-1; x++){
			for(int y = 0; y < arr.size()-x-1; y++){
				if(arr.get(y) > arr.get(y + 1)){
					int temp = arr.get(y);
					arr.set(y, arr.get(y+1));
					arr.set(y + 1, temp);
				}
			}
		}
		return(arr);
	}
	
public static ArrayList<Integer> selectionSort(ArrayList<Integer> arr){
		int x, y, min_index;
		for(x = 0; x < arr.size(); x++){
			min_index = x;
			for(y = x + 1; y < arr.size(); y++){
				if(arr.get(y) < arr.get(min_index)){
					min_index = y;
				}
			}
				int temp = arr.get(x);
				arr.set(x, arr.get(min_index));
				arr.set(min_index, temp);
		}
		return(arr);
	}
	
public static ArrayList<Integer> insertionSort(ArrayList<Integer>arr){
	int x, y, key;
	for(x = 1; x < arr.size(); x++){
		key = arr.get(x);
		y = x-1;
		
		while(y >+ 0 && arr.get(y) > key){
			arr.set(y+1, arr.get(y));
			y = y-1;
		}
		arr.set(y+1, key);
	}
	return(arr);
}

public static void printValuesInt(ArrayList<Integer> arr){
		for(int i = 0; i < arr.size(); i++){
			System.out.print(arr.get(i) + ", ");
			
		}
}
}