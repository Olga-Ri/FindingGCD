/* Olga Rios  */

import java.util.Scanner;


public class GCD {

    public static void main (String [] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("enter a number: ");
        int m = scan.nextInt();

        System.out.println("enter a second number ");
        int n = scan.nextInt();


        System.out.println("iterative GCD: " + iterativeGcd(m, n));  //calling the methods
        System.out.println("recursive GCD: " + recursiveGcd(m, n));
       
  
        try {                                          //if the user inputs anything that isn't an integer
         int a = scan.nextInt();
         System.out.println(a);
        } catch (Exception e ) {
            System.out.println("Error: The first argument is not a valid integer");   
             }


        }

        public static int iterativeGcd(int m, int n) {

            m = Math.abs(m);
            n = Math.abs(n);

            while ( m > 0) {      
                int rem = n % m;  //to calculate the gcd
                 n = m;
                 m = rem;
                 
                }return n;
            
        }
           

        public static int recursiveGcd(int m, int n) {
            m = Math.abs(m);
            n = Math.abs(n);         //taking the abs of both integers before running through the loop
            if (m == 0) {
              return n;  
            } else {
                int rem = n % m;     //calculating the gcd
                n = m;
                m = rem;
                return recursiveGcd(m , n);
        
            } 
        
        }

}






