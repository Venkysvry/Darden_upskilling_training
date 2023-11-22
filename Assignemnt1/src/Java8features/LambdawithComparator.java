package Java8features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

//import java.util.stream.*;
public class LambdawithComparator {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
		list.add(new Product(1, "mobile", 10));
		list.add(new Product(2, "mobile", 100));
		list.add(new Product(3, "headphones", 1000));
		list.add(new Product(4, "laptop", 200));

		// sorting on the basis of name
		Collections.sort(list, (p1, p2) -> {
			return p1.name.compareTo(p2.name);
		});

		// sum the price
		int totalprice = list.stream().collect(Collectors.summingInt(p -> p.price));
		System.out.println(totalprice);

		// min() function
		Product min = list.stream().min((p1, p2) -> p1.price > p2.price ? 1 : -1).get();
		System.out.println(min.getPrice());

		// max()
		Product max = list.stream().max((p1, p2) -> p1.price > p2.price ? 1 : -1).get();
		System.out.println(max.getPrice());

		List<Integer> listprice = list.stream().filter((p) -> p.price > 10).map(p -> p.price)
				.collect(Collectors.toList());
		list.stream().filter(p -> p.name == "mobile").forEach(p -> System.out.println(p.name));
		for (Product x : list) {
			System.out.println(x.id + " " + x.name + " " + x.price);
		}
		System.out.println(listprice);

        //count function
		long count = list.stream().filter(p -> p.price < 1000).count();
		System.out.println(count);
        //convert list to set
		Set<String> set = list.stream().filter(p -> p.name == "mobile").map(p -> p.name).collect(Collectors.toSet());
		System.out.println(set);

        //convert list to map
		Map<Integer, String> map = list.stream().collect(Collectors.toMap(p -> p.id, p -> p.name));
	}
}

class Product {
	int id;
	String name;
	int price;

	public Product(int id, String name, int price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}