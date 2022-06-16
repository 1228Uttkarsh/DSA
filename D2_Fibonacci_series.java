package com.company;
import java.util.Scanner;

public class D2_Fibonacci_series {
    int fibonacci(int n){
        if (n<2){
            return n;
        }
        else{
            return (fibonacci(n-1)+fibonacci(n-2))%10;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        D2_Fibonacci_series s = new D2_Fibonacci_series();
        System.out.println(s.fibonacci(x));

    }
}









