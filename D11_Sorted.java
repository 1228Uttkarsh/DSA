package com.company;

public class D11_Sorted {

    static boolean isSorted(int arr[],int n) {//Time complexity O(n); Auxilary space O(1)
        // no element or has one element
        if(n==1||n==0)
            return true;
// for unsorted
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }
    //naive approach

   /*

    static boolean isSorted1(int arr[],int n){//Time complexity O(n^2). Auxiliary space O(n^2)
        for(int i=0; i<n;i++){
            for(int j=i+1; j<arr.length;j++) {
                if (arr[j] < arr[i])
                    return false;
            }
        }
        return true;
    }
       */

        public static void main (String[]args){
            int arr[] = {1,2,4,8,3};
            int n = arr.length;
            System.out.println(isSorted(arr,n));
            //System.out.println(isSorted1(arr,n));
        }
    }

