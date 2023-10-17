package newProject;

import java.util.HashMap;
import java.util.Map;


public class dictionarypractise {

	public static void main(String[] args) {
		// English to Spanish Dictionary
		
		Map<String,String> englSpandictionary = new HashMap<String,String>();
		// Putting things inside our dictionary
		englSpandictionary.put("Monday" ,"Lunus" );
		englSpandictionary.put("Tuesday" , "Martes");
		englSpandictionary.put("Wednesday" , "Miércoles");
		englSpandictionary.put("Thursday", "Jueves");
		englSpandictionary.put("Friday", "Viernes");
		englSpandictionary.put("Saturday", "sábado");
		englSpandictionary.put("Sunday", "Domingo");
		englSpandictionary.put("all days", "todos los días");
		// Retrieve things in our dictionary
		
		System.out.println(englSpandictionary.get("Monday"));
		System.out.println(englSpandictionary.get("Tuesday"));
		System.out.println(englSpandictionary.get("Wednesday"));
		System.out.println(englSpandictionary.get("Thursday"));
		System.out.println(englSpandictionary.get("Friday"));
		System.out.println(englSpandictionary.get("Saturday"));
		System.out.println(englSpandictionary.get("Sunday"));
		
		
		// Print out all keys
		System.out.println(englSpandictionary.keySet());
		// Print out all values
		System.out.println(englSpandictionary.values());
		// Print out  Size
		System.out.println("The Size of our dictionary " + englSpandictionary.size());
		
		
		System.out.println();
		System.out.println();
		
		// Shopping List
		
		
		Map<String,Boolean> shoppinglist = new HashMap<String,Boolean>();
		
		// Putting some stuff in dictionary
		shoppinglist.put("Chocolate", true);
		shoppinglist.put("Candy", Boolean.TRUE);
		shoppinglist.put("Ice Creams", Boolean.TRUE);
		shoppinglist.put("Bread", Boolean.FALSE);
		shoppinglist.put("Nuts", false);
		
		// Retrieve Items
		System.out.println(shoppinglist.get("Candy"));
        System.out.println(shoppinglist.get("Nuts"));
        System.out.println(shoppinglist.get("Chocolate"));
        
        // key-Value pair printout
        System.out.println(shoppinglist.toString());
        
        // Is Empty?
        System.out.println(shoppinglist.isEmpty());
        
        // removing the Nuts 
        shoppinglist.remove("Nuts");
        
        // Replace values certain things
        shoppinglist.replace("Bread", true);
        
        // key-Value pair printout
        System.out.println(shoppinglist.toString());
        
        
        // clear our dictionary
        
        shoppinglist.clear();
        
        System.out.println(shoppinglist.toString());
        // Is Empty?
        System.out.println(shoppinglist.isEmpty());
        
       	
     }

}
