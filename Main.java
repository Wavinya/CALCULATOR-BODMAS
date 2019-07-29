//package bodmas;

import java.util.Scanner;

//import bodmas.Evaluate.evaluate;
//import bodmas.Validate.validate;

public class Main {

		static Validate val = new Validate();
		static Evaluate eval = new Evaluate();
		
    public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Expression to Evaluate: ");
        String expression = scanner.nextLine();

        char[] tokens = expression.toCharArray();

        char[] validated = val.validate(tokens);

        if (validated[0] == 'E') {
            System.out.println("Review the Expression then Try Again");
        }

        else {
            System.out.println(eval.evaluate(validated));
        }
    }
}
