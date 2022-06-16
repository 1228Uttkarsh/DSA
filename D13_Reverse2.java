package com.company;
import java.util.*;
import java.util.ArrayList;

public class D13_Reverse2 {

    //Method for swapping the list element.
     static void swap(ArrayList<Integer>arr, int x, int y){
        int temp = arr.get(x);
        arr.set(x,arr.get(y));
        arr.set(y,temp);
    }
    static void reverseInGroup(ArrayList<Integer>arr,int n, int k){

        for(int i=0; i<n; i+=k){
            int low = i;
            //when k is not multiple of n.
            int high = Math.min(i+k-1,n-1);
            while (low<high){
                swap(arr,low,high);//swap method call here
                low++;
                high--;
            }
        }

    }

        public static void main (String[]args){
            ArrayList<Integer> al = new ArrayList<Integer>();
            al.add(1);
            al.add(2);
            al.add(3);
            al.add(4);
            al.add(5);
            //al.add(6);

            int n = 5;
            int k = 3;
            System.out.println("Array before reverse:");

                System.out.print(al + " ");

            System.out.println();
            reverseInGroup(al, n, k);
            System.out.println("Array after reverse:");

                System.out.print(al + " ");


        }
    }
