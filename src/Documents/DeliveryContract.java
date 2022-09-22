package Documents;

import java.util.Date;

public class DeliveryContract extends Document {

	public DeliveryContract() {
	}

	{
		this.date = new Date();
	}

	public DeliveryContract(int docNumber, String productType, int productQuantity) {
		this.docNumber = docNumber;
		this.productType = productType;
		this.productQuantity = productQuantity;
		this.date = new Date();

	}

	public void print() {
		System.out.println("docNumber " + docNumber);
		System.out.println("date " + date);
		System.out.println("productType " + productType);
		System.out.println("productQuantity " + productQuantity);
		System.out.println();
	}

	int docNumber;
	Date date;
	String productType;
	int productQuantity;

}
