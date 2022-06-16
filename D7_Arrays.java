package com.company;

public class D7_Arrays {
    /*
    public static int Search(int arr[], int n, int x){
        for(int i=0; i<n; i++){  //here it will traverse the array
            if(arr[i]==x)
                return i;
        }
        return -1; //If element will not found it will return -1.
    }

     */
    public static int[] insert(int arr[], int n, int x, int pos, int cap ) {
        int newarr[] = new int[n+1];
        if (n == cap)
            System.out.println("Array length is same as given position");

        for (int i = 0; i <n+1; i++){
            if (i < pos - 1)
                newarr[i] = arr[i];

            else if(i==pos-1)
                newarr[i]= x;
            else
                newarr[i] = arr[i-1];

        }

        return newarr;
    }



    public static void main (String[]args){

        /*
        int x = 12;
        int position = Search(arr,n,x);
        if(position == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element is found at position: " +(position + 1));
         */
        int arr[] = {10, 15, 5, 12, 20};
        int n = arr.length;
        int x = 3;
        int cap = 8;
        int pos = 3;

        System.out.println("Array before insertion: " );
        for(int i =0; i<n; i++)
            System.out.print(arr[i]+ " ");

        arr = insert(arr, n, x, pos, cap);
        System.out.println("\nNew array : ");
        for(int i =0; i<=n; i++)
            System.out.print(arr[i]+ " ");

            }
        }

