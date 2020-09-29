package com.company;

public class NubmerReverse {
    public static int recursion(int n, int i) {
        return (n==0) ? i : recursion( n/10, i*10 + n%10 ); // если возврат n==0,то i явл значением,иначе recursion( n/10, i*10 + n%10 )
    }
    public static void main(String[] args) {
        System.out.println(recursion(12345, 0));
    }
}
