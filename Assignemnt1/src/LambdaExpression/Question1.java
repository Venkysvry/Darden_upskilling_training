package LambdaExpression;

import java.util.ArrayList;

public class Question1 {

	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList();
		a.add(1);
		a.add(2);
		a.add(3);
		a.forEach(n->{
			if(n%2==0)
				System.out.println(n);
		});

	}

}
