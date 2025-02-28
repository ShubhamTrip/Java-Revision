/* 
Problem statement
You have been given an integer array/list(ARR) of size N. Where N is equal to [2M + 1].

Now, in the given array/list, 'M' numbers are present twice and one number is present only once.

You need to find and return that number which is unique in the array/list.

 Note:
Unique element is always present in the array/list according to the given condition.

Sample Input 1:
1
7
2 3 1 6 3 6 2
Sample Output 1:
1
Explanation: The array is [2, 3, 1, 6, 3, 6, 2]. Here, the numbers 2, 3, and 6 are present twice, and the number 1 is present only once. So, the unique number in this array is 1.
Sample Input 2:
2
5
2 4 7 2 7
9
1 3 1 3 6 6 7 10 7
Sample Output 2:
4

*/

import java.util.Scanner;

public class FindUnique {

     public static void main(String args []) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        int [] arr = new int[n];

        for(int i =0 ; i < n; i++) {
            arr[i] = s.nextInt();
        }

        s.close();

        for(int i = 0 ; i < arr.length; i++) {

            boolean isUnique = true;
              
            for(int j = 0; j < arr.length ; j++) {

                if(i == j) {
                    continue;
                }
               
                if(arr[i] == arr[j]) {
                    isUnique = false;
                    break;
                }

            }

            if(isUnique == true) {
                System.out.println(arr[i] + "Is not unique");
            }
        }
     }

}