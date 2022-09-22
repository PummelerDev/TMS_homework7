package Figure;

public class Rectangle extends Figure {

	double heigth;
	double width;

	public Rectangle(double heigth, double width) {
		this.heigth = heigth;
		this.width = width;
	}

	@Override
	public void getArea() {
		System.out.println("the area of a rectangle is " + this.heigth * this.width);
	}

	@Override
	public void getPerimetr() {
		System.out.println("the perimetr of a rectangle is " + (this.heigth + this.width) * 2);
	}

}
