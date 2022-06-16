package com.company;

import java.util.ArrayList;

public class D9_Secondlargest {
    // Efficient approach
    static int getsecondLargest(int arr[]){
        ArrayList<Integer> list = new ArrayList<Integer>();
             int n = arr.length;
             int largest = 0, result = -1;
             for(int i=0; i<n; i++){
                 if(arr[i]>arr[largest]) {
                     result = largest;
                     largest = i;
                 }

            else if(arr[i]!=arr[largest]){
                 if(result== -1||arr[i]>arr[result])
                     result = i;

                 }
             }

             return arr[result];

            // return largest;
           // return arr[largest] +arr[res];

    }
    public static void main(String[] args) {
        int arr[] = {5,8,20,12,10,16};


        System.out.println(getsecondLargest(arr));
    }
}
