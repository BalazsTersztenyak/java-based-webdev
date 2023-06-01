package com.example.pzh.mymath;

public class MyMath {
    public static int fact(int n){
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static int bin(int n, int k){
        int result = 0;
        if (n > 15 || n < 0){
            result = -1;
        }
        else {
            result = fact(n) / (fact(k) * fact(n - k));
        }
        return result;
    }
}
