
public class Aspirant extends Student {
	String scientificWork;
	
	@Override
	public double getScholarship() {
		if (averageMark == 5)
			return 200;
		else
			return 180;
	}

}
