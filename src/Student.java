
public class Student {
	String firstName, lastName, group;
	double averageMark;

	public double getScholarship() {
		if (averageMark == 5)
			return 100;
		else
			return 80;
	}

}
