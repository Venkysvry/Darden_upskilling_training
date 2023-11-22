package interfaceconcept;

public class MultipleInheritance {

	public static void main(String[] args) {
		z z1=new z();
		z1.withdraw();
		z1.deposit();
	}

}

interface x{
	void withdraw();
	void printx();
}
interface y{
	void deposit();
	void printx();
}
interface w extends x,y{
	
}
 class z implements w{

	@Override
	public void deposit() {
		System.out.println("deposit method");
		
	}

	@Override
	public void withdraw() {
		System.out.println("withdraw method");
		
	}

	@Override
	public void printx() {
		System.out.println("printmethod");
		
	}
	 
 }