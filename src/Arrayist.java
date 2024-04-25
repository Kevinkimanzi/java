
import java.util.ArrayList;

public class Arrayist {

	public static void main(String[] args) {
			
		// ArrayList = 	a resizable array. 
		//				Elements can be added and removed after compilation phase
		//				store reference data types
		
		ArrayList<String> food = new ArrayList<String>();
		
		food.add("pizza");
		food.add("hamburger");
		food.add("hotdog");
		
		food.set(0, "sushi"); //REPLACES INDEX 0
		//food.remove(2);  REMOVED INDEX 2
		//food.clear(); DELETES ARRAYLIST FOOD
		
		for(int i=0; i<food.size(); i++) {
			System.out.println(food.get(i));
		}
	}
}