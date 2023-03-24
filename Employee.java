package cycle2;

import java.util.*;

class Employee {

	int eNo;

	String eName;

	int eSalary;

	public void read() {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter ID : ");

		eNo = Integer.parseInt(sc.nextLine());

		System.out.print("Enter Name : ");

		eName = sc.nextLine();

		System.out.print("Enter monthly salary : ");

		eSalary = Integer.parseInt(sc.nextLine());

	}

	public String toString() {

		return "Name : " + eName +" Salary : "+eSalary;

	}

	public static void main(String[] args) {

		int i, n = 3;

		int No;

		Employee emp[] = new Employee[n];

		for (i = 0; i < n; i++) {

			emp[i] = new Employee();

			emp[i].read();

		}

		System.out.println("Search");

		while (true) {

			Scanner sc = new Scanner(System.in);

			System.out.print("Enter ID : ");

			No = Integer.parseInt(sc.nextLine());
			int flag=0;

			for (i = 0; i < n; i++) {
				

				if (emp[i].eNo == No) {
					System.out.println(emp[i]);

					flag=1;

					break;

				}
				

			}
			if (flag==0) {
				System.out.println("Invalid ID");
			}
			
		}

	}

}