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
		Scanner input=new Scanner(System.in);
		boolean word;
		System.out.print("Input a boolean: ");
		word=input.nextBoolean();
		System.out.println(word);

		//Write question 1 code here
	}

	public static void q2() {
		Scanner input=new Scanner(System.in);
        int num;
		System.out.print("Input an integer: ");
		num=input.nextInt();
		System.out.println(num>5);
		//Write question 2 code here
	}

	public static void q3() {
		Scanner input=new Scanner(System.in);
		String word;
		System.out.print("Input pizza: ");
		word=input.nextLine();
		System.out.println(word.equals("pizza"));
		//Write question 3 code here
	}

	public static void q4() {
		Scanner input=new Scanner(System.in);
		double num;
		System.out.print("Input a number: ");
		num=input.nextDouble();
		System.out.println(num==0);

		//Write question 4 code here
	}

	public static void q5() {
		Scanner input=new Scanner(System.in);
		int num;
		System.out.print("Input an integer: ");
        num=input.nextInt();
		System.out.println(!(num==0));
		//Write question 5 code here
	}

	public static void q6() {
		Scanner input=new Scanner(System.in);
		String word;
		System.out.print("Input a word earlier than google: ");
		word=input.nextLine();
		System.out.println(word.compareTo("google")<0);

	}

}
