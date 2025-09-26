package dag_11.inheritance_demo.pack1;

import dag_11.inheritance_demo.pack2.Admin;
import dag_11.inheritance_demo.pack2.Designer;
import dag_11.inheritance_demo.pack2.Employee;
import dag_11.inheritance_demo.pack2.Programmer;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.ArrayList;
import java.util.Random;

public class Application {
	public void run() {
		ArrayList<Employee> employees = new ArrayList<>();
		employees.add(new Admin());
		employees.add(new Programmer());
		employees.add(new Designer());

		employees.add(new Admin());
		employees.add(new Programmer());
		employees.add(new Designer());

		for (var employee : employees) {
			Random rng = new Random();
			StringBuilder s = new StringBuilder();
			s.append((char) rng.nextInt(65, 65 + 25));
			for (int i = 0; i < 3 + rng.nextInt() * 12; i++) {
				s.append((char) rng.nextInt(65 + 32, 65 + 25 + 32));
			}
			employee.setName(s.toString());
			employee.setSalary(rng.nextDouble() * 20000);
		}
		System.out.println(employees.getLast());
	}
}
