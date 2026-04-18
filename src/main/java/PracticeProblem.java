import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();		
	}

	public static void q1() {
		//Write question 1 code here
		System.out.println("Input an integer: ");

		Scanner scanner = new Scanner(System.in);

		String a = scanner.nextLine();

		a = "5" + a;

		int aP = Integer.valueOf(a);

		System.out.println(aP+5);
		
	}

	public static void q2() {
		//Write question 2 code here
		System.out.println("Input an Number: ");

		Scanner scanner = new Scanner(System.in);

		String b = scanner.nextLine();

		b = "4" + b + "3";

		Double bP = Double.valueOf(b);

		System.out.println(bP+3.4);
		
	}

	public static void q3() {
		//Write question 3 code here
		System.out.println("Input an Boolean: ");

		Scanner scanner = new Scanner(System.in);

		String c = scanner.nextLine();

		Boolean cP = Boolean.valueOf(c);

		System.out.println(!cP);
		
	}

	public static void q4() {
		//Write question 4 code here
		System.out.println("Input an Integer: ");
		
		Scanner scanner = new Scanner(System.in);

		String d = scanner.nextLine();

		d = d + "3";

		int dP = Integer.valueOf(d);
		
		dP = dP + 2;

		char dW = (char) dP;

		System.out.println(dW);
	}

	public static void q5() {
		//Write question 5 code here
		System.out.println("Input an Integer: ");
		
		Scanner scanner = new Scanner(System.in);

		String e = scanner.nextLine();

		e = e + "1"; 

		int eP = Integer.valueOf(e);

		eP = eP/2;

		double eD = Double.valueOf(eP);

		System.out.println(eD);


		
	}

	public static void q6() {
		//Write question 6 code here
		
		System.out.println("Input an Integer: ");
		
		Scanner scanner = new Scanner(System.in);

		String f = scanner.nextLine();

		f = "1" + f; 

		double fD = Double.valueOf(f);
		int fP = (int) Math.round(fD);
		
		System.out.println(fP);
	}

}
