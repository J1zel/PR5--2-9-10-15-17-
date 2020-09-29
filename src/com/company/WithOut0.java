package com.company;

public class WithOut0 {
    public static int recursion(int a, int b) {
        if (a == 0 || b == 0) {
            return 1;
        }
        if (a > b + 1) {
            return 0;
        }
        return recursion(a, b - 1) + recursion(a - 1, b - 1);
    }
    public static void main(String[] args) {
        System.out.println(recursion(1, 2));
    }
}
