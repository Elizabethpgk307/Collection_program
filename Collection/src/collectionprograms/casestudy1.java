package collectionprograms;
import java.util.*;
public class casestudy1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		ArrayList list=new ArrayList();
		System.out.println("Enter the size:");
		int n=s.nextInt();
		Customer cus[]=new Customer[n];
		
		for(int i=0;i<n;i++)
		{
		System.out.println("Enter the name:");
		String name=s.next();
		System.out.println("Enter the address:");
		String address=s.next();
		System.out.println("Enter the contact number:");
		int number=s.nextInt();
		System.out.println("Enter the email-Id");
		String email=s.next();
		System.out.println("Enter proof type:");
		String proof=s.next();
		System.out.println("Enter the proof Id:");
		int id=s.nextInt();
		cus[i]=new Customer();
		cus[i].setName(name);
		cus[i].setAddress(address);
		cus[i].setNumber(number);
		cus[i].setEmail(email);
		cus[i].setProof(proof);
		cus[i].setId(id);
		
		System.out.println("Thank you for registering.your id is 1..");
//		System.out.println("Do you want to continue:(yes/no)");
//		String option=s.next();
//		String str=option.toLowerCase();
//		if(option.equals("yes"))
//		{
			System.out.println("Do you want to update the email-id:(yes/no)");
			String option1=s.next();
			String str1=option1.toLowerCase();
			if(str1.equals("yes"))
			{
				System.out.println("Update the email-id");
				//System.out.println("Enter a valid email id:");
				String mail1=s.next();
				cus[i].setEmail(mail1);
				cus[i].setName(name);
				cus[i].setAddress(address);
				cus[i].setNumber(number);
				cus[i].setEmail(email);
				cus[i].setProof(proof);
				cus[i].setId(id);

			}
			else
			{
			cus[i].setName(name);
			cus[i].setAddress(address);
			cus[i].setNumber(number);
			cus[i].setEmail(email);
			cus[i].setProof(proof);
			cus[i].setId(id);
			}
				list.add(cus[i]);
		}
		Iterator<Customer> itr=list.iterator();
		int j=0;
		while(itr.hasNext())
		{
			Customer c=itr.next();
			System.out.println("Id "  +j);
			System.out.println("*************************************");
		    System.out.println("Name----------------->"+c.getName());
//			System.out.println("Address-------------->"+c.getAddress());
//			System.out.println("Contact Number------->"+c.getNumber());
//			System.out.println("Email-Id------------->"+c.getEmail());
//			System.out.println("Proof Type----------->"+proof);
//			System.out.println("Proof Id------------->"+id);
			j++;
			
			
		}
		System.out.println("Do you want to delete any id:(yes/no)");
		String option2=s.next();
		if(option2.equals("yes"))
		{
		 System.out.println("which index want ro be removed:");
		 int index=s.nextInt();
		 list.remove(index);
		}
		Iterator<Customer> itr1=list.iterator();
		int k=1;
		while(itr1.hasNext())
		{
			Customer c=itr1.next();
			System.out.println("Customer Details"  +k);
			System.out.println("*************************************");
			System.out.println("Name----------------->"+c.getName());
			System.out.println("Address-------------->"+c.getAddress());
			System.out.println("Contact Number------->"+c.getNumber());
			System.out.println("Email-Id------------->"+c.getEmail());
			System.out.println("Proof Type----------->"+c.getProof());
			System.out.println("Proof Id------------->"+c.getId());
			k++;
			
			
		}
		
		

	}
}
