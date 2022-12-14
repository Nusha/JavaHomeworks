// import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
// import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class hw2_2 {
    public static void main(String[] args) throws IOException {
        Logger log = Logger.getLogger(hw2_2.class.getName());
        FileHandler fh = new FileHandler("log.txt", true);
        log.setUseParentHandlers(false);
        log.addHandler(fh);
        SimpleFormatter sf = new SimpleFormatter();
        fh.setFormatter(sf);

        char r = 0;
        System.out.printf("***Simple calculator homework 1 task 3*** %n" +
                "Use standard symbols to perform operations. %n" +
                "For exponentiation use 'p' symbol, to obtain the root use 's' symbol. %n");
        log.info("Program started");
        while (r != 'n') {
            try {
                System.out.print("Input first number: ");
                Scanner in = new Scanner(System.in);

                double a = in.nextDouble();
                log.info("User inputted first number: " + a);

                System.out.print("Input operator (use '+', '-', '*', '/', s(qrt) or p(ow): ");
                char op = in.next().charAt(0);
//        string test = in.findInLine()
                if (op == 's') {
                    log.info("User chose to get root from: " + a );
//                    switch (op) {
//                        case 's':
                    double result = Math.sqrt(a);
                    System.out.println(result);
                    log.info("The result is: " + result);
//                            break;
//                    }
                } else {
                    System.out.print("Input second number: ");
                    double b = in.nextDouble();
                    log.info("User inputted second number: " + b);
                    switch (op) {
                        case '+':
                            double result = a + b;
                            System.out.println(result);
                            log.info("User chose addition " + a + " and " + b);
                            log.info("The result is: " + result);
                            break;
                        case '-':
                            result = a - b;
                            System.out.println(result);
                            log.info("User chose subtraction " + a + " and " + b);
                            log.info("The result is: " + result);
                            break;
                        case '*':
                            result = a * b;
                            System.out.println(result);
                            log.info("User chose multiplication " + a + " and " + b);
                            log.info("The result is: " + result);
                            break;
                        case '/':
                            log.info("User chose division " + a + " and " + b);
                            if (b == 0) {
                                System.out.println("Division by zero.");
                                log.warning("Second operand = " + b + " can not divide by zero.");
                                break;
                            } else {
                                result = a / b;
                                System.out.println(result);
                                log.info("The result is: " + result);
                                break;
                            }
                        case 'p':
                            result = Math.pow(a, b);
                            System.out.println(result);
                            log.info("User chose to take " + a + " to " + b + " power.");
                            log.info("The result is: " + result);
                            break;
                        default:
                            System.out.println("It seems, that you haven't entered valid operator symbol, try again.");
                            log.warning("User hasn't made correct choice of operator the input is: " + op);
                    }
                }
                System.out.println("Input 'y(es)' to resume, or press 'n(o)' to quit");
                r = in.next().charAt(0);
                if (r == 'n') {
                    in.close();
                    log.info("User chose to finish program 'n' pressed. Program is finished.");
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Please input only doubles");
                log.warning("Error. User input is incorrect: only doubles is available.");
            }

        }

    }
}
