package numberreverse;

import java.util.Scanner;

/**
 *
 * @author Adarsh
 */
public class NumberReverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, j=1;
        System.out.print("Enter an integer number:");
        n = input.nextInt();
        
        System.out.printf("Reverse of number %d is: %d", n , reverse(n));
        System.out.println();
    }

    public static int reverse(int n){
        
        int reverse = 0, digit;
        
        while(n!=0){
            digit = n%10;
            reverse = reverse*10 + digit;
            n/=10;
        }
        return reverse;
    }
}
