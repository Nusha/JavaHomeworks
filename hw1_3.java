
import java.util.Scanner;

public class hw1_3 {
    public static void main(String[] args) {
        char r = 0;
        System.out.printf("***Simple calculator homework 1 task 3*** %n" +
                "Use standard symbols to perform operations. %n" +
                "For exponentiation use 'p' symbol, to obtain the root use 's' symbol. %n");
        while (r != 'n') {
            try {
                System.out.print("Input first number: ");
                Scanner in = new Scanner(System.in);

                double a = in.nextDouble();

                System.out.print("Input operator (use '+', '-', '*', '/', s(qrt) or p(ow): ");
                char op = in.next().charAt(0);
//        string test = in.findInLine()
                if (op == 's') {
//                    switch (op) {
//                        case 's':
                            System.out.println(Math.sqrt(a));
//                            break;
//                    }
                }
                else {
                    System.out.print("Input second number: ");
                    double b = in.nextDouble();
                    switch (op) {
                        case '+':
                            System.out.println(a + b);
                            break;
                        case '-':
                            System.out.println(a - b);
                            break;
                        case '*':
                            System.out.println(a * b);
                            break;
                        case '/':
                            if (b == 0) {
                                System.out.println("Division by zero.");
                                break;
                            } else {
                                System.out.println(a / b);
                                break;
                            }
                        case 'p':
                            System.out.println(Math.pow(a, b));
                        default:
                            System.out.println("It seems, that you haven't entered valid operator symbol, try again.");


                    }
                }
                System.out.println("Input 'y(es)' to resume, or press 'n(o)' to quit");
                r = in.next().charAt(0);
                if (r == 'n') in.close();
            }
            catch(java.util.InputMismatchException e) {
                System.out.println("Please input only doubles");
            }

        }

    }
}
