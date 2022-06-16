package com.company;
import java.util.Scanner;
/*
An integer value is given to you as an input, and you need to print the pattern for the number of rows given as input. For example:
Sample Input:
5
Sample Output:
*
**
***
****
*****
 */
class RightTriangle{
    static String func(int n){
        if(n<=0)
            return "";
        String res = func(n-1);
        res = res +"*";
        return res;

    }
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
func(n);
    }
}


/*
Calculate power using recursive function.

public class D3_Recursive_function {
    static int powerFunc(int base,int power){
        if(power!=0)
            return base*powerFunc(base,power-1);
        else
            return 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // printing the value of a^b i.e.
        System.out.printf("%d",powerFunc(a,b));
    }
}

 */





/*
Reverse of a string using recursion
 class Main {
    void function(String st) {
        if ((st == null) || (st.length() <= 1))
            System.out.println(st);
        else {
            System.out.print(st.charAt(st.length() - 1));
            function(st.substring(0, st.length() - 1));
        }
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        String s = sc.next();
      Main obj= new Main();
      obj.function(s);
 */


/*
 Write a Java program to calculate the sum of n consecutive natural numbers using recursion.

class Natural{
    static int sum(int n){
        if(n!=0){
            return n+sum(n-1);
        }
        else {
            return n;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if(x>0){
            System.out.println(sum(x));
        }
        else {
            System.out.println(" Enter natural number!");
        }
    }
}
*/