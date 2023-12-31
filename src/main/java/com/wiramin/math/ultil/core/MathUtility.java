/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wiramin.math.ultil.core;

/**
 *
 * @author MyMy
 */
public class MathUtility {

    public static final double PI = 3.1415;

    public static long getFactorial(int n) {
        long result = 1;
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
