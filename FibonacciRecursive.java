package fibonacci;

import java.util.Scanner;

/**
 *
 * @author Adarsh
 */
public class FibonacciRecursive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Enter an integer number:");
        n = input.nextInt();
        
        System.out.printf("Fibonacci numbers till %d are: ", n);
        for(int i=1;i<=n;i++)
            System.out.printf("%d ", Fibonacci(i));
        System.out.println();
    }

    public static int Fibonacci(int n){
        if(n == 1)
            return 0;
        else if(n == 2)
            return 1;
        else
            return Fibonacci(n-1) + Fibonacci(n-2);
    }    
}
