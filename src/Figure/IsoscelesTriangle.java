package Figure;

public class IsoscelesTriangle extends Figure {

	double base;
	double heigth;

	public IsoscelesTriangle(double base, double heigth) {
		this.base = base;
		this.base = heigth;
	}

	@Override
	public void getArea() {
		System.out.println("the area of an isosceles triangle is " + this.base * this.base * 0.5);
	}

	@Override
	public void getPerimetr() {
		System.out.println("the area of an isosceles triangle is "
				+ (Math.sqrt(this.base + this.base) + this.base + this.base) * 2);
	}

}
