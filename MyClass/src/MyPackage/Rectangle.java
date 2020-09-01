package MyPackage;

public class Rectangle implements CloseShape {
	private float lenght,width;
	

	public Rectangle(float lenght, float width) {
		this.lenght = lenght;
		this.width = width;
	}
	

	public Rectangle() {
		this(0,0);
	}


	@Override
	public float getPerimeter() {
		return 2*( lenght + width);
	}

	@Override
	public float getArea() {
		return lenght*width;
	}


	public float getLenght() {
		return lenght;
	}


	public void setLenght(float lenght) {
		this.lenght = lenght;
	}


	public float getWidth() {
		return width;
	}


	public void setWidth(float width) {
		this.width = width;
	}

}
