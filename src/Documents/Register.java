
package Documents;

public class Register {
	public static Document[] reg = new Document[10];

	public static void addDocument(int n, Document doc) {
		reg[n] = doc;
	}

	public static void printInfo() {
		for (int i = 0; i < reg.length; i++) {
			if(reg[i]==null)
				return;
			reg[i].print();
		}
	}

}
