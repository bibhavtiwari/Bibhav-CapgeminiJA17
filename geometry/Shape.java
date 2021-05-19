package geometry;

public class Shape {
	
	String color;
	boolean filled;
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public boolean isFilled() {
		return filled;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	
	public String toString() {
		return "Shape[color="+this.color+",filled="+this.filled+"]";
	}
	

}
