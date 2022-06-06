package pkg;
import java.util.ArrayList;


public class OnlinePurchaseManager
{
   
   private ArrayList<String> purchases = new ArrayList <String>();
   private ArrayList<Boolean> electronic = new ArrayList<Boolean>();
   private ArrayList<Double> price = new ArrayList<Double>();
   

   
   public String getCheapestGizmoByMaker(String mkr){
      ArrayList<Integer> arr = new ArrayList<Integer>();
      
      for(int x = 0; x < purchases.size(); x++){
         if(purchases.get(x).equals(mkr)){
            arr.add(x);
         }
      }
      
      ArrayList<Double> values = new ArrayList<Double>();

      for(int x = 0; x < arr.size(); x++){
         values.add(price.get(arr.get(x)));
   	
   }
      double min = values.get(0);
      int z = values.size();
      
      if(values.size() == 1){
      }
      else{
         for(int x = 1; x < z; x++){
            if(values.get(x) < min){
               min = values.get(x);
            }
         }
      }
      int placement = price.indexOf(min);
    	String finalized = purchases.get(arr) + " " + electronic.get(arr) + " " + min;
   	return finalized;
   }
      
   
   public String toString() {
		String y = "[";
	
	    for (int x = 0; x < purchases.size(); x ++) {
	    	if (x != purchases.size()) {
	    		y = y + purchases.get(x) + " " + electronic.get(x) + " " + price.get(x) + ", ";
	    	} else {
	    		y = y + purchases.get(x) + " " + electronic.get(x) + " " + price.get(x) + "]";
	    	}	
	    }
	    return y;
   }

   public void add(String a, Boolean b, Double c){
      purchases.add(a);
      electronic.add(b);
      price.add(c);
   }
   
   public Integer countElectronicsByMaker(String mkr){
      ArrayList<Integer> arr = new ArrayList<Integer>();
      
      for(int x = 0; x < purchases.size(); x++){
         if(purchases.get(x).equals(mkr)){
            arr.add(x);
         }
      }
      int num = 0;
      
      for(int x = 0; x < arr.size(); x++){
         int j  = arr.get(x);
         if(electronic.get(c).equals(true)){
            num = (num + 1);
         }
      }
      return num;
   }
   
   public Boolean hasAdjacentEqualPair(){
      int start = 0;
      
      while(start != purchases.size() - 1){
         if (price.get(start) == price.get(start + 1)) {
				if(purchases.get(start) == purchases.get(start + 1)) {
					if(electronic.get(start) == electronic.get(start + 1)) {
						return true; 
					}
				} 
			}
			
			
			
			start = start + 1;
		}
		
		
		
		return false;
	}
}
	

   
   
