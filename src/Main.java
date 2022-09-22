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

//	4. Рекурсивный вывод чисел
//
//	Даны два целых числа A и В. Выведите все числа от A до B включительно, в порядке возрастания, если A < B, или в порядке убывания в противном случае. Использовать рекурсию.
//	5. Наследование Student, Aspirant
//
//	    Создайте пример наследования, реализуйте класс Student и класс Aspirant, аспирант отличается от студента наличием некой научной работы.
//	    Класс Student содержит переменные: String firstName, lastName, group. А также, double averageMark, содержащую среднюю оценку.
//	    Создать переменную типа Student, которая ссылается на объект типа Aspirant.
//	    Создать метод getScholarship() для класса Student, который возвращает сумму стипендии. Если средняя оценка студента равна 5, то сумма 100 грн, иначе 80. Переопределить этот метод в классе Aspirant.  Если средняя оценка аспиранта равна 5, то сумма 200 грн, иначе 180.
//	    Создать массив типа Student, содержащий объекты класса Student и Aspirant. Вызвать метод getScholarship() для каждого элемента массива. Смотрите решение задачи в видео 1, видео 2.

}
