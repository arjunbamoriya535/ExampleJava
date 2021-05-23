package s;


import java.util.*;
import java.lang.*;
public class Test2 {
    // DO NOT write a main method
public static void main(String[] args) {
	Map<String,Integer> list=new TreeMap<String,Integer>();
	list.put("Cup",10);
	list.put("Plate",15);
	list.put(" Plate",5);
	System.out.print(productValues((list));
}
    public static String productValues(Map<String, Integer> list) {
        Map<String,Integer> invCountByCode = new TreeMap<String,Integer>();
        StringBuffer  result = new StringBuffer ();
        
        for (Inventory item : list)
        {
            if(!invCountByCode.containsKey(item.product))
            {
                invCountByCode.put(item.product, 0);
            }
            
            Integer prevLevel = invCountByCode.get(item.product);
            
            invCountByCode.put(item.product,prevLevel + item.qty);
        }

        for (String prodId : invCountByCode.keySet ())
        {
            result.append(prodId).append (",").append(invCountByCode.get(prodId));
        }
        
        return result.toString();
    }
    
    
    public static class Inventory {
        public String   product;
        public int      qty;

        public Inventory(String product, int qty) {
            this.product = product;
            this.qty = qty;
        }

        
        @Override
        public String toString() {
            return product +"," + qty;
        }
    }
}
