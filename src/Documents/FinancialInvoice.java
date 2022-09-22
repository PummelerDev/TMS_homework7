package Documents;

import java.util.Date;

public class FinancialInvoice extends Document {

	public FinancialInvoice() {

	}

	{
		this.date = new Date();
	}

	public FinancialInvoice(int docNumber, double totalAmountMonth, int departmentCode) {
		this.docNumber = docNumber;
		this.totalAmountMonth = totalAmountMonth;
		this.departmentCode = departmentCode;
		this.date = new Date();

	}

	public void print() {
		System.out.println("docNumber " + docNumber);
		System.out.println("date " + date);
		System.out.println("totalAmountMonth " + totalAmountMonth);
		System.out.println("departmentCode " + departmentCode);
		System.out.println();
	}

	int docNumber;
	Date date;
	double totalAmountMonth;
	int departmentCode;

}
