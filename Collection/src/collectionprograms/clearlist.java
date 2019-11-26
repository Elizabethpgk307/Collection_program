package collectionprograms;
import java.util.*;
public class clearlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner s=new Scanner(System.in);
     ArrayList<String> list1=new ArrayList<String>();//list 1 will be created 
     
     list1.add("Anna");
     list1.add("jiby");
     list1.add("liza");
     list1.add("unni");
     
     ArrayList<String> list2=new ArrayList<String>();//list 2 will be created
     
     list2.add("Anitta");
     list2.add("bbbb");
     list2.add("ccc");
     
     list2.clear();//list 2 will be deleted
     System.out.println("List 2 is deleted");
     Iterator itr1=list1.iterator();//reference
     while(itr1.hasNext())
     {
       System.out.println(itr1.next());
   
     }
     
	}

}
