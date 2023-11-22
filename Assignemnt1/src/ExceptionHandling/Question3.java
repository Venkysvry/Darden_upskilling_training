package ExceptionHandling;

public class Question3 {

	public static void main(String[] args) {
		Model m=new Model(12,1000);
		try {
		m.withdraw(-1);
		}catch (InsufficientBalanceException e) {
			System.out.println(e);
		}catch (IllegalTransactionException e) {
			System.out.println(e);
		}
		
	}

}
 class Model{
	 private long id;
	 private double balance;
	 
	public Model() {
		
	}
	public Model(long id, double balance) {
		super();
		this.id = id;
		this.balance = balance;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double withdraw(double amount) {
		if(amount>balance) {
			throw new InsufficientBalanceException("insufficient balance");
			 
		}
		else if(amount<0) {
			throw new IllegalTransactionException("enter the positve value");
		}
		return amount;		 
	 }
	public double deposit(double amount) {
		
		return amount;}
	 
 }