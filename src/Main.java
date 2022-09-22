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
//		***********
//		Figure task

		Figure[] figure = new Figure[] { new Rectangle(2, 2), new Circle(5), new IsoscelesTriangle(2, 4),
				new Rectangle(4, 2), new Circle(6), new IsoscelesTriangle(4, 5) };
		for (int i = 0; i < figure.length; i++) {
			figure[i].getArea();
			figure[i].getPerimetr();
			System.out.println();
		}

//
//		*************
//		Position task

		new Director().printPosition();
		new Worker().printPosition();
		new Accountant().printPosition();
		Position boss = new Director();
		boss.printPosition();

//		
//		****************************
//		Accounting of documents task

		Document delivContr = new DeliveryContract(345, "SilverSword", 750);
		Document emplContr = new EmployeeContract(771, "Geralt of Rivia", "5 years");
		Document finacialInvoice = new FinancialInvoice(234, 263942, 11);

		Register.addDocument(0, delivContr);
		Register.addDocument(1, emplContr);
		Register.addDocument(2, finacialInvoice);

		delivContr.print();

		Register.printInfo();

//
//		**************
//		Recursion task

//		System.out.println(Recursion.outputNubers(10,20));
		Recursion.outputNubers(5, 20);

		System.out.println();
//		
//		*************
//		Students task

		Student bob = new Student();
		bob.averageMark=4;
		Student bill = new Aspirant();
		bill.averageMark=4;
		Student bob1 = new Student();
		bob1.averageMark=5;
		Student bill1 = new Aspirant();
		bill1.averageMark=5;
		Student bob2 = new Student();
		bob2.averageMark=3;
		Student bill2 = new Aspirant();
		bill2.averageMark=5;
		Student[] studList = new Student[] { bob, bill, bob1, bill1, bob2, bill2 };
		for (int i = 0; i < studList.length; i++) {
			System.out.println(studList[i].getScholarship());
		}
		
	}
}
