package io.github.Moemoe03.SOLID;

public class SizeCondition implements Condition<Product> {

	private Size size;
	
	public SizeCondition(Size size) {
		this.size = size;
	}
	
	@Override
	public boolean isMatched(Product item) {
		// TODO Auto-generated method stub
		return item.getSize()==this.size;
	}

}
