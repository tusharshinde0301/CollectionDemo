package collectiondemo;
import java.util.*;
public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	ArrayList<Integer> al=new ArrayList<>();
		al.add(10);
		al.add(12);
		al.add(16);
		al.add(15);
		al.add(10);                         
		al.add(null);
		al.add(null);
		System.out.println(al);
		ArrayList<Integer> al2=new ArrayList<>();
		al2.add(30);
		al2.add(40);
		al2.add(50);*/
		//al.addAll(al2);
		/*System.out.println(al);
		System.out.println(al.equals(al2));
		System.out.println(al2);*/
		//System.out.println(al.isEmpty());
		//System.out.println(al.contains(100));
		//al.clear();
		//al.set(2, 50);
		//System.out.println(al.size());
		//System.out.println(al.get(2));
		
		/*ArrayList<String> al=new ArrayList<>();
		al.add("Tushar");
		al.add("Rahul");
		al.add(null);
		al.add(null);
		//al.add(12, "addd");
		System.out.println(al);*/
		
		//in ArrayList 1)Maintain insertion order
       //              2)allow duplicate values,allow multiple null values
		
		
     // Wap to find the entered employees is present in list of empnames or not
		
		/*ArrayList<String> al=new ArrayList<>();
		al.add("Tushar");
		al.add("Shubham");
		al.add("Pranay");
		al.add("Swapnil");
		
		Scanner S=new Scanner(System.in);
		System.out.println("Enter name: ");
		String str = S.nextLine();
		ListIterator ir=al.listIterator();
		while(ir.hasNext())
		{
			if(ir.next().equals(str))
			{
				System.out.println("name present in arraylist");
			}
			else
			{
				System.out.println("name is not present in arraylist");
			}
		}*/
		
		//square of arrayList
				ArrayList<Integer> al1=new ArrayList<>();
				al1.add(12);
				al1.add(15);
				al1.add(20);
				
				int sqr;
				for(Integer a:al1)
				{
					sqr=a*a;
					System.out.println(sqr);
				}
		
	}

}
