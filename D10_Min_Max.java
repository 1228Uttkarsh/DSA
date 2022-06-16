package com.company;

import java.util.ArrayList;
class Solution{
    public static ArrayList<Integer> largestAndSecondLargest(int sizeOfArray, int arr[])
    {
        //code here.
        int largest = -1;
        int result = -1;
        ArrayList list = new ArrayList<Integer>();

        for(int i = 0; i < sizeOfArray; i++){
            if(arr[i] > largest){
                result = largest;
                largest = arr[i];
            }
            else if(arr[i] < largest && arr[i] > result)
                result = arr[i];
        }

        list.add(largest);
        list.add(result);
        return list;
    }
}

public class D10_Min_Max {

    public static void main(String[] args) {
        int arr[] = {10,10,10,10,10,10};// 10 -1 is output because there is no second largest element.
        Solution obj = new Solution();

        ArrayList<Integer> a = new ArrayList<Integer>();
        a = obj.largestAndSecondLargest(6,arr);
        System.out.println(a.get(0)+" "+ a.get(1));

    }
}
