/*
 Problem statement
You are given a number 'n'.



Return number of digits in ‘n’.



Example:
Input: 'n' = 123

Output: 3

Explanation:
The 3 digits in ‘123’ are 1, 2 and 3. 

Sample Input 1:
121


Sample Output 1:
3


Explanation of sample output 1:
There are 3 digits in 121 are 1,2 and 1.


Sample Input 2:
38


Sample Output 2:
2
 */

import java.util.Scanner;

public class NoOfDigits {

    static int countDig(int n) {
            
        if(n % 10 == 0) {
            return 0;
        }

        return countDig( n / 10 ) + 1;

    }
    
    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        s.close();

        System.out.println("No of Digits are " + countDig(n));

    }

}