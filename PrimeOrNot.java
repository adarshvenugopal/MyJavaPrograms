package primeornot;

import java.util.Scanner;

/**
 * Time Complexity of this program is O(√n)
 * @author Adarsh
 */
public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Enter an integer number:");
        n = input.nextInt();
        
        System.out.printf("%d %s a prime number", n, isPrime(n) ? "is" : "is not");
        System.out.println();
    }
    
    public static boolean isPrime(int n){
        
        if(n<2)
            return false;
        
        for(int i=2;i<Math.sqrt((double)n);i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
    
}
