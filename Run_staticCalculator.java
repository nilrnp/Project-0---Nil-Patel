package Calculator;

public class Run_staticCalculator {

	public static void main(String[] args) {
		Calculator.Scan_Input1();
		Calculator.Scan_Input2();

		System.out.println("Addition: " + Calculator.Addition());
		System.out.println("Subtraction: " + Calculator.Subtraction());
		System.out.println("Multiplication: " + Calculator.Multiplication());
		System.out.println("Division: " + Calculator.Division());
		System.out.println("Remainder: " + Calculator.Remainder() + "\n");

		System.out.println("Overloaded Static Method");
		System.out.println("Addition: " + Calculator.Addition(10, 15));
		System.out.println("Subtraction: " + Calculator.Subtraction(20, 13));
		System.out.println("Multiplication: " + Calculator.Multiplication(4, 8));
		System.out.println("Division: " + Calculator.Division(20, 5));
		System.out.println("Remainder: " + Calculator.Remainder(7, 30) + "\n");
	}

}
