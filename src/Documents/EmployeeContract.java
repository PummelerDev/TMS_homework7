package Documents;

import java.util.Date;

public class EmployeeContract extends Document {

	public EmployeeContract() {

	}

	{
		this.date = new Date();
	}

	public EmployeeContract(int docNumber, String name, String term) {
		this.docNumber = docNumber;
		this.name = name;
		this.term = term;
		this.date = new Date();

	}

	public void print() {
		System.out.println("docNumber " + docNumber);
		System.out.println("date " + date);
		System.out.println("name " + name);
		System.out.println("term " + term);
		System.out.println();
	}

	int docNumber;
	Date date;
	String name;
	String term;

}
