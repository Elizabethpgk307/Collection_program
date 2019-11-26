package collectionprograms;
import java.util.LinkedList;
import java.util.Scanner;
public class linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size:");
		int n=s.nextInt();
		LinkedList<String> list=new LinkedList<String>();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the brand name:");
			String brandname=s.next();
			list.add(brandname);
			System.out.println("Enter the item:");
			String item=s.next();
			list.add(item);
			System.out.println("Enter the size:");
			String size=s.next();
			list.add(size);
			System.out.println("Enter the color:");
			String color=s.next();
			list.add(color);
			System.out.println("Enter the amount:");
			String amount=s.next();
			list.add(amount);	
		}
		list.addFirst("Details:");
		System.out.println(list);
		System.out.println("Size of the list: "+list.size());
		System.out.println("List is: "+list.isEmpty());

	}

}
