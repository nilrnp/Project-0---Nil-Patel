package Calculator;

import java.util.Scanner;

public class Calculator {

	public static Scanner scan = new Scanner(System.in);
	public static int input1 = 0;
	public static int input2 = 0;

	public static void Set_Input1(int input1value) {
		input1 = input1value;
	}

	public static void Set_Input2(int input2value) {
		input2 = input2value;
	}

	public static int Get_input1(int input1value) {
		return input1;
	}

	public static int Get_input2(int input2value) {
		return input2;
	}

	public static void Scan_Input1() {
		System.out.println("Enter the first value: ");
		int input1value = scan.nextInt();
		System.out.println("The first value is " + input1value + "\n");
		Set_Input1(input1value);
	}

	public static void Scan_Input2() {
		System.out.println("Enter the second value: ");
		int input2value = scan.nextInt();
		System.out.println("The second value is " + input2value + "\n");
		Set_Input2(input2value);
	}

	public static int Addition() {
		return (input1 + input2);
	}

	public static int Addition(int num1, int num2) {
		return (num1 + num2);
	}

	public static int Subtraction() {
		return (input1 - input2);
	}

	public static int Subtraction(int num1, int num2) {
		return (num1 - num2);
	}

	public static int Multiplication() {
		return (input1 * input2);
	}

	public static int Multiplication(int num1, int num2) {
		return (num1 * num2);
	}

	public static double Division() {
		double div = (input1 * 1.0 / input2 * 1.0);
		return div;
	}

	public static double Division(int num1, int num2) {
		return ((double) num1 * 1.0 / num2 * 1.0);
	}

	public static int Remainder() {
		return (input1 % input2);
	}

	public static int Remainder(int num1, int num2) {
		return (num1 % num2);
	}

}
