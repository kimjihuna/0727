import java.util.Scanner;

public class abcd {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Employee qwer = new Employee();

		System.out.print("사원번호 : ");
		qwer.empno = sc.nextInt();

		System.out.print("사원이름 : ");
		sc.nextLine();
		qwer.ename = sc.nextLine();

		System.out.print("사원나이 : ");
		qwer.birthYear = sc.nextInt();

		System.out.printf("사원월급 : ");
		qwer.salary = sc.nextInt();

		System.out.print("사원이메일 : ");
		sc.nextLine();
		qwer.email = sc.nextLine();

		System.out.print("사원전화번호 : ");
		qwer.tel = sc.nextLine();
//		sc.nextLine();

		System.out.print("정규직 : ");
		qwer.flag = sc.nextBoolean();

		System.out.printf("사원번호: %d\n", qwer.empno);
		System.out.printf("사원이름: %s\n", qwer.ename);
		System.out.printf("사원나이: %d\n", 2022 - qwer.birthYear);
		System.out.printf("사원월급: %d 만원\n", qwer.salary);
		System.out.printf("사원이메일: %s\n", qwer.email);
		System.out.printf("사원전화번호: %s\n", qwer.tel);
		System.out.printf("정규직: %s\n", qwer.flag);

	}
}

class Employee {
	int empno;
	String ename;
	int birthYear;
	int salary;
	String email;
	String tel;
	boolean flag;
}
