package io.github.Moemoe03.SOLID;

public  class ColorCondition implements Condition<Product> {

	private Color color;
	
	public ColorCondition(Color color) {
		this.color = color;
	}
	
	@Override
	public boolean isMatched(Product item) {
		// TODO Auto-generated method stub
		return item.getColor()==this.color;
	}

}
