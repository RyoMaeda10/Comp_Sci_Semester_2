import pkg.*;
import java.util.Scanner;
import java.util.Random;
import java.util.*;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		addValuesInt(arr1, 100);
		printValuesInt(arr1);
		insertionSort(arr1);			//Create this method
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
	public static void insertionSort(ArrayList<Integer>arr){
	int x, y, key;
	for(x = 1; x < arr.size(); x++){
		key = arr.get(x);
		y = x-1;
		
		while(y >= 0 && arr.get(y) > key){
			arr.set(y+1, arr.get(y));
			y = y-1;
		}
		arr.set(y+1, key);
	}
}
}
