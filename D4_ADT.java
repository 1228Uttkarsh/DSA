package com.company;
import java.util.*;

 class Operations{
   public  static int [] arr = new int[]{12,24,36,48,60,72,84,96,108};
   static void search(){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter number to search: ");
       int num = sc.nextInt();
       for(int j=0;j< arr.length;j++){
           if(arr[j]==num)
               System.out.println(j);
       }
     //    if(j==arr.length)
             System.out.println();




   }
      static int min(){
         int min = arr[0];
        for(int i=0;i< arr.length;i++){
            if(arr[i]<min)
             min = arr[i];
        }
        return min;
       }
      static int max(){
           int max = arr[0];
           for(int i=0;i< arr.length;i++){
               if(arr[i]>max)
                   max = arr[i];
           }
           return max;
       }
     int search(int num) {
         for(int i=0;i< arr.length;i++) {
             if (arr[i] == num);

         }
         return num;
     }
   }



public class D4_ADT {


    public static void main(String[] args) {
        Operations o = new Operations();
       // System.out.println(o.max());
      //  System.out.println(o.min());
        o.search();
    }
}
