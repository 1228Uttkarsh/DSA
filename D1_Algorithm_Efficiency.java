package com.company;
import java.util.Scanner;
public class D1_Algorithm_Efficiency {
    public static void main(String[] args) {
        int n, req_no, flag = 0, i;
        int[] a = {2,4,8,10,12,14,16,20,22,24,26,28,30};
        n = a.length;
        Scanner sc = new Scanner(System.in);
        System.out.println("Number is multiple of 2 lies in between 2-30");
        System.out.println("Enter the number you wish to find at what position");
        req_no = sc.nextInt();
        //Searching the given array
        for (i = 0; i < n; i++) {
            //If required number is found
            if (a[i] == req_no) {
                flag = 1;
                break;
            }
            //If not found
            else {
                flag = 0;
            }
        }
        if (flag == 1) {
            System.out.println("Required number is found at position: " + (i + 1));
        } else {
            System.out.println("Sorry! number is not found.");
        }
    }
}
/*
Case 1:
If the required number is at position at 1 then it is the best case i.e O(n).
Case 2: If the required number is found at position last or required number is not present
in the list then this is called the worst case.
Case 3:
If number is in between the list then it will called as average case 
 */