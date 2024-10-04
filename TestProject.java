//Ali Sarmad - 201370011 - TestProject
import java.util.ArrayList;
	public class TestProject{
		public static void main(String[] args) {
																				
		Customers cu = new Customers(11,"Ali","Toba","Iphone");
		CurrentAccount ca = new CurrentAccount(11,25000,"Sept 21 2021",5.0);	
		SavingsAccount sa = new SavingsAccount(11,10000,"Sept 16 2021",5000.0);
		Loan lo = new Loan(3,16000,"Augest 19 2021",6,8000);
		ArrayList<Account> a = new ArrayList<Account>();
		Account ac1 = new Account(10000,"Oct 31 2020",10);
		Account ac2 = new Account(20000,"Nov 31 2020",20);
		Account ac3 = new Account(30000,"Dec 31 2020",30);
		ArrayList<Branch> br = new ArrayList<Branch>();
		Branch br1 = new Branch(1028,"Gujranwala",a);
		Branch br2 = new Branch(2020,"Fasilabad",a);
		Bank ba = new Bank(18,"UBL Omni",br);

		System.out.println("Customer 1 :");
		cu.displayState();
		sa.addCustomers(cu);
		sa.displayState();
		ca.addCustomers(cu);
		ca.displayState();
		br1.addAccount(ac1);
		br2.addAccount(ac2);
		br1.addLoan(lo);
		lo.displayState();
		br1.displayState();
		ba.displayState();

	}//main

}//class