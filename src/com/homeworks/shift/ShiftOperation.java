package com.homeworks.shift;

public class ShiftOperation {
    public static void main(String[] args) {
        int a = 5;
        System.out.println(a + " = " + Integer.toBinaryString(a));
        int b = a << 2;
        System.out.println(b + " = " + Integer.toBinaryString(b));
        int c = b >> 1;
        System.out.println(c + " = " + Integer.toBinaryString(c));

        // Operations with negative numbers

        int d = -9;
        System.out.println(d + " = " + Integer.toBinaryString(d));
        int e = d << 2;
        System.out.println(e + " = " + Integer.toBinaryString(e));
        int f = e >> 1;
        System.out.println(f + " = " + Integer.toBinaryString(f));
        // >>>
        int g = f >>> 1;
        System.out.println(g + " = " + Integer.toBinaryString(g));

    }
}

