package collectionprograms;
import java.util.HashSet;
import java.util.*;
public class hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		HashSet<String> set=new HashSet<String>();
		set.add("Thomman");
		set.add("Anna");
		set.add("Unni");
		set.add("Jomy");
		set.add("Justin");
		set.add("Jickson");
		set.add("Albin");
		set.add("Thomman");
		set.add("jeswin");
		set.add("Jomy");
		Iterator<String> itr=set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		

	}

}
