import java.util.*;

public class MathDemo {
    public static void main(String aksel[]) {
        Scanner scanner = new Scanner(System.in);
        int result = 0;


	System.out.print("Input the first number: ");
	int num1 = scanner.nextInt();
	
	System.out.print("Input the second number: ");
	int num2 = scanner.nextInt();
	
	System.out.print("Input an operator(+,-,*,/): ");
	char op = scanner.next().charAt(0);

	if(op == '+'){
		result = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + result);

	}
	if(op == '-'){
		result = num1 - num2;
		System.out.println(num1 + " - " + num2 + " = " + result);

	}
	if(op == '*'){
		result = num1 * num2;
		System.out.println(num1 + " * " + num2 + " = " + result);

	}
	if(op == '/'){
		result = num1 / num2;
		System.out.println(num1 + " / " + num2 + " = " + result);

	}

    }
}