class Bank
{
	double account = 1000d;

	
		public void deposit(int a, int w)
		{
			double totalAmount= account+a;
			System.out.println("After deposit: " +totalAmount);
			
			double withdraw = totalAmount- w;
		    System.out.println("After withdraw: " +withdraw);
		}
		
		public static void total()
		{
			int accountBalance = 5000-2000;
			System.out.println("Account Balance: " +accountBalance);
		}
		
		public static void main(String args[])
		{
			Bank obj1 = new Bank();
			System.out.println("Account Balance: "+obj1.account);
			obj1.deposit(4000,2000);
			Bank.total();
	
		}
}