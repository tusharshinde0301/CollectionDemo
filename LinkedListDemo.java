package collectiondemo;
import java.util.*;
public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> ls=new LinkedList<>();
		ls.add(12);
		ls.add(12);             //maintain insertion order
		ls.add(null);           //allow duplicate vale
		ls.add(null);           //allow multiple null values
		ls.add(20);
		ls.add(14);
		System.out.println(ls);

	}

}
