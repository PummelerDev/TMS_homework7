import java.util.Date;

import Documents.DeliveryContract;
import Documents.Document;
import Documents.EmployeeContract;
import Documents.FinancialInvoice;
import Documents.Register;
import Figure.Circle;
import Figure.Figure;
import Figure.IsoscelesTriangle;
import Figure.Rectangle;
import Position.Accountant;
import Position.Director;
import Position.Position;
import Position.Worker;

public class Main {

	public static void main(String[] args) {

//		
//		Figure task

		Figure[] figure = new Figure[] { new Rectangle(2, 2), new Circle(5), new IsoscelesTriangle(2, 4),
				new Rectangle(4, 2), new Circle(6), new IsoscelesTriangle(4, 5) };
		for (int i = 0; i < figure.length; i++) {
			figure[i].getArea();
			figure[i].getPerimetr();
			System.out.println();
		}

//		
//		Position task

		new Director().printPosition();
		new Worker().printPosition();
		new Accountant().printPosition();
		Position boss = new Director();
		boss.printPosition();

//		
//		Accounting of documents task

//		Document[] reg = new Document[10];

		Document delivContr = new DeliveryContract(345, "SilverSword", 750);
		Document emplContr = new EmployeeContract(771, "Geralt of Rivia", "5 years");
		Document finacialInvoice = new FinancialInvoice(234, 263942, 11);

		Register.addDocument(0, delivContr);
		Register.addDocument(1, emplContr);
		Register.addDocument(2, finacialInvoice);
		
		delivContr.print();
		
		Register.printInfo();
		
		

//		
//		Recursion task

//		System.out.println(Recursion.outputNubers(10,20));
		Recursion.outputNubers(5, 20);

	}

//	4. ����������� ����� �����
//
//	���� ��� ����� ����� A � �. �������� ��� ����� �� A �� B ������������, � ������� �����������, ���� A < B, ��� � ������� �������� � ��������� ������. ������������ ��������.
//	5. ������������ Student, Aspirant
//
//	    �������� ������ ������������, ���������� ����� Student � ����� Aspirant, �������� ���������� �� �������� �������� ����� ������� ������.
//	    ����� Student �������� ����������: String firstName, lastName, group. � �����, double averageMark, ���������� ������� ������.
//	    ������� ���������� ���� Student, ������� ��������� �� ������ ���� Aspirant.
//	    ������� ����� getScholarship() ��� ������ Student, ������� ���������� ����� ���������. ���� ������� ������ �������� ����� 5, �� ����� 100 ���, ����� 80. �������������� ���� ����� � ������ Aspirant.  ���� ������� ������ ��������� ����� 5, �� ����� 200 ���, ����� 180.
//	    ������� ������ ���� Student, ���������� ������� ������ Student � Aspirant. ������� ����� getScholarship() ��� ������� �������� �������. �������� ������� ������ � ����� 1, ����� 2.

}
