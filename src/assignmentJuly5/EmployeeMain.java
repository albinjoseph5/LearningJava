package assignmentJuly5;

public class EmployeeMain {

	public static void main(String[] args) {
		double highestSalary = 0;
		double lowestSalary = 0;
		int x = 0;
		int y = 0;
		PermanentEmployees qo = new PermanentEmployees("Qo", "Q", 989122);
		qo.setSalary(120000);
//		PermanentEmployees wo = new PermanentEmployees("WO", "W", 7877878);
//		wo.setSalary(100000);
//		PermanentEmployees eo = new PermanentEmployees("EO", "E", 7877232);
//		eo.setSalary(80000);
//		PermanentEmployees ro = new PermanentEmployees("RO", "R", 4567232);
//		ro.setSalary(70000);
		ContractualEmployees to = new ContractualEmployees("To", "T", 49346923, 50);
		to.setSalary(40);
//		ContractualEmployees yo = new ContractualEmployees("Yo", "Y", 49388923, 35);
//		yo.setSalary(30);
//		ContractualEmployees uo = new ContractualEmployees("Uo", "U", 48866923, 35);
//		uo.setSalary(20);
		CommisionBasedEmployees io = new CommisionBasedEmployees("IO", "I", 1772811, 20000);
		io.setSalary(50000);
//		CommisionBasedEmployees po = new CommisionBasedEmployees("PO", "P", 4554511, 30000);
//		po.setSalary(45000);
//		CommisionBasedEmployees so = new CommisionBasedEmployees("SO", "S", 2154511, 40000);
//		so.setSalary(80000);
		// Employee[] employees = { qo, wo, eo, ro, to, yo, uo, io, po, so };
		Employee[] employees = { qo, to, io, };
		for (int i = 0; i < employees.length; i++) {
			employees[i].calculatePay();
		}
		highestSalary = employees[0].getBiweeklySalary();
		lowestSalary = employees[0].getBiweeklySalary();
		for (int i = 0; i < employees.length; i++) {
//			System.out.println(employees[i].biweeklySalary);
			if (highestSalary < employees[i].getBiweeklySalary()) {
				highestSalary = employees[i].getBiweeklySalary();
				x = i;
			}
			if (lowestSalary > employees[i].getBiweeklySalary()) {
				lowestSalary = employees[i].getBiweeklySalary();
				y = i;
			}

		}

		System.out.println("Highest Salary : " + highestSalary);
		System.out.println("Name of the employee with highest salary : " + employees[x].getFirstName() + " "
				+ employees[x].getLastName());
		System.out.println("Lowest Salary : " + lowestSalary);
		System.out.println("Name of the employee with lowest salary : " + employees[y].getFirstName() + " "
				+ employees[y].getLastName());
	}

}
