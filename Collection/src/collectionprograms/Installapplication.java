package collectionprograms;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class Installapplication 
{
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int i;
	ArrayList list=new ArrayList();
    do {
    System.out.println("1)Display installed applications\n2)Install an application\n3)Uninstall an application\n4)Quit");
    int n=s.nextInt();
    switch(n)
    {

     case 1:
     {
        Iterator itr=list.iterator();
        if(list.isEmpty()) {
        System.out.println("There is no application installed");
     }
       else
       {
			int j=1;
			while(itr.hasNext()) {
			System.out.println(j+ " "+itr.next());
			j++;
			}
       }
     }
        break;
     case 2:
     {
          System.out.println("Enter the application:");
		  String application=s.next();
		  int flag=0;
		  list.add(application);
	}
     break;
	 case 3:
      {
		Iterator it=list.iterator();
		for(i=1;i<list.size();i++) {
		System.out.println(i+" "+it.next());
      }
		if(list.isEmpty())
        {
    	System.out.println("No application installed");
        }
       else
       {
		System.out.println("Enter the index of application to be removed:");
		int index=s.nextInt();
		list.remove(index);
	}
    }
     break;
     case 4:
     {
      System.out.println("Successfully Quit");
      System.exit(0);
      
     }
     
     break;
     
     default:
    	 System.out.println("Invalid Input");
     }
     }
while(true) ;

}
}



