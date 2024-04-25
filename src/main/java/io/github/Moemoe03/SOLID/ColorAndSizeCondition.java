package io.github.Moemoe03.SOLID;

public class ColorAndSizeCondition implements Condition<Product>{
     private Color color;
     private Size size;
     ColorAndSizeCondition(Color color, Size size) {
    	 this.color = color;
    	 this.size = size;
     }
	@Override
	public boolean isMatched(Product item) {
		// TODO Auto-generated method stub
		return item.getColor()== color && item.getSize()==size;
	}

}
