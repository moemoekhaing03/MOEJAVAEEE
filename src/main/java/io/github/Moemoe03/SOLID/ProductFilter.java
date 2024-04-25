package io.github.Moemoe03.SOLID;

import java.util.List;

public class ProductFilter implements Filter<Product> {

	@Override
	public void filter(List<Product> items, Condition<Product> item) {
		// TODO Auto-generated method stub
		for(Product out: items) {
			if (item.isMatched(out)) 
				System.out.println(out.getName());
		}
	}
}
