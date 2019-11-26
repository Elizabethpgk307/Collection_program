package collectionprograms;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size:");
		int n=s.nextInt();
		ArrayList list=new ArrayList();//Array list class declaration
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the Name:");
			String name=s.next();
			System.out.println("Enter the age:");
			int age=s.nextInt();
			list.add(name);//add method
			list.add(age);
		}
		ArrayList list1=(ArrayList) 
				list.clone();//used to take the copy
		System.out.println("Clone value"+list1.get(0));
		//System.out.println(list.get(0));
		
		//list.remove(0);//to remove the string
		//System.out.println(list.get(0));
		System.out.println("List one values");
		Iterator itr=list.iterator();//used to traverse a elements one by one
		System.out.println("Enter the updated name:");
		String name1=s.next();
		list.set(0,name1);
		list.clear();
		list.removeAll(list);
		while(itr.hasNext())//boolean hasNext();Returns true if the iteration has more element.
		{
			System.out.println(itr.next());
			
			
		}
		

	}

}
