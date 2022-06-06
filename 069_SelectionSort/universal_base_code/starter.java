import pkg.*;
import java.util.Scanner;
import java.util.Random;
import java.util.*;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		addValuesInt(arr1, 100);
		printValuesInt(arr1);
		selectionSort(arr1);			//Create this method
		System.out.println();
		System.out.println();
		printValuesInt(arr1);
		
		
	}

	public static void addValuesInt(ArrayList<Integer> arr, int num){
		for(int i = 0; i < num; i++){
			arr.add(new Integer((int)(Math.random()*10)));
		}
	}
	public static void printValuesInt(ArrayList<Integer> arr){
		for(int i = 0; i < arr.size(); i++){
			System.out.print(arr.get(i) + ", ");
		}
	}
	public static void selectionSort(ArrayList<Integer> arr){
		int x;
		int y;
		int min_index;
		int temp;
		for(x = 0; x < arr.size(); x++){
			min_index = x;
			for(y = x + 1; y < arr.size(); y++){
				if(arr.get(y) < arr.get(min_index)){
					min_index = y;
				}
			}
				temp = arr.get(x);
				arr.set(x, arr.get(min_index));
				arr.set(min_index, temp);
		}
	}
}
