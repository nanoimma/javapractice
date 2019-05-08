package day37_arraylist;
import java.util.*;
public class MeCities {
	public static void main(String[] args) {
		
		ArrayList<String> cities = new ArrayList<>();
		 cities.add("Bishkek");
		 cities.add("New York");
		 cities.add("Philadelphia");
		 cities.add("Marco Island");
		 cities.add("Miami");
		 cities.add("New Haven");
		 cities.add("San Francisco");
		 cities.add("Tysons");
		 
		 for(String city : cities) {
			 System.out.println(city + " ");
		 }
		 
		 for (int i = 0; i < cities.size(); i++) {
			 System.out.println(cities.get(i));
			 
			
			
		}
		 System.out.println(cities.isEmpty());
		 
		 cities.add(0, "Bishkek");
		 System.out.println(cities.toString());
		 
		 cities.set(2, "Seoul");
		 System.out.println(cities.toString());
		 
		 //find new haven in the list and give the index
		 int idx = cities.indexOf("New Haven");
		 System.out.println("New Haven index: " + idx);
		 
		 cities.set(6, "DC");
		 System.out.println(cities.toString());
		 
		 cities.clear();
		 boolean empty = cities.isEmpty();
		 System.out.println("Empty? -" + empty);
		 
	}

}
