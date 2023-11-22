package ExceptionHandling;
import java.util.*;
public class Question1 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);	
int n1=sc.nextInt();
int n2=sc.nextInt();
try {
	int n3=n1/n2;
	System.out.println(n3);
}catch (ArithmeticException e) {
	System.out.println(e);
}
	}

}
