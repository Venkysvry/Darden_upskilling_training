package Java8features;

@FunctionalInterface
interface Drawable extends withdraw{
	//public void add() ;
	public String prints();
	   int hashCode();  
	    String toString();  
	    boolean equals(Object obj); 
}

public class Lambda {

	public static void main(String[] args) {
		Drawable l=()->{
		return "lambda expression with no paramter and return type";
	};
System.out.println(l.prints());
	}
}

interface withdraw{
	default void multiply() {}
}


