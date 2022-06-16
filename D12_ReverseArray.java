package com.company;

public class D12_ReverseArray {
    static void reverse(int arr[], int n){
        int low = 0, high = n-1;
        while(low<high){
            int temp = arr[low];
            arr[low]= arr [high];
            arr[high]= temp;
            low++;
            high--;
          //  System.out.println(arr[high]);
        }


    }
    public static void main(String[] args) {
        int arr[]= {10,5,8,30};
        int n = arr.length;
        System.out.println("Array before reverse:");
        
            System.out.print(arr[i]+" ");
       
        System.out.println();
        reverse(arr,n);
        System.out.println("Array after reverse:");
       
            System.out.print(arr[i]+" ");
        
    }
}
