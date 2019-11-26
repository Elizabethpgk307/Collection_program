package collectionprograms;
import java.util.*;
public class casestudy2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		Set<NewCard> s=new TreeSet<NewCard>(new Symbol());
		NewCard[] c=new NewCard[40];
		int n=sc.nextInt();
		int count = 0;
		while(s.size()<n)
		{
			String symbol=sc.next();
			int number=sc.nextInt();
			c[count]=new NewCard();
			c[count].setSymbol(symbol);
			c[count].setNumber(number);
			s.add(c[count]);
			count++;
			
		}
		System.out.println(n+ "symbols gathered in "+count+"cards.");
		System.out.println("Cards are:");
		Iterator<NewCard> itr=s.iterator();
		while(itr.hasNext()) {
			NewCard ca=(NewCard)itr.next();
			System.out.println(ca.getSymbol()+" "+ca.getNumber());
			
		}
		

	}

}
