package com.company;
import java .util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
/*
The difference between two algo used below is:
In algorithm 1, you use only one array variable for registered student IDs and two for loops to iterate across the data
and find duplicate student IDs.However, in algorithm 2, an extra count array variable is declared to keep the count of
the duplicate student IDs, and one for loop is used to iterate through the input data.
 */

public class Main {
      public void findDuplicate(int [] id){
          System.out.println(" Duplicate id:");
          for(int i=0;i<id.length;i++){
              for(int j=i+1;j<id.length;j++){
                  if(id[i]==id[j]){
                      System.out.println(id[i]+" ");
                     break;
                  }
              }
          }
      }
      //Second method of getting duplicate id
  /*  public void findDuplicate2(int []id){
        System.out.println("Duplicate id:");
        int [] count = new int[10000];
        for (int i=0;i<id.length;i++){
            count[id[i]]++;
            if(count[id[i]]==2)
                System.out.println(id[i]+" ");
        }

    }

   */
    public static void main(String[] args) {
        // write your code hereScanner sc = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
                System.out.println("Enter the no of student ids in given database : ");
               int n = sc.nextInt();
             int id[] = getInput(n);
               System.out.println("Student id : ");
               printId(id);
        Main duplicates = new Main();
        duplicates.findDuplicate(id);

    }
    //returns an array of n random numbers
    public static int[] getInput(int n) {
        int input[] = new int[n];
        for (int i = 0; i < n; i++) {
            input[i] = randomNumber(1,2*n);
        }
        return input;
    }

    //returns a random number
    public static int randomNumber(int min, int max) {
        int randomNumber = ThreadLocalRandom.current().nextInt(min, max + 1);//returns a random number in the specified range
        return randomNumber;
    }

    //prints all the values of an array id
    public static void printId(int[] id) {
        for (int i = 0; i < id.length; i++) {
            System.out.print(id[i] + " ");
        }
        System.out.println();
    }
}
