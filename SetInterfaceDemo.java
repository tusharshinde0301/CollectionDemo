package collectiondemo;
import java.util.*;
public class SetInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*HashSet<Integer> hs=new HashSet<>();
		hs.add(10);
		hs.add(2);             //not maintain insertion order
		hs.add(null);          //no duplicate values
		hs.add(null);          //allow only one null value
		hs.add(12);            //Display random value order
		hs.add(2);
		System.out.println(hs);*/
		
		
		
		
	/*	LinkedHashSet<Integer> hs=new LinkedHashSet<>();
		hs.add(10);
		hs.add(2);             // maintain insertion order
		hs.add(null);          //no duplicate values
		hs.add(null);          //allow only one null value
		hs.add(12);            
		hs.add(2);
		System.out.println(hs);   */
		
		
		TreeSet<Integer> hs=new TreeSet<>();
		hs.add(10);
		hs.add(2);             //Display ascending order
		//hs.add(null);          //no duplicate  and null values
		///hs.add(null);          
		hs.add(12);           
		hs.add(2);
		System.out.println(hs);

	}

}
