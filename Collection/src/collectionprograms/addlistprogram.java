package collectionprograms;
import java.util.*;
class addlistprogram
{
  public static void main(String args[])
  {
    //type your code here
    Scanner s=new Scanner(System.in);
    //int n=s.nextInt();
    ArrayList<String> list=new ArrayList<String>();
    list.add("Haii");//add string
    list.add("hello");
    list.add("Welcome");
    ArrayList<String> list1=new ArrayList<String>();
      list1.add("Java");
      list.add("program");
      list.addAll(list1);
      System.out.println(list);
      //list.remove(0);//to remove the 0th index
      Iterator itr1=list.iterator();
    while(itr1.hasNext())
    {
      System.out.println(itr1.next());
  
    }
      
    }
  }

