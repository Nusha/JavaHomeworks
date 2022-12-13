import java.util.Scanner;

public class hw1_1 {
    static int facRec(int num) {
        if (num == 1){

            return 1;
        }
        return num * facRec(num - 1);
    }
    static int facLoopW(int num) {
        int result = 1;
        int i = 1;
        while (i <= num) {
            result *= i;
            ++i;
        }
        return result;
    }
    static int facLoopF(int num) {
        int result = 1;
        for (int i = 1 ; i <= num ; i++) {
            result *= i;
        }
        return result;
    }
    public static void main(String[] args) {
       System.out.print("Input N number:  ");
       Scanner in = new Scanner(System.in);
       int n = in.nextInt();
       in.close();
       /* Calculating T number */
       Integer t = n*(n+1)/2;
       System.out.printf("Triangular number is:  %d",t);
       int fr = facRec(n);
       int frwhile = facLoopW(n);
       int frfor = facLoopF(n);
       /* Calculating factorial using recursion */
       System.out.printf("%nFactorial is: %d, recursive method", fr);
       /* Calculating factorial using while */
       System.out.printf("%nFactorial is: %d, using while method", frwhile);
       /* Calculation factorial using for */
       System.out.printf("%nFactorial is: %d, using for method", frfor);

    }
    }

