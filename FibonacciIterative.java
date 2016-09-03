package fibonacci;

import java.util.Scanner;

/**
 * Time Complexity of this program is O(n)
 * @author Adarsh
 */
public class FibonacciIterative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Enter an integer number:");
        n = input.nextInt();
        
        System.out.printf("Fibonacci numbers till %d are: ", n);
        printFibonacci(n);
        System.out.println();
    }
    
    public static void printFibonacci(int n){
        if(n < 1)
            return;
        else if(n == 1)
            System.out.printf("%d" , 0);
        else if(n==2)
            System.out.printf("%d %d" , 0 , 1);
        else{
            int first = 0,second = 1, third;
            System.out.printf("%d %d" , first , second);
            for(int i=2;i<n;i++){
                third = first + second;
                System.out.printf(" %d" , third);
                first = second;
                second = third;
            }
        }
    }
    
}
