package abstraction;

public class Example1 {

	public static void main(String[] args) {
	System.out.println("abstraction");
	extendedregularclass r=new extendedregularclass();
	r.add(4, 5);
	r.regularmethod();


	}

}
 abstract class abstractclass{
	 public abstract int add(int a,int b);
	 public void regularmethod() {
		 System.out.println("not a abstract method");
	 }
 }
 class regularclass extends abstractclass{
	 public int add(int a,int b) {
		return a+b;
		 
	 }
	 }
 class extendedregularclass extends regularclass{
	 public void extendedregularmethod() {
		 System.out.println("extended regular class");
	 }
 }
 