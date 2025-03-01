/*
Problem statement
Given an array of length N, you need to find and return the sum of all elements of the array.

Do this recursively.

Sample Input 1 :
3
9 8 9
Sample Output 1 :
26
 */

import java.util.Scanner;

public class SumOfArray{

    static int sum(int arr[], int index) {

        if(index == arr.length) {
            return 0;
        }

        return arr[index] + sum(arr , index+1);
    }
   
    public static void main(String args []){

        Scanner s = new Scanner(System.in);

        int size = s.nextInt();

        int [] arr = new int[size];

        for(int i=0 ; i < size; i++) {
             
            arr[i] = s.nextInt();

        }

        s.close();

        System.out.println("The sum of elements " + sum(arr, 0));

    }

 }