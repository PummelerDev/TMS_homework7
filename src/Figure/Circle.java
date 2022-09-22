package Figure;

public class Circle extends Figure {

	double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public void getArea() {
		System.out.println("the area of a circle is " + radius * radius * 3.1415);
	}

	@Override
	public void getPerimetr() {
		System.out.println("the circumference is " + radius * 2 * 3.1415);
	}
}
