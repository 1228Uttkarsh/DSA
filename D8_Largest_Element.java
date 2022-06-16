package com.company;

public class D8_Largest_Element {
    //this approach has O(n^2) time complexity.
   /*static int getlargest(int arr[]){
        int n = arr.length;
        for(int i =0; i<n; i++){
            boolean flag = true;
            for(int j=0; j<n; j++){
                if(arr[j]>arr[i]){
                    flag = false;
                    break;
                }
            }
            if(flag==true)
                // return i;   //it will return index of the largest element.
                return arr[i]; //it will return the largest element.
        }
        return -1;
    }

    */

    //Efficient approach. Time complexity is O(n).
    static  int getlargest(int arr[]){
        int result = 0;
        for(int i=0; i<arr.length;i++)
            if(arr[i]>arr[result])
                result =i;
       // return arr[result];
        return arr[result];
    }
    public static void main(String[] args) {
        int [] arr = {30,8,20,10};
        System.out.println(getlargest(arr));

    }
}
