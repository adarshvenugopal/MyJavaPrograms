package factorial;

import java.util.Scanner;

/**
 * Time complexity of this program is O(n)
 * @author Adarsh
 */
public class FactorialRecursive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, j=1;
        System.out.print("Enter an integer number:");
        n = input.nextInt();
        
        System.out.printf("Factorial of number %d is: %d", n , factorial(n));
        System.out.println();
    }

    public static int factorial(int n){
        if(n==0 || n==1)
            return 1;
        return factorial(n-1)*n;
    }
}
