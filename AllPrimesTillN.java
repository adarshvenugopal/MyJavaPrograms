/*
All Primes Till N Using Sieve of Eratosthenes
*/

package allprimestilln;

import java.util.Scanner;

/**
 *
 * @author Adarsh
 */
public class AllPrimesTillN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Enter an integer number:");
        n = input.nextInt();
        
        System.out.printf("Prime Numbers upto %d are: ", n);
        primesTillN(n);
        System.out.println();
    }

    public static void primesTillN(int n){
        if(n<2)
            return;
        
        int[] Primes = new int[n+1];
        for(int i=0;i<=n;i++)
            Primes[i] = 1;
        
        Primes[0] = Primes[1] = 0;
        
        for(int i=2; i<Math.sqrt((double)n); i++){
            for(int j=2;i*j<=n;j++){
                Primes[i*j] = 0;
            }
        }
        
        for(int i=0;i<=n;i++){
            if(Primes[i] == 1)    
                System.out.printf("%d ", i);
        }
        
    }
}
