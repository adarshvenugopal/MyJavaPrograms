package factorial;

import java.util.Scanner;

/**
 * Time complexity of this program is O(n)
 * @author Adarsh
 */
public class FactorialIterative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, j=1;
        System.out.print("Enter an integer number:");
        n = input.nextInt();
        
        System.out.printf("Factorial of number %d is: ", n);
        for(int i=2;i<=n;i++)
            j = j * i;
        System.out.print(j);
        System.out.println();
    }    
}
